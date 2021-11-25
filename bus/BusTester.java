package com.ayyappa.route.bus;

public class BusTester {

	public static void main(String[] args) throws NullPointerException {
		
		
		BusRouteDTO bus1 = new BusRouteDTO("KSRTC Govt","Bnagalore","BTM","Reddy");
		
		BusDAO refbus = new BusRoute();
		
		BusRouteAssociation ref1 = new  BusRouteAssociation(refbus);
		ref1.busDetails(null);
		ref1.displayBusDetails();
		

	}

}
