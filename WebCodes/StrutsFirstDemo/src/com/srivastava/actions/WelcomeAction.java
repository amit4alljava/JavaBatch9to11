package com.srivastava.actions;

public class WelcomeAction {
	private String message;
	private String userid;
	private String pass;
	
	public String checkLogin(){
		if(userid.equals(pass)){
			message = "Welcome "+userid;
			return "success";
		}
		else
		{
			message = "Invalid Userid or Password";
			return "error";
		}
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String sayWelcome(){
		setMessage("Welcome User");
		return "success";
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
