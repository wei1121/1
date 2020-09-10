package com.jin.weeklyreport;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Register extends HttpServlet{
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
       // doGet(request,response);
    	response.sendRedirect("yemian.jsp");
    }
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
//        doPost(request,response);
        request.getRequestDispatcher("/register.jsp").forward(request,response);
    }
}
