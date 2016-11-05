package com.hdfc.banking.users.helper;

import com.hdfc.banking.users.dao.LoginDAO;
import com.hdfc.banking.users.dto.UserDTO;

public class LoginHelper {
	UserDTO array[] ;
	public void print(){
		for(UserDTO userDTO : array){
			System.out.println(userDTO.getUserid()+" "+userDTO.getPassword());
		}
	}
	
	public boolean changePassword(UserDTO userObject,String password){
		if(userObject!=null){
		userObject.setPassword(password);
	
		return true;
		}
		return false;
	}
	
	public UserDTO checkLogin(UserDTO userDTO){
		// Get the Data From View
		// Get the Data From DB (DAO)
		// Compare the Data
		LoginDAO loginDAO = new LoginDAO();
		 array =loginDAO.getUserData();
		for(UserDTO userObject : array){
			if(userObject.getUserid().equals(userDTO.getUserid())
					&& userObject.getPassword().equals(userDTO.getPassword())){
				return userObject;
			}
		}
		return null;
		
	}

}
