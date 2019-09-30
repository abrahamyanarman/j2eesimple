package servlets;


import jpa.entities.User;
import jpa.util.CRUDOperations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {

    User user = null;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/addUser.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {


        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean showUser = Boolean.parseBoolean(req.getParameter("showPassword"));


            user= new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println(showUser);
        CRUDOperations.insertEntity(user);
        req.setAttribute("message","Success!");
        }catch (Exception e){
            req.setAttribute("message","Wrong Data!");
            e.printStackTrace();
        }


       resp.sendRedirect(req.getContextPath()+"");


    }
}
