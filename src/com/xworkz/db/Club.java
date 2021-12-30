package com.xworkz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class Club {

	public static void main(String[] args) throws SQLException {

		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/clubdetails";
			String username = "root";
			String password = "Suni@011";
			try {
				mysql = DriverManager.getConnection(url, username, password);
				if (!mysql.isClosed()) {
					System.out.println("mysql is opened");
					String sql = "insert into club values(2,'night club','btm',780)";
					Statement statement = mysql.createStatement();
					int rowsAffected = statement.executeUpdate(sql);
					System.out.println(rowsAffected);
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				
					mysql.close();
			
				System.out.println("it's closesd");
			}

		}
	}
}

	
