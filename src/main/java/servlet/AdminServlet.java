package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Admin;

import dao.UserDao;

public class AdminServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String adminname =request.getParameter("adminname");
		String pwd = request.getParameter("pwd");
		
		String path = request.getContextPath();   //获取请求路径
		Admin admin=new Admin();		
		admin.setAdminname(adminname);
		admin.setPwd(pwd);		
	    UserDao userdao=new UserDao();
	    out.print(request.getParameter("adminname"));
	    out.print(request.getParameter("pwd"));
	    
	    if(userdao.admin(admin)){	 
     	     request.setAttribute("info", "登陆成功");     	        
<<<<<<< HEAD
     	     response.sendRedirect(path+"/views/Adminout.html");	
     	    request.getSession().setAttribute("user", "aaa");

=======
     	     response.sendRedirect(path+"/views/Adminout.html");
     	    request.getSession().setAttribute("user", "aaa");
>>>>>>> branch 'master' of https://github.com/zlbblyq/wust2.No5.git
	    }
	    else{
	         request.getSession().setAttribute("err", "登录失败");
	         response.sendRedirect(path+"/views/Fadmin.html");
	    }
	}
}
	



