package com.example.cryptotracker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

@WebServlet("/cryptotracker/data/*")
public class CryptoDataServlet extends HttpServlet {
    private static final String COINGECKO_API = "https://api.coingecko.com/api/v3";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*"); // For local testing

        String pathInfo = req.getPathInfo();
        String currency = req.getParameter("currency") != null ? req.getParameter("currency").toLowerCase() : "usd";

        System.out.println("Request URL: " + req.getRequestURL() + "?" + req.getQueryString()); // Debug log

        try {
            String apiUrl;
            if (pathInfo != null && pathInfo.equals("/chart")) {
                String coinId = req.getParameter("coinId");
                if (coinId == null || coinId.isEmpty()) {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().print("{\"error\":\"Missing coinId parameter\"}");
                    return;
                }
                apiUrl = COINGECKO_API + "/coins/" + coinId + "/market_chart?vs_currency=" + currency + "&days=7";
            } else {
                apiUrl = COINGECKO_API + "/coins/markets?vs_currency=" + currency + "&order=market_cap_desc&per_page=100&page=1&sparkline=false";
            }

            System.out.println("Fetching API: " + apiUrl); // Debug log

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(7000);
            conn.setReadTimeout(7000);

            int status = conn.getResponseCode();
            InputStream inputStream;

            if (status >= 200 && status < 300) {
                inputStream = conn.getInputStream();
            } else {
                inputStream = conn.getErrorStream();
                String errorMessage = inputStream != null ? new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining()) : "Unknown error";
                resp.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
                resp.getWriter().print("{\"error\":\"Failed to fetch data from CoinGecko API. Status: " + status + ", Message: " + errorMessage + "\"}");
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder responseContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();
            conn.disconnect();

            resp.getWriter().print(responseContent.toString());

        } catch (Exception e) {
            e.printStackTrace();
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            resp.getWriter().print("{\"error\":\"Internal error: " + e.getMessage() + "\"}");
        }
    }
}