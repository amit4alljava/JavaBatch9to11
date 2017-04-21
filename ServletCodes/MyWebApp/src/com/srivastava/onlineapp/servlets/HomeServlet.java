package com.srivastava.onlineapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private int counter;
	@Override
	public void init(){
		counter = 1;
		System.out.println("Counter is "+counter+" in init");
	}
	
	private String buildLogin(String msg){
		String design = "";
		design = "<!DOCTYPE html><html lang='en'><head>"
				+ "<title>Login</title></head>"
				+"<body><span style='color:red'>"+msg+"</span><br>"
				+ "<form action='home' method='post'>"
				+"<table> <tr> "
				+" <td><label for=''>Userid</label></td>"
				+"<td><input required name='userid' type='text' placeholder='Type Userid'></td>"
			+"</tr><tr><td><label for=''>Password</label></td> "
			+"	<td><input required name='pwd' type='password' placeholder='Type Password'></td> </tr><tr> "
			+"	<td><button>Login</button></td> "
			+"	<td><button>Reset</button></td></tr></table> "
	+" </form></body> </html>";
		return design;
	}
	
	@Override
	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) 
					throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String password = request.getParameter("pwd");
		if(userid.equals(password)){
			// Create a New Session 
			HttpSession session = request.getSession(true);
			session.setAttribute("userid", userid);
			response.sendRedirect("welcome");
		}
		else
		{
			PrintWriter out = response.getWriter();
			
			out.println(this.buildLogin("invalid userid or password"));
			out.close();
		}
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request
			, HttpServletResponse response) 
					throws ServletException, IOException {
		System.out.println("DoGet Call Again and Again "+counter);
		PrintWriter out = response.getWriter();
		out.println(this.buildLogin(""));
		//out.println("<html><body>");
		//out.println("<h1>Welcome User "+counter+" </h1>");
		//counter++;
		//out.println("</body></html>");
		out.close();
		
	}

}
