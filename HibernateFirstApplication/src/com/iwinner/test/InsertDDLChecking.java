package com.iwinner.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.iwinner.dto.EmpBean;

public class InsertDDLChecking {
public static void main(String[] args) {


	// First Step 1:: BootStartp Class invoke framework
	Configuration conf = new Configuration();
	// Setting the config file
	conf = conf.configure("/mycfg-mysql.xml");
	// conf.configure("/mycfg-mysql.xml");

	// High level Object
	SessionFactory sessionFactory = conf.buildSessionFactory();
	// SesssionFactoryImpl
	

	Session session = sessionFactory.openSession();

	
	Transaction tx=session.beginTransaction();
	
	EmpBean empBean=new EmpBean();
	
	empBean.setFname("KL_800");
	empBean.setLname("MY_800");
	
	empBean.setMail("KL@my.com");
	
	empBean.setNo(800);
	
    session.save(empBean);
    
    tx.commit();
	

    
	session.close();
	sessionFactory.close();


}
}
