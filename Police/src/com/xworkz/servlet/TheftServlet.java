package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/theft", loadOnStartup = 1)
public class TheftServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        req.setAttribute("name", req.getParameter("name"));
        req.setAttribute("mobile", req.getParameter("mobile"));
        req.setAttribute("age", req.getParameter("age"));
        req.setAttribute("address", req.getParameter("address"));
        req.setAttribute("location", req.getParameter("location"));
        req.setAttribute("item", req.getParameter("item"));
        req.setAttribute("lostOn", req.getParameter("lostOn"));

        req.getRequestDispatcher("theftresult.jsp").forward(req, res);
    }
}
