package com.srivastava.onlineapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srivastava.onlineapp.dao.ProductDAO;
import com.srivastava.onlineapp.dto.ProductDTO;

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
			String userid = (String)session.getAttribute("userid");
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
			String logout = "<html><body>"
					+ "Welcome "+userid +"<br>"
					+ "<form action='logout'>"
					+ "<button type='submit'>Logout</button>"
					+ productHTML
					
					+ "</form></body></html>";
			
		//	session.setMaxInactiveInterval(10*60);
			
		out.println(logout);
		
		}
		out.close();
		}

}
