package com.ayyappa.bird.tester;

import com.ayyappa.bird.BirdDTO;
import com.ayyappa.bird.dao.BirdAssociation;
import com.ayyappa.bird.dao.BirdDAO;
import com.ayyappa.bird.dao.BridDAOImplimentation;

public class BirdTester {

	public static void main(String args[]) {
		
		BirdDTO dtos= new BirdDTO("PanCard","tisen",5,"blore",true);
		
		BirdDAO daos = new BridDAOImplimentation();
		
		BirdAssociation birdAss= new BirdAssociation(daos);
		birdAss.canFly(dtos);
		birdAss.displayallDetails();
		
	}
	
}
