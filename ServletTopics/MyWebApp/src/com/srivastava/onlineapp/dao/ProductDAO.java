package com.srivastava.onlineapp.dao;

import static com.srivastava.onlineapp.dao.ResourceBundleReader.getValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.srivastava.onlineapp.dto.ProductDTO;

public class ProductDAO {
	
	public ArrayList<ProductDTO> getProducts() throws ClassNotFoundException, SQLException{
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductDTO> productList = new ArrayList<>();
		String sql = "select id , name, descr, price , image from product";
		try
		{
			connection = getConnection();
			pstmt = connection.prepareStatement(sql);
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
			if(connection!=null){
				connection.close();
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
