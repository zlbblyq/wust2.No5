package com.wust5.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        String us = request.getParameter("username");
        String pw = request.getParameter("password");
        String pw1 = request.getParameter("password1");
        //判断是否正确接收
                if(us != null && pw != null && pw1 != null)
                {
                    if(!us.equals(""))
                    {
                
                    if(pw.equals(pw1))
                    {
                        //记录用户信息
                        
                        //跳转到系统主页面
                        response.sendRedirect("Main.jsp");
                        
                    }
                    else
                    {
                        //否则就提示登录错误
                        response.getWriter().write("请输入相同的密码");
                    }
                    }
                    else
                    {
                        response.getWriter().write("帐号或密码不能为空字符串");
                    }
                }
                else
                {
                    response.getWriter().write("请正确输入您的信息");
                }
            
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

	
	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
		

		
	

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
