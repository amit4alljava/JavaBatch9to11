package com.srivastava.onlineapp.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */

public class ConfigServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		String email = context.getInitParameter("customersupport");
		
		ServletConfig sc = this.getServletConfig();
		String url = sc.getInitParameter("dburl");
		response.getWriter().println("URL is "+url+" email is "+email);
	}

}
