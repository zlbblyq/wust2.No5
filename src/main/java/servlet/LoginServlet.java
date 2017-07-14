package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import beans.User;

public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String username =request.getParameter("username");
		String password = request.getParameter("password");
		String path = request.getContextPath();   //获取请求路径
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
	    UserDao userdao=new UserDao();
	    out.print(request.getParameter("username"));
	    out.print(request.getParameter("password"));
      
	    if(userdao.check(user)){	    
      	     request.setAttribute("info", "登陆成功");     	        
      	     response.sendRedirect(path+"/views/Logout.html");	
      	   request.getSession().setAttribute("user", "aaa");
	    }	 	   
	    else if(!userdao.checkname(user)){	    
     	     request.setAttribute("info", "用户没有注册");     	        
     	     response.sendRedirect(path+"/views/Flogin1.html");	         
	    }	 	
	    else{
	         request.getSession().setAttribute("err", "登录失败");
	         response.sendRedirect(path+"/views/Flogin2.html");
	     
	    }
	    }

}
