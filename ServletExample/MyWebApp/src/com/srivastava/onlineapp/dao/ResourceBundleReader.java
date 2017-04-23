package com.srivastava.onlineapp.dao;

import java.util.ResourceBundle;

public interface ResourceBundleReader {
	
	static ResourceBundle rb = ResourceBundle.getBundle("dbconfig");
	public static String getValue(String key){
		return rb.getString(key);
	}

}
