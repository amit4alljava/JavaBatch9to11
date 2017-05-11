package com.srivastava.views;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srivastava.beans.MyCalcBeanRemote;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	@EJB
	MyCalcBeanRemote remote;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = remote.add(100, 200);
		PrintWriter out = response.getWriter();
		out.println("Sum is "+sum);
		out.close();
	}

}
