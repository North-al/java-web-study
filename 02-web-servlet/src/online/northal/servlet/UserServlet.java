package online.northal.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        System.out.println(username);
//
//        resp.setHeader("Content-Type", "text/html");
//        resp.getWriter().write("<h1>" + username + "</h1>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);

        resp.setHeader("Content-Type", "text/html");
        resp.getWriter().write("<h1>" + username + "</h1>");
    }
}
