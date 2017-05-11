package com.srivastava.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srivastava.model.EmployeeDTO;
import com.srivastava.model.EmployeeModelRemote;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/empcontroller")
public class EmployeeController extends HttpServlet {
	@EJB
	EmployeeModelRemote empModel;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setSalary(4444);
		try {
			List<EmployeeDTO> empList = empModel.searchEmployee(empDTO);
			PrintWriter out = response.getWriter();
			out.println("EmpList "+empList);
			out.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
