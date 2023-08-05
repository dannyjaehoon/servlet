package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override // ctrl+o 로 생성가능
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("request : " + req);
        System.out.println("response : " + resp);

        String username = req.getParameter("username");
        System.out.println("username : " + username);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");

        resp.getWriter().write("hello " + username);

    }
}
