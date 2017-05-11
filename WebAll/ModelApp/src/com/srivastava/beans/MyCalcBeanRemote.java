package com.srivastava.beans;

import javax.ejb.Remote;

@Remote
public interface MyCalcBeanRemote {
	public int add(int x, int y);
}
