package com.ayyappa.route.bus;

public class BusRouteAssociation {

	BusRouteDTO dto;
	BusDAO dao;

	

	public BusRouteAssociation(BusDAO dao) {
		super();
		this.dao = dao;
	}
	public void busDetails(String daos) {
		if(dao!=null) {
			System.out.println("bus details found here");
			String dao1=this.dao.idregister();
			if(dao1!=null) {
				System.out.println("this idregister found here :".concat(dao1));
				String dao2=this.dao.name();
				if(dao2!=null) {
					System.out.println("this driver name is register :".concat(dao2));
				}else {
					System.err.println("this dreiver name is not register");
					String dao3=this.dao.startingPoint();
					if(dao3!=null) {
						System.out.println("Bus starting point from :".concat(dao3));
					}else {
						System.err.println("Bus starting point not found here");
					}
				}
			}else {
				System.err.println("this id notn register");
			}
		}
		
		
	}
		
	public void displayBusDetails() {
		dto.getId();
		dto.getDriverName();
		dto.getDestionation();
		dto.getStartPoint();
	}

}
