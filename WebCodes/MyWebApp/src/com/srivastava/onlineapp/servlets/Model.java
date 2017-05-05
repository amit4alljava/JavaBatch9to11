package com.srivastava.onlineapp.servlets;

import static com.srivastava.onlineapp.dao.ResourceBundleReader.getValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.PreparedStatement;
import com.srivastava.onlineapp.dto.ProductDTO;

public class Model {
	
	public ArrayList<ProductDTO> getProductByPrice(double price) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductDTO> productList = new ArrayList<>();
		try{
			con= getConnection();
			pstmt = con.prepareStatement("select id, name,descr,price"
					+ ",image from  product where price>=?");
			pstmt.setDouble(1, price);
			rs = pstmt.executeQuery();
			while(rs.next()){
				ProductDTO productDTO = new ProductDTO();
				productDTO.setId(rs.getInt("id"));
				productDTO.setName(rs.getString("name"));
				productDTO.setDesc(rs.getString("descr"));
				productDTO.setPrice(rs.getDouble("price"));
				productDTO.setImage(rs.getString("image"));
				productList.add(productDTO);
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
		return productList;
	}
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(getValue("drivername"));
		Connection connection =
				DriverManager.getConnection(
						getValue("url"),getValue("userid"),"");
		return connection;
	}
}
