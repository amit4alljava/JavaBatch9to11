package com.srivastava.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.srivastava.model.Customer;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Customer customer = new Customer();
	
	
public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


public String execute(){
	return SUCCESS;
	
}
@Override
public Customer getModel() {
	
	return customer;
	
}

}
