package com.iwinnertech.employeecurd.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.iwinnertech.employeecurd.jdbc.model.Employee;
import com.iwinnertech.employeecurd.jdbc.utils.DbConnectionUtils;

public class PreparedDaoImpl {

	public void insertEmployeeCURD(int empId,String empName,String empAdd,Float sal,Long empPhone) {

		try{
		
	//String INSERT_QUERY="insert into employee(empId,empName,empAdd,empSal,empPhone) values("+empId+",'"+empName+"','"+empAdd+"',"+sal+","+empPhone+")";
	String INSERT_QUERY="insert into employee(empId,empName,empAdd,empSal,empPhone) values(?,?,?,?,?)";
	Connection dbConnection=DbConnectionUtils.getConnection();
	
	PreparedStatement pstmt=dbConnection.prepareStatement(INSERT_QUERY);
	pstmt.setInt(1, empId);
	pstmt.setString(2, empName);
	pstmt.setString(3, empAdd);
	pstmt.setFloat(4, sal);
	pstmt.setLong(5, empPhone);
	
	int res= pstmt.executeUpdate();
	
	System.out.println("Result is "+res);
	/*
	
	
	
	Statement stmt=dbConnection.createStatement();
	stmt.executeUpdate(INSERT_QUERY);
	
	*
	*
	*/
	
		}catch(Exception e){
		                e.printStackTrace();	
		}
	
	}
	
	public int updsteEmployeeId(String empName,int empId){
		
//     
		int res=0;
		try {
			String UPDATE_QUERY="update employee set empName=? where empId=?";
			
			Connection conn=DbConnectionUtils.getConnection();
			
			PreparedStatement pstmt=conn.prepareStatement(UPDATE_QUERY);
			
			pstmt.setString(1, empName);
			
			pstmt.setInt(2, empId);

			
			
			 res=pstmt.executeUpdate();
			
			System.out.println("Result  is "+res);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	
	public int deleteEmployeeId() {

		return 1;
	}
	
	public Employee viewEmployeeById(String empId){
		
		Employee emp=new Employee();
		
		return emp;
	}
}
