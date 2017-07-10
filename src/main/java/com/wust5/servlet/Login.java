package com.wust5.servlet;
import java.io.IOException;
 
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

public class Login {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	        request.getRequestDispatcher("/images/register/r5.png").forward(request, response);
	    }
	     public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	         doGet(request, response);
	    }
	 
}
