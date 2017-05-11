package com.srivastava.beans;

import javax.ejb.Stateful;

/**
 * Session Bean implementation class MyCalcBean
 */
@Stateful
public class MyCalcBean implements MyCalcBeanRemote, MyCalcBeanLocal {

	@Override
	public int add(int x , int y){
		return x + y;
	}
    /**
     * Default constructor. 
     */
    public MyCalcBean() {
        // TODO Auto-generated constructor stub
    }

}
