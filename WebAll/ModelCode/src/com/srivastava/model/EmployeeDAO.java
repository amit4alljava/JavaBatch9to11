package com.srivastava.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@ManagedBean
public class EmployeeDAO {
	private Connection getConnection() throws NamingException, SQLException{
		
		InitialContext context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup("java:jboss/datasources/empDS");
		Connection connection = dataSource.getConnection();
		return connection;
	}
	 public List<EmployeeDTO> searchEmployee(EmployeeDTO empDTO) throws SQLException, NamingException{
		 List<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();
		 Connection con = null;
		 PreparedStatement pstmt = null;
		 EmployeeDTO empObject = null;
		 ResultSet rs = null;
		 try
		 {
			 con = this.getConnection();
			 pstmt= con.prepareStatement("select id, name,salary from employee where salary>=?");
			 pstmt.setDouble(1, empDTO.getSalary());
			 rs = pstmt.executeQuery();
			 while(rs.next()){
				 empObject = new EmployeeDTO();
				 empObject.setId(rs.getInt("id"));
				 empObject.setName(rs.getString("name"));
				 empObject.setSalary(rs.getDouble("salary"));
				 empList.add(empObject);
				 
			 }
		 }
		 finally{
			 if(rs!=null){
				 rs.close();
			 }
			 if(pstmt!=null){
				 pstmt.close();
			 }
			 if(con!=null){
				 con.close();
			 }
		 }
		 return empList;
	 }
}
