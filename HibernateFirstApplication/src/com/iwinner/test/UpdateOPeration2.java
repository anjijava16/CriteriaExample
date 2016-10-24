package com.iwinner.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.iwinner.dto.EmpBean;

public class UpdateOPeration2 {

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
		
		Transaction tx=session.beginTransaction();
		EmpBean empBean=(EmpBean)session.load(EmpBean.class, 10);
		
		empBean.setFname("ANJIMM");
		
           session.save(empBean);
           
           tx.commit();
		
	}
}
