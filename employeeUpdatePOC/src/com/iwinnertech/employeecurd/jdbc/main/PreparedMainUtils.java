package com.iwinnertech.employeecurd.jdbc.main;

import com.iwinnertech.employeecurd.jdbc.dao.PreparedDaoImpl;


public class PreparedMainUtils {

	
	public static void main(String[] args) {
		
		
		PreparedDaoImpl prepared=new PreparedDaoImpl();
		
		//prepared.insertEmployeeCURD(26, "SBS", "Marathali", 1200f, 7878378l);
		
		int res=prepared.updsteEmployeeId("kos", 50);
		
		System.out.println("Res ::>>>>>"+res);
		
	}
}
