package com.srivastava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Scanner;

import java.sql.PreparedStatement;

public class UserDAO {
	private static ResourceBundle rb ;
	static{
		rb = ResourceBundle.getBundle("db");
	}
	private static String getValue(String key){
		return rb.getString(key);
		//String value = rb.getString(key);
		//return value;
	}
	
	public static Connection createConnection() throws ClassNotFoundException, SQLException{
		// Step - 1
		// Load the DB Driver
		// oracle - oracle.jdbc.driver.OracleDriver (ojdbc.jar)
		// mysql - com.mysql.jdbc.Driver (mysql-connector.jar)
		Class.forName("com.mysql.jdbc.Driver");
		//String url = "jdbc:mysql://localhost:3306/onlineapp";
		String url = getValue("dburl");
		String userid = getValue("userid");
		String password = "";
		// Step - 2 Create DB Connection
		//MYSQLPORT - 3306 , ORACLEPORT - 1521
		// URL - jdbc:mysql://IP:MYSQLPORT/DBNAME
		// jdbc:oracle:thin:@IP:ORACLEPORT:DBNAME
		
		Connection connection = DriverManager.
				getConnection(url,userid,password);
//		if(connection!=null){
//			System.out.println("Connection Created...");
//			connection.close();
//		}
		return connection;
	}
	
	public static  String addUser(String userid, String password, String pinCode) throws ClassNotFoundException, SQLException{
		Connection connection = null;
		Statement stmt = null; // Query 
		PreparedStatement pstmt = null;
		try{
		connection = createConnection();
		pstmt = connection
				.prepareStatement("insert into "
						+ "user_data values(?,?,?");
		pstmt.setString(1, userid);
		pstmt.setString(2, password);
		pstmt.setInt(3, Integer.parseInt(pinCode));
		int rowUpdated = pstmt.executeUpdate();
		//stmt = connection.createStatement();
//		int rowUpdated = stmt.executeUpdate("insert into "
//				+ "user_data values('"+userid+"','"+password+"',"+pinCode+")");
		return rowUpdated>0?"Record Added":"Record Not Added";
		}
		finally{
			if(pstmt!=null){
			pstmt.close();
			}
			if(connection!=null){
			connection.close();
			}
		}
		
	}
	
	public static String getUsers(String userid, String password, String pinCode) throws SQLException, ClassNotFoundException{
		//String sql = "select * from user_info where userid='ram' and password='1234';"
	// Step -1 Connection
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // Store the Query (Select Result) Record
		try{
		con = createConnection();
		pstmt = con.prepareStatement("select * from user_data where userid =? and password =? and pincode=?");
		pstmt.setString(1, userid);
		pstmt.setString(2, password);
		pstmt.setInt(3, Integer.parseInt(pinCode));
		//stmt = con.createStatement();
		rs = pstmt.executeQuery();
				
		//rs = stmt.executeQuery("select * from user_data where userid='"+userid+"' and password='"+password+"' and pincode="+pinCode);
		return rs.next()?"Welcome "+userid:"Invalid Userid or Password";
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
				
			}
			if(con!=null){
				con.close();
			}
		}
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//String result = UserDAO.addUser("ram", "1234");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.nextLine();
		System.out.println("Enter the Password ");
		String pwd = scanner.nextLine();
		System.out.println("Enter the Pincode");
		String pincode = scanner.nextLine();
		String result = UserDAO.getUsers(userid, pwd,pincode);
		System.out.println(result);
		// TODO Auto-generated method stub
		//UserDAO.createConnection();

	}

}
