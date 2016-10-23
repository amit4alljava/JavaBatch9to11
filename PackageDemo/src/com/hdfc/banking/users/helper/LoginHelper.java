package com.hdfc.banking.users.helper;

import com.hdfc.banking.users.dao.LoginDAO;
import com.hdfc.banking.users.dto.UserDTO;

public class LoginHelper {
	
	public boolean checkLogin(UserDTO userDTO){
		// Get the Data From View
		// Get the Data From DB (DAO)
		// Compare the Data
		LoginDAO loginDAO = new LoginDAO();
		UserDTO array[] = loginDAO.getUserData();
		for(UserDTO userObject : array){
			if(userObject.getUserid().equals(userDTO.getUserid())
					&& userObject.getPassword().equals(userDTO.getPassword())){
				return true;
			}
		}
		return false;
		
	}

}
