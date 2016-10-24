package com.vinay.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils
{
	private static SessionFactory factory=null;
	private HibernateUtils()
	{
		
	}
	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure("com/vinay/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
			
		}
		return factory;
	}
}
