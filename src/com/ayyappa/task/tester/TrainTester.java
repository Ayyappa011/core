package com.ayyappa.task.tester;

import java.sql.SQLException;

import com.ayyappa.task.dao.TrainDAO;
import com.ayyappa.task.dto.TrainDTO;

public class TrainTester {

	public static void main(String[] args) throws SQLException {
		
		TrainDTO dtos = new TrainDTO(7, 78207, "Goa", "Tirupati", 106, 1599, "Second class", "UBL");
		 
              TrainDAO daos =  new TrainDAO();
              daos.save(dtos);
              System.out.println("========================");
              daos.deleteByTrainNO(1);
              System.out.println("========================");
              daos.deleteByTrainNoAndTrainId(2, 1);
              System.out.println("==========================================");
              daos.getByTrainNo(5);
              System.out.println("-------------------------------------------");
	          daos.getAll();
	          System.out.println("------------------------------------------------");
	          daos.updateDestinationByTrainNo("Mysuru", "");
	          System.out.println("------------------------------");
	          daos.getMaxPrice();
	          System.out.println("------------------------------");
	          daos.getMinPrice();
	}

}
