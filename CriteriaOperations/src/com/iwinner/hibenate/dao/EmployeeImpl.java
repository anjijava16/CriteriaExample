package com.iwinner.hibenate.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.iwinner.hibenate.model.Employee;
import com.iwinner.hibenate.util.HibernateSessionFactoryUtil;
public class EmployeeImpl implements EmployeeI {

	@Override
	public List selectFullEmployee() {
		SessionFactory sessionFactory=HibernateSessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		//Order order=Order.desc("employeeName");
		Order order=Order.asc("employeeName");
		criteria.addOrder(order);
		List list=criteria.list();
		return list;
	}
	@Override
	public List selectPartialEmployee() {
		SessionFactory sessionFactory=HibernateSessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		
		Projection projection1=Projections.property("employeeSalary");
		Projection projection2=Projections.property("employeeName");
		
		ProjectionList projectionList=Projections.projectionList();
		
		projectionList.add(projection1);  /// select empsal from Employee
		projectionList.add(projection2);
		criteria.setProjection(projectionList);
		List list=criteria.list();
		return list;
	}
	public List getEmployeeDetails() {
		List returnList=new ArrayList();
			
		SessionFactory sessionFactory=HibernateSessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		// Criteria Object is started Here
		
		Criteria criteria=session.createCriteria(Employee.class);
		
		returnList=criteria.list();
		
		return returnList;
	}
	
	public List getEmployeeList(){
		SessionFactory sessionFactory=HibernateSessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
			
		
		Criteria cr = session.createCriteria(Employee.class);
		// To get records having salary more than 2000
		cr.add(Restrictions.gt("salary", 2000));

		// To sort records in descening order
		cr.addOrder(Order.desc("salary"));

		// To sort records in ascending order
		cr.addOrder(Order.asc("salary"));

		List results = cr.list();
		
		return results;
	}
	
	public List getEmployeePaginationList(){
		
		SessionFactory sessionFactory=HibernateSessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
			
		
		Criteria cr = session.createCriteria(Employee.class);
		cr.setFirstResult(1);
		cr.setMaxResults(10);
		List results = cr.list();
		
		return results;
	}

}






