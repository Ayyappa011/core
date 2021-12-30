package com.xworkz.tester;

import java.sql.SQLException;

import com.xworkz.dao.IcecreamDAO;
import com.xworkz.dto.IcecreamDTO;

public class IcecreamTester {

	public static void main(String[] args) throws SQLException {
		IcecreamDTO dtos = new IcecreamDTO(1, "Butter Pecan", "Chocolate", 90);
		IcecreamDAO daos = new IcecreamDAO();
		daos.save(dtos);
		

	}

}
