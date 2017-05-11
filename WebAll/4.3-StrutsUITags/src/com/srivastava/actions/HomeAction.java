package com.srivastava.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	private ArrayList<String> countries = new ArrayList<>();
	private Map<String,String> qualificationMap = new HashMap<>();
	private String qualification;
	private ArrayList<Language> languages  = new ArrayList<>();
	private String language ;
	private String message;
	private void prepareData(){
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("SriLanka");
		countries.add("South Africa");
		countries.add("Nepal");
		qualificationMap.put("ms", "Master in Science");
		qualificationMap.put("mca", "Master in Computer Application");
		qualificationMap.put("ma", "Master in Arts");
		languages.add(new Language("en","English"));
		languages.add(new Language("hi","Hindi"));
	}
	
	public String execute(){
		this.prepareData();
		return SUCCESS;
		
	}
	public String displayMessage(){
		this.setMessage("Hello User , this Content is Coming from the Server");
		return SUCCESS;
	}
	
	public ArrayList<String> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}

	public Map<String, String> getQualificationMap() {
		return qualificationMap;
	}

	public void setQualificationMap(Map<String, String> qualificationMap) {
		this.qualificationMap = qualificationMap;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public ArrayList<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<Language> languages) {
		this.languages = languages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
