package com.ayyappa.route.bus;

public class BusRoute implements BusDAO{

	@Override
	public String idregister() {
		System.out.println("invoked method idregister");
		return "KSRTC Govt";
	}

	@Override
	public String name() {
		System.out.println("driver Name invoked method");
		
		return "Reddy";
	}

	@Override
	public String startingPoint() {
		
		return "BTM";
	}

}
