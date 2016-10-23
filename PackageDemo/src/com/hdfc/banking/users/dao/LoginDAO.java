package com.hdfc.banking.users.dao;

import com.hdfc.banking.users.dto.UserDTO;

public class LoginDAO {
	
	public UserDTO[] getUserData(){
		// Get the Data from DataBase
		UserDTO array[] =new UserDTO[2];
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid("amit");
		userDTO.setPassword("123");
		array[0]= userDTO;
		 userDTO = new UserDTO();
		userDTO.setUserid("ram");
		userDTO.setPassword("123");
		array[1]= userDTO;
		return array;
	}

}
