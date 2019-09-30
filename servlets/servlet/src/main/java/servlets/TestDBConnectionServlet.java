package servlets;



import jpa.util.JpaUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestDBConnectionServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (JpaUtil.isConnected()) {
            resp.setHeader("message", "Success!");
        } else {
            resp.setHeader("message", "Error!");
        }


    }
}
