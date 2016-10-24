package com.iwinner.hibenate.dao;

public class EmployeeDAOFactory {

	public static EmployeeImpl employeeImpl=null;
	
	public static EmployeeImpl getInstance(){
		employeeImpl=new EmployeeImpl();
		System.out.println(employeeImpl);
		return employeeImpl;
	}	
}
