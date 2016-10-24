package com.vinay.hibernate.dao;

public class StudentDAOFactory 
{
	public static StudentDAO getInstance()
	{
		return new StudentDAOImpl();
	}
}
