package com.srivastava.actions;

public class Language {
	private String code;
	private String name;
	Language(String code, String name){
		this.code = code;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Language [code=" + code + ", name=" + name + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
