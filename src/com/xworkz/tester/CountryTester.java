package com.xworkz.tester;

import java.sql.SQLException;

import com.xworkz.dao.CountryDAO;
import com.xworkz.dto.CountryDTO;

public class CountryTester {

	public static void main(String[] args) throws SQLException {
		CountryDTO dtos = new CountryDTO(3, "Europe", 11, "India");
		CountryDAO daos = new CountryDAO();
		
          daos.save(dtos);
          daos.delete(dtos);
	}

}
