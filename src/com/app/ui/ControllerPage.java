package com.app.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ControllerPage", urlPatterns={"/contacto.html", "/registro.html"})
public class ControllerPage extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		
		String url="";			
		String requestURI = request.getRequestURI();
		if(requestURI.endsWith("/contacto.html")){
			url = "/contacto.jsp";
		}else if(requestURI.endsWith("/registro.html")){
			url = "/registro.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
}
