package com.iwinner.hibenate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
	
	private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory(){
		//factory method 2 types static factory method and instance factory method
		if(factory==null){
			// use forward slash / for accmessing hibernate.cfg.xml file . for accessing .java file
			//com.iwinner.hibenate.config
			factory=new Configuration().configure("com/iwinner/hibenate/config/hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
}
