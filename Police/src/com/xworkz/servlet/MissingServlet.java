package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/missing", loadOnStartup = 1)
public class MissingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        req.setAttribute("missingName", req.getParameter("missingName"));
        req.setAttribute("complainteeMobile", req.getParameter("complainteeMobile"));
        req.setAttribute("age", req.getParameter("age"));
        req.setAttribute("address", req.getParameter("address"));
        req.setAttribute("location", req.getParameter("location"));
        req.setAttribute("marks", req.getParameter("marks"));
        req.setAttribute("gender", req.getParameter("gender"));
        req.setAttribute("lang", req.getParameter("lang"));

        req.getRequestDispatcher("missingpersonresult.jsp").forward(req, res);
    }
}
