package com.lhn.tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AccessInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		String url=request.getRequestURI();
		HttpSession session=request.getSession();
		
		if(url.indexOf("/fore/login")>0) {
			return true;
		}else if(url.indexOf("/register")>0) {
			return true;
		}else if(url.indexOf("/productlist")>0) {
			return true;
		}else if(url.indexOf("/details")>0) {
			return true;
		}else if(url.indexOf("/back/login-admin")>0) {
			return true;
		}
		
		if(session.getAttribute("username")!=null) {
			if(url.indexOf("/fore")>0) {
				return true;
			}
		}else{
			if(url.indexOf("/fore")>0) {
				response.sendRedirect("login.html");
			}
		}
		
		if(session.getAttribute("uname")!=null) {
			if(url.indexOf("/back")>0) {
				return true;
			}
		}else{
			if(url.indexOf("/back")>0) {
				response.sendRedirect("login-admin.html");
			}
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
