package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import beans.User;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
	    
	    if(userdao.findname(user) ) {
      	     request.setAttribute("info", "用户名已存在");  
      	     response.sendRedirect(path+"/views/Fregister.html");
      	   request.getSession().setAttribute("user", "aaa");
	      }
	    else{	
		     boolean flag=userdao.add(user);
		     if(flag){
		         request.getSession().setAttribute("username", username);	
		         response.sendRedirect(path+"/views/Regout.html");
		         request.getSession().setAttribute("user", "aaa");
		     }	    
		}
	    }  // end service

}
