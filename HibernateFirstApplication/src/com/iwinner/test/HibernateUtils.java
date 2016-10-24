package com.iwinner.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	public static SessionFactory getSessionUtils(){
		
		// First Step 1:: BootStartp Class invoke framework
		Configuration conf = new Configuration();
		// Setting the config file
		conf = conf.configure("/mycfg-mysql.xml");
		// conf.configure("/mycfg-mysql.xml");

		// High level Object
		SessionFactory sessionFactory = conf.buildSessionFactory();
		// SesssionFactoryImpl
		
		return sessionFactory;
	}
	
	public static void insertOperation() {

		 Session session =HibernateUtils.getSessionUtils().openSession();
	}

	public static void updateOperation() {

		Session session =HibernateUtils.getSessionUtils().openSession();
	}

	public static void deleteOperation() {
		Session session =HibernateUtils.getSessionUtils().openSession();

	}

	public static void selectOperation() {
		Session session =HibernateUtils.getSessionUtils().openSession();

	}
}
