package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dto.ClubDTO;
import com.xworkz.interfac.DBconts;

public class ClubDAO {
	Connection mysql = null;

	public boolean save(ClubDTO clubdto) throws SQLException {
		System.out.println("invoked save method");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after driver class is loadded and registered");
			mysql = DriverManager.getConnection(DBconts.mysql_url, DBconts.mysql_username, DBconts.mysql_password);

			if (!mysql.isClosed()) {
				System.out.println("mysql is opened");
				String sql = "insert into club values(" + clubdto.getIdClub() + ",'" + clubdto.getClub_Name() + "','"
						+ clubdto.getClub_location() + "','" + clubdto.getClub_entry_fees() + "')";
				System.out.println(sql);
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
				System.out.println("total rows affected:" + rowsAffected);
				if (rowsAffected == 1) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (mysql != null) {
				mysql.close();
				System.out.println("it is finally closed");

			}
		}
		return false;

	}

	public boolean delete(ClubDTO dto1) throws SQLException {
		System.out.println("invoked delete method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after driver class is loadded and registered");
			mysql = DriverManager.getConnection(DBconts.mysql_url, DBconts.mysql_username, DBconts.mysql_password);
			if (!mysql.isClosed()) {
				System.out.println("mysql is opened");
				String sql = "delete from club where IdClub=1";
				System.out.println(sql);
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
				System.out.println("total rows affected:" + rowsAffected);
				if (rowsAffected == 1) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (mysql != null) {
				mysql.close();
				System.out.println("it is finally closed");

			}
		}
		return false;
	}
}
