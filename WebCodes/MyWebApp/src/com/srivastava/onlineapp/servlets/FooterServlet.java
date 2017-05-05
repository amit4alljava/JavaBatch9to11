package com.srivastava.onlineapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FooterServlet
 */
@WebServlet("/FooterServlet")
public class FooterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h2>Copy Right , Terms and Conditions</h2>");
		out.println("</body></html>");
		System.out.println("Footer Call");
		//out.close();
	}

}
