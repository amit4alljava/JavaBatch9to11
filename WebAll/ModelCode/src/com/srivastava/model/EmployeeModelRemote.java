package com.srivastava.model;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;
import javax.naming.NamingException;

@Remote
public interface EmployeeModelRemote {
	public List<EmployeeDTO> searchEmployee(EmployeeDTO empDTO) throws SQLException, NamingException;

}
