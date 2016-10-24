package com.iwinner.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iwinner.dto.EmpBean;

public class GetLoadSelectOperationDaoImpl {

	
	public static void main(String[] args) {
		
		

		

		
		
		
		
		// Configuration loaded
				Configuration conf = new Configuration();
				// Setting the config file
				conf = conf.configure("/mycfg-mysql.xml");
				// conf.configure("/mycfg-mysql.xml");


				// SessionFactory is ready bcoz it high level object
				// High level Object
				SessionFactory sessionFactory = conf.buildSessionFactory();
				// SesssionFactoryImpl
				

				// Session ready for do select or non select operation
				Session session = sessionFactory.openSession();
				
		// select the EmpId =10;
/*				
				Object obj=session.get(EmpBean.class, 10);
				
				EmpBean empBean=(EmpBean)obj;*/
				
				System.out.println("Start Debug Here");
				EmpBean empBean=(EmpBean)session.get(EmpBean.class, 10);
				System.out.println(" Check Console");
				
				System.out.println(empBean);
				

	}
}

// GET
/*
Start Debug Here
Hibernate: select empbean0_.EID as EID0_0_, empbean0_.FIRSTNAME as FIRSTNAME0_0_, empbean0_.LASTNAME as LASTNAME0_0_, empbean0_.EMAIL as EMAIL0_0_ from EmployeeBean_DDL empbean0_ where empbean0_.EID=?
 Check Console
EmpBean [no=10, fname=dfjaj, lname=jjdfs, mail=sd]*/


//load  ?
/*
Start Debug Here
Check Console
Hibernate: select empbean0_.EID as EID0_0_, empbean0_.FIRSTNAME as FIRSTNAME0_0_, empbean0_.LASTNAME as LASTNAME0_0_, empbean0_.EMAIL as EMAIL0_0_ from EmployeeBean_DDL empbean0_ where empbean0_.EID=?
EmpBean [no=10, fname=dfjaj, lname=jjdfs, mail=sd]*/













