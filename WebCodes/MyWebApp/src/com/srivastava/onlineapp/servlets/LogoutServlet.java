package com.srivastava.onlineapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout.online")
public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		ServletContext context = this.getServletContext();
		String email = context.getInitParameter("customersupport");
//		if(session == null){
//			response.sendRedirect("home");
//		}
//		else
//		{
			session.removeAttribute("userid");
			session.invalidate();
			PrintWriter out = response.getWriter();
			String message = (String)this.getServletContext().getAttribute("message");
			out.println("You Logout SuccessFully...."+message+" Email is "+email);
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			out.close();
		//}
	}

}





