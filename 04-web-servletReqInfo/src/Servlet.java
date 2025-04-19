import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. Get the request method
        String method = req.getMethod();
        System.out.println("Request Method: " + method);

        String scheme = req.getScheme();
        System.out.println("Request Scheme: " + scheme);

        // 2. Get the request URI
        String requestURI = req.getRequestURI();
        System.out.println("Request URI: " + requestURI);

        // 2.1 Get the request URL
        String requestURL = req.getRequestURL().toString();
        System.out.println("Request URL: " + requestURL);

        // 3. Get the query string
        String queryString = req.getQueryString();
        System.out.println("Query String: " + queryString);

        // 4. Get the request protocol
        String protocol = req.getProtocol();
        System.out.println("Request Protocol: " + protocol);

        // 5. Get the request headers
        String headerName = "User-Agent";
        String headerValue = req.getHeader(headerName);
        System.out.println("Header [" + headerName + "]: " + headerValue);

        String localAddr = req.getLocalAddr();
        System.out.println("Local Address: " + localAddr);
        String localName = req.getLocalName();
        System.out.println("Local Name: " + localName);
        int localPort = req.getServerPort(); // 客户端发请求使用的端口
        System.out.println("server Port: " + localPort);
        int remotePort = req.getRemotePort(); // 客户端软件的端口
        System.out.println("Remote Address: " + remotePort);

        resp.getWriter().write(String.format(
                """
                        method: %s
                        requestURI: %s
                        requestURL: %s
                        queryString: %s
                        protocol: %s
                        headerName: %s
                        headerValue: %s
                        scheme: %s
                        localAddr: %s
                        localName: %s
                        serverPort: %d
                        remotePort: %d
                        """,
                method, requestURI, requestURL, queryString, protocol, headerName, headerValue,
                scheme, localAddr, localName, localPort, remotePort
        ));

    }
}
