package com.app.ui;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName="pageListener", urlPatterns={"*.jsp"})
public class NotFoundJSP implements Filter{

	@Override
	public void init(FilterConfig config){
		
	}
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filter)throws IOException, ServletException{	
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
			response.sendError(404);		
			filter.doFilter(request, response);
	}
	
	@Override
	public void destroy(){}
	
}
