package com.srivastava.apps;

import java.util.ResourceBundle;

public class Factory {
public IProducer createObject(){
	// Step - 1 Read Config File
	ResourceBundle rb = ResourceBundle.getBundle("config");
	String className = rb.getString("classname");
	IProducer iproducer = null;
	try {
		iproducer= (IProducer)Class.forName(className).newInstance();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return iproducer;
//	if(className.equals("com.srivastava.apps.Producer")){
//		return new Producer();
//	}
//	else
//	{
//		return new FasterProducer();
//	}
	//IProducer iproducer = new FasterProducer();
	//return iproducer;
}
}
