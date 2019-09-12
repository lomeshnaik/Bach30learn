package JavaLearn.bach30.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/helloworldcontroller")
public class HelloWorldController extends HttpServlet {

    public HelloWorldController(){
        System.out.println("The is a constructor");
    }

    @Override
    public void init() throws ServletException{
        System.out.println("it is a init Method");
    }

    public void destroy() {
        System.out.println("Tis is a Destroy method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("helloworld.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
