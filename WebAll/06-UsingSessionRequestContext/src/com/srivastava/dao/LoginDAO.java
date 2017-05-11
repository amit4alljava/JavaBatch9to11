package com.srivastava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import com.srivastava.actions.UserDTO;

public class LoginDAO {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/struts_db","root","root");

	return con;
	}
	
	public boolean authenicateLogin(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs  = null;
		boolean isFound = false;
		try
		{
			con = this.getConnection();
			pstmt = con.prepareStatement("select userid, password from users where userid=? and password=?");
			pstmt.setString(1,userDTO.getUserid());
			pstmt.setString(2,userDTO.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()){
				isFound = true;
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
		return isFound;
	}

}
