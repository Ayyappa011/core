package com.ayyappa.route.airport.tester;

import com.ayyappa.route.airport.AirPortAssociation;
import com.ayyappa.route.airport.AirPortDAO;
import com.ayyappa.route.airport.AirPortDAOextends;
import com.ayyappa.route.airport.AirPortDTO;

public class AirPortTester {

	public static void main(String[] args) {
		
		
		
		AirPortDTO airport= new AirPortDTO("PassPort", "Ayyappa Reddy","Blore", true);
		
		AirPortDAO airport1 = new AirPortDAOextends();
		AirPortAssociation airref= new AirPortAssociation(airport1);
		airref.saveAirPort("Blore");
		airref.display();
		

	}

}
