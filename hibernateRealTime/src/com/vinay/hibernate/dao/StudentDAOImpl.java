package com.vinay.hibernate.dao;

import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.vinay.hibernate.model.Student;
import com.vinay.hibernate.util.HibernateUtils;

public class StudentDAOImpl implements StudentDAO
{

	@Override
	public void insertStudent(String studentName, Integer marks)
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		Student student=new Student();
		student.setStudentName(studentName);
		student.setMarks(marks);
		Transaction tx=session.beginTransaction();
		session.persist(student);
		tx.commit();
		session.close();
		System.out.println("Student record is inserted");		
	}

	@Override
	public void readStudent(int id)
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		Student student=(Student) session.get(Student.class, id);
		System.out.println("name=" +student.getStudentName());
		System.out.println("marks="+student.getMarks());
			
	}
	
}
