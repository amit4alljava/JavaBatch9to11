package com.srivastava.onlineapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srivastava.onlineapp.dao.ProductDAO;
import com.srivastava.onlineapp.dto.ProductDTO;
import com.srivastava.onlineapp.filter.SessionCheckFilter;
import com.srivastava.onlineapp.listener.SessionCountListener;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome.online")
public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
//		if(session==null){
//			response.sendRedirect("home");
//		}
//		else{
			ArrayList<ProductDTO> productList = null;
			ProductDAO productDAO =new ProductDAO();
			try {
				productList	 = productDAO.getProducts();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				response.sendRedirect("error.html");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				response.sendRedirect("error.html");
				e.printStackTrace();
			}
			
			String userid = request.getParameter("userid");
			//int bill =0;
			String bill = request.getParameter("bill");
//			if(request.getAttribute("bill")!=null){
//			 bill = (Integer)request.getAttribute("bill");
//			}
			//String userid = (String)session.getAttribute("userid");
			String productHTML = "";
			if(productList!=null && productList.size()>0){
				String li = "";
				
				for(ProductDTO product : productList){
					String liHTML = "<li>"+product.getId()
					+" "+product.getName()+" "+product.getDesc()+
					"<BR> <img src='"+product.getImage()+"'>"
					+"<BR> "+product.getPrice()+"</li>";
					li = li + liHTML;
				}
				productHTML = "<ul>"+li+"</ul>";
			}
			String message = (String)this.getServletContext().getAttribute("message");
			String branch = request.getParameter("branch");
			String urlWithSessionId = response.encodeURL("logout.online");
			String logout = "Message is  "+message+" Branch "+branch+" Session Count "+SessionCountListener.getCounter() 
					+ "Welcome "+userid +" and Bill is "+bill +"<br>"
					+ "<form action='"+urlWithSessionId+"'>"
					//+ "<form action='logout'>"
					+ "<button type='submit'>Logout</button>"
					+ productHTML
					
					+ "</form>";
			
		//	session.setMaxInactiveInterval(10*60);
			
		response.setContentType("text/html");	
		RequestDispatcher rd = request.getRequestDispatcher("HeaderServlet");
		rd.include(request, response);
		out.println(logout);
		RequestDispatcher rd2 = request.getRequestDispatcher("FooterServlet");
		rd2.include(request, response);
		response.setHeader("Cache-control", "no-cache, no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "-1");
		//response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT");
		//}
		out.close();
		}

}



