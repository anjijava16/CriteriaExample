package com.vinay.hibernate.dao;

public interface StudentDAO 
{
	void insertStudent(String studentName,Integer marsk);
	void readStudent(int id);
}
