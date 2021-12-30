package com.xworkz.tester;

import java.sql.SQLException;

import com.xworkz.dao.StateDAO;
import com.xworkz.dto.StateDTO;

public class StateTester {

	public static void main(String[] args) throws SQLException {
	 StateDTO dtos = new StateDTO(4, "TN", 15, "Thiravantapura");
	 StateDAO daos = new StateDAO();
	 daos.save(dtos);
	 daos.delete(dtos);
	 

	}

}
