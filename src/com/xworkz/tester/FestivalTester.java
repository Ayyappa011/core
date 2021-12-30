package com.xworkz.tester;

import java.sql.SQLException;

import com.xworkz.dao.FestivalDAO;
import com.xworkz.dto.FestivalDTO;

public class FestivalTester {

	public static void main(String[] args) throws SQLException {
		
		
		FestivalDTO dtos = new FestivalDTO(4, "	Holi", "29th March", "KA");
                  FestivalDAO daos = new FestivalDAO();
                  daos.save(dtos);
                  daos.delete(dtos);
                  
	}

}
