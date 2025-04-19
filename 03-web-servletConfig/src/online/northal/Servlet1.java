package online.northal;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


@WebServlet(
        urlPatterns = "/servlet1",
        initParams = {@WebInitParam(name = "param1", value = "value1"), @WebInitParam(name = "param2", value = "value2")}
)
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        // context
        ServletContext servletContext = getServletContext();
        String encoding = servletContext.getInitParameter("encoding");

        String param1 = config.getInitParameter("param1");
        String param2 = config.getInitParameter("param2");

        System.out.println("param1: " + param1);
        System.out.println("param2: " + param2);

        // 获取全部
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String name = initParameterNames.nextElement();
            String value = config.getInitParameter(name);
            System.out.println("全部：" + name + ": " + value);
        }

        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Servlet1</h1>");
        resp.getWriter().println("<p>param1: " + param1 + "</p>");
        resp.getWriter().println("<p>param2: " + param2 + "</p>");
        resp.getWriter().println("<p>encoding: " + encoding + "</p>");
        resp.getWriter().println("</body></html>");
        resp.getWriter().flush();
        resp.getWriter().close();
    }
}
