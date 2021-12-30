package com.xworkz.tester;

import java.sql.SQLException;

import com.xworkz.dao.ClubDAO;
import com.xworkz.dto.ClubDTO;

public class ClubTester {

	public static void main(String[] args) throws SQLException {
		ClubDTO dto = new ClubDTO(11, "Sangu", "Ballari",78);
              ClubDAO dao=new ClubDAO();
              dao.save(dto);
              
              dao.delete(dto);
              
              
	}

}
