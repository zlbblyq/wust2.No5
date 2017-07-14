package com.wust2filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	HttpServletRequest her=(HttpServletRequest)request;
	HttpServletResponse hresp=(HttpServletResponse) response;
	HttpSession session = her.getSession();
	String url=her.getRequestURI();

	String user = (String) session.getAttribute("user");
	     // 登陆页面无需过滤
	        if(url.indexOf("/Register.html") > -1||url.indexOf("/Book.html") > -1||url.indexOf("/Admin.html") > -1||url.indexOf("/Login.html") > -1) {
	        	 chain.doFilter(request, response);
	        }
	        // 判断如果没有取到用户姓名,就跳转到登陆页面
	        else if (user== null || "".equals(user)) {
	             // 跳转到登陆页面
	        	 hresp.sendRedirect(her.getContextPath()+"/views/Book.html");
	           
         } else {
	             // 已经登陆,继续此次请求
	            chain.doFilter(request, response);
         }
	       
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	
		
	}

}
