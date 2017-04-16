package com.srivastava.onlineapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if(session==null){
			response.sendRedirect("home");
		}
		else{
		String userid = (String)session.getAttribute("userid");	
		out.println("Welcome "+userid);
		}
		out.close();
		}

}
