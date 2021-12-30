package com.xworkz.tester;

import java.sql.SQLException;

import com.xworkz.dao.CityDAO;
import com.xworkz.dto.CityDTO;

public class CityTester {

	public static void main(String[] args) throws SQLException {
		CityDTO dtos = new CityDTO(1,"Ballary",4589,"na");
		CityDAO daos = new CityDAO();
		daos.save(dtos);
		daos.delete(dtos);

	}

}
