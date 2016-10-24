package com.iwinner.hibenate.services;

import com.iwinner.hibenate.dao.EmployeeDAOFactory;
import com.iwinner.hibenate.dao.EmployeeI;
import com.iwinner.hibenate.model.Employee;

import java.util.*;

public class EmployeeServices {
	public static EmployeeI employeeI=null;
	public static Employee employee=new Employee();
	
	public List selectFullEmp(){
		employeeI=EmployeeDAOFactory.getInstance();
		List list=employeeI.selectFullEmployee();
		return list;
	}
	public List selectHalfEmp(){
		employeeI=EmployeeDAOFactory.getInstance();
		List list=employeeI.selectPartialEmployee();
		return list;
	}
	
	
	public List getEmployee(){
		employeeI=EmployeeDAOFactory.getInstance();
		List list=employeeI.getEmployeeDetails();
		return list;
	}
	
	//selectPartialEmployee
	
	
	public List selectPartialEmployee(){
		employeeI=EmployeeDAOFactory.getInstance();
		List list=employeeI.selectPartialEmployee();
		return list;
	}
}
