package com.srivastava.actions;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.srivastava.dao.LoginDAO;

// There are 2 Approaches to Use Session 
// 1. Use ServletRequestAware
/*
 * However, this approach is not recommended because it makes the action class ties to 
 * the servlet API and difficult for unit testing. Therefore Struts2 recommends 
 * developers to access the session�s attributes instead of the HttpSession object, 
 * by providing the SessionAware interface.
 */
// 2. Use SessionAware Interface
/*
 * When Struts2 found that an action class implements the SessionAware interface, 
 * it will inject a map of session attributes via the 
 * method setSession(), so we can use this map to add/remove attributes to/from the session. 
 */
/*
 * For example:
Adding an attribute to the session: 
sessionMap.put("userName", "Tom");
That�s equivalent to this call with the HttpSession:
httpSession.setAttribute("userName", "Tom");

Removing an attribute from the session:

sessionMap.remove("userName");
That�s equivalent to this call with the HttpSession:
httpSession.removeAttribute("userName");

So by implementing the SessionAware interface and manipulating session attributes via a Map object, 
we can decouple the action class from the Servlet API, thus making unit testing the
 action class easily.
 */

public class LoginAction extends ActionSupport implements SessionAware{ 
//implements ServletRequestAware {

	private String userid;
	private String password;
	private String message;
	
	private Map<String, Object> sessionMap;
	
	private HttpServletRequest request ; 
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	public String execute(){
		return SUCCESS;
	}

	public String checkLogin(){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(this.getUserid());
		userDTO.setPassword(this.getPassword());
		LoginDAO loginDAO = new LoginDAO();
		String action = ERROR;
		try {
			if(loginDAO.authenicateLogin(userDTO))
			{
				sessionMap.put("user",userDTO.getUserid());
				HttpSession session = request.getSession(true); 
				session.setAttribute("user",userDTO.getUserid());
				this.setMessage("Welcome "+this.getUserid());
				action = SUCCESS;
			}
			else
			{
				this.setMessage("Invalid Userid or password ");
				action= "invalid";
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	/*	if(this.getUserid().equals(this.getPassword())){
			this.setMessage("Welcome "+this.getUserid());
			return SUCCESS;
		}
		else
		{
			this.setMessage("Invalid Userid or password ");
			return ERROR;
		}*/
	}



	/*@Override
	public void setServletRequest(HttpServletRequest request) {
	 this.request = request;
		
	}*/


//
//	@Override
//	public void setSession(Map<String, Object> sessionMap) {
//		this.sessionMap = sessionMap;
//		
//	}



//	@Override
//	public void setServletRequest(HttpServletRequest arg0) {
//		this.request = arg0;
//		// TODO Auto-generated method stub
//		
//	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.sessionMap = arg0;
		
	}
	
}
