package com.pizza;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order")
public class PizzaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        boolean veg = Boolean.parseBoolean(request.getParameter("veg"));
        String type = request.getParameter("type");
        boolean addCheese = request.getParameter("cheese") != null;
        boolean addToppings = request.getParameter("toppings") != null;
        boolean takeAway = request.getParameter("takeaway") != null;

        Pizza pizza;

        if ("deluxe".equals(type)) {
            pizza = new DeluxePizza(veg);
        } else {
            pizza = new Pizza(veg);
            if (addCheese) pizza.addExtraCheese();
            if (addToppings) pizza.addExtraToppings();
        }

        if (takeAway) pizza.takeAway();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html><html><head><title>Pizza Bill</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head><body class='bg-light'>");

        out.println("<div class='container mt-5'>");
        out.println("<div class='card shadow'>");
        out.println("<div class='card-header bg-success text-white text-center'><h3> Your Pizza Bill</h3></div>");
        out.println("<div class='card-body'>");
        out.println(pizza.getBill());
        out.println("<a href='index.html' class='btn btn-danger mt-3'>Order Another</a>");
        out.println("</div></div></div>");

        out.println("</body></html>");
    }
}
