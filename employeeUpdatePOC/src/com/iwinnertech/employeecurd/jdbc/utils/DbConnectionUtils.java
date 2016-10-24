package com.iwinnertech.employeecurd.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtils {

	public static Connection getConnection() {

		Connection conn = null;

		try {
			// Loading the Database
			Class.forName("com.mysql.jdbc.Driver");
			try {
				// making conn object
				conn = DriverManager.getConnection(	"jdbc:mysql://localhost:3306/jdbcdb", "root", "root");

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conn;
	}

}
