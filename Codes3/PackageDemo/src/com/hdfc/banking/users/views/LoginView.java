package com.hdfc.banking.users.views;

import java.util.Scanner;

import com.hdfc.banking.users.dto.UserDTO;
import com.hdfc.banking.users.helper.LoginHelper;

public class LoginView {
	
	public void doLogin(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		LoginHelper helper = new LoginHelper();
		UserDTO userDTOReturn = helper.checkLogin(userDTO);
		if(userDTOReturn!=null){
			System.out.println("Welcome "+userid);
			System.out.println("Enter the New Password");
			String newPassword = scanner.next();
			if(helper.changePassword(userDTOReturn, newPassword)){
				System.out.println("Password Has Change...");
				helper.print();
			}
			else
			{
				System.out.println("Not Change..");
			}
		}
		else
		{
			System.out.println("Invalid Userid or Password ");
		}
	}
public static void main(String[] args) {
	LoginView view = new LoginView();
	System.out.println("1. Add New User");
	System.out.println("2. Delete");
	System.out.println("3. Search");
	System.out.println("4. Read");
	System.out.println("5. Update");
	System.out.println("6. Exit");
	view.doLogin();
}
}
