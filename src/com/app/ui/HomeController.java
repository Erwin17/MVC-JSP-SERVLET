package com.app.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="HomeController",  loadOnStartup=1, urlPatterns={"", "/index.html"})
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{		
		String url="/index.jsp";			
		System.out.println("Se levanto la Pagina de inicio");
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	
}
