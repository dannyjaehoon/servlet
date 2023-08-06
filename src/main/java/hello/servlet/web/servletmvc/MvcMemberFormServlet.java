package hello.servlet.web.servletmvc;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); //controller에서 뷰로 옴겨갈때 필요함
        dispatcher.forward(request, response); // 다른 서블릿이나 jsp로 이동할수있는 기능이다. 서버 내부에서 다시 호출이 발생한다.

        // redirect, forward의 차이
        // 라다이렉트는 실제 클라이언트에 응답이 나갔다가, 클라이언트가 redirect경로로 다시 요청한다. 따라서 클라이언트가 인지할수있고 url경로도 변경된다.
        // forward는 서버 내부에서 일어나는 호출이기때문에 클라이언트가 모름
    }
}
