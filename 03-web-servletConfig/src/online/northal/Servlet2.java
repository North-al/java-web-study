package online.northal;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String path = servletContext.getRealPath("upload");
        System.out.println("path: " + path);

        String contextPath = servletContext.getContextPath();
        System.out.println("contextPath: " + contextPath);

        servletContext.setAttribute("contextPath", contextPath);
    }
}
