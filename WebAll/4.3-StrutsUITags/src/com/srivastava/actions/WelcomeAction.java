package com.srivastava.actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class WelcomeAction extends ActionSupport implements ModelDriven<User> {

	private ArrayList<String> countries = new ArrayList<>();
	
	private String country ; 
	
	private void prepareData(){
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("SriLanka");
		countries.add("South Africa");
	}
	
	@Override
	public String execute(){
		this.prepareData();
		return SUCCESS;
	}
	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<String> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
