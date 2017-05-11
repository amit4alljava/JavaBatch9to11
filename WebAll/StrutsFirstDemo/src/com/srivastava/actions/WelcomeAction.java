package com.srivastava.actions;

import com.opensymphony.xwork2.Action;
// 1st POJO
// 2nd  Action Interface Implement
//3rd extends ActionSupport Class
import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport{ //implements Action {
	private String message;
	private String userid;
	private String pass;
	@Override
	public String execute(){
	//public String checkLogin(){
		if(userid.equals(pass)){
			message = "Welcome "+userid;
			return SUCCESS;
		}
		else
		{
			message = "Invalid Userid or Password";
			return ERROR;
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
