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
		boolean isFound = helper.checkLogin(userDTO);
		if(isFound){
			System.out.println("Welcome "+userid);
		}
		else
		{
			System.out.println("Invalid Userid or Password ");
		}
	}
public static void main(String[] args) {
	LoginView view = new LoginView();
	view.doLogin();
}
}
