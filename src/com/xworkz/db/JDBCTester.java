package com.xworkz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTester {

	public static void main(String[] args) {

		// STEPS to connect to DB
		// Loading and Registering the Driver
		// Create Connection using DriverManager
		// Prepare Query
		// Create Statement
		// Process The Result
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hotels";
			String username = "root";
			String password = "Suni@011";
			try {
				mysql = DriverManager.getConnection(url, username, password);
				if (!mysql.isClosed()) {
					System.out.println("mysql is opened");
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				System.out.println("it's closesd");
			}

		}

	}

}
