package com.iwinner.hibenate.dao;

import java.util.List;

public interface EmployeeI {
	public List selectFullEmployee();
	public List selectPartialEmployee();
	
   public List getEmployeeDetails();
}
