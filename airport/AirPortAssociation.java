package com.ayyappa.route.airport;

public class AirPortAssociation {
	AirPortDAO dao;

	public AirPortAssociation(AirPortDAO dao) {
		super();
		this.dao = dao;
	}

	public void saveAirPort(String dtos) {
		if (dtos != null) {
			AirPortDTO dto1 = this.dao.findAirportNames(dtos);
			if (dto1 != null) {
				System.out.println("Find air port name :".concat(String.valueOf(dto1.getName())));

			} else {
				System.err.println("dto to pointing to null value here");
			}
		}

	}

	public void display() {
		if(dao!=null) {
			dao.displayallAirPortDetails();
		}

	}
}
