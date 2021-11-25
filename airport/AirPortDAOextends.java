package com.ayyappa.route.airport;

public class AirPortDAOextends implements AirPortDAO {

	AirPortDTO[] dtos = new AirPortDTO[4];
	int adder = 0;

	@Override
	public boolean saveAirportNames(AirPortDTO dto) {
		System.out.println("invoked method save air port names's");
		if (dto != null) {
			dtos[adder++] = dto;
			return true;
		} else {
			System.err.println("did't save any air port name's here");
		}

		return true;
	}

	@Override
	public AirPortDTO findAirportNames(String name) {
		System.out.println("invoked find age method");
		if (dtos != null) {

			for (int i = 0; i < dtos.length; i++) {
				AirPortDTO ref = dtos[i];
				if (ref != null) {

					String name1 = ref.getName();

					if (name == name1) {
						System.out.println("Airport name is found here");
					} else {
						System.err.println("Airport name is not found here");
					}

				} else {
					System.err.println("ref of dtos is pointing to null");
				}
			}
		} else {
			System.err.println("dtos is pointing to null");
		}
		return null;
	}

	@Override
	public void displayallAirPortDetails() {
		if(dtos!=null) {
			for (int i = 0; i < dtos.length; i++) {
				AirPortDTO dtos1=dtos[i];
				((AirPortDTO) dtos1).getId();
				((AirPortDTO) dtos1).getName();
				((AirPortDTO) dtos1).getLocation();
				((AirPortDTO) dtos1).isType();
				
				
			}
		}
		

	}

}
