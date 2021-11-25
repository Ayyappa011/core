package com.ayyappa.route.airport;

public interface AirPortDAO {
	boolean saveAirportNames(AirPortDTO dto);

	AirPortDTO findAirportNames(String name);

	void displayallAirPortDetails();

}
