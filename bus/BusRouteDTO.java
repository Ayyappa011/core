package com.ayyappa.route.bus;

public class BusRouteDTO{
	private String id;
	private String startPoint;
	private String destionation;
	private String driverName;
	
	public BusRouteDTO() {
		System.out.println("Invoked methode busroute ");
	}

	public BusRouteDTO(String id, String startPoint, String destionation, String driverName) {
		super();
		this.id = id;
		this.startPoint = startPoint;
		this.destionation = destionation;
		this.driverName = driverName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestionation() {
		return destionation;
	}

	public void setDestionation(String destionation) {
		this.destionation = destionation;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	

}
