package com.ayyappa.task.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.ayyappa.task.interfaceclass.DBconstantance;

public class DBUtil {
	public static Connection createConnection() {
		Connection connection;
		try {
			connection = DriverManager.getConnection(DBconstantance.mysql_url, DBconstantance.mysql_username,
					DBconstantance.mysql_password);
			return connection;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		if (connection != null)
			try {

				connection.close();
				System.out.println("Closed the resource");

			} catch (SQLException e) {

				e.printStackTrace();
			}

	}

}
