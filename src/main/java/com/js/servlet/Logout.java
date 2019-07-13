package com.js.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("User " + req.getRemoteUser() + "has been logged out.");
        req.getSession().invalidate();

        resp.setContentType("text/html");


        writer.println("<form method=\"GET\" action=\"books\">\n" +
                "<input type=\"submit\" value=\"Show List Of Books.\" />" +
                "</form>");
    }
}
