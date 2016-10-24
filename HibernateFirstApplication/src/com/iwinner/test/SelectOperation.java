package com.iwinner.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iwinner.dto.EmpBean;

public class SelectOperation {

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

		Object obj=session.get(EmpBean.class, 10);
		
        EmpBean empBean=(EmpBean)obj;
		
		System.out.println(empBean.toString());
		
		session.clear();
		//java.lang.NullPointerException
		//Object obj=session.load(EmpBean.class, 20);//ObjectNotFoundException
		
		//Query query=session.createQuery("From EmpBean");
Object obj2=session.get(EmpBean.class, 10);
		
        EmpBean empBean2=(EmpBean)obj2;
		
		System.out.println(empBean2.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	EmpBean eBean = (EmpBean) session.get(EmpBean.class, 20);

		System.out.println(eBean.toString());
*/
		session.close();
		sessionFactory.close();

	}
}
