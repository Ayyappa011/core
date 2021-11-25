package com.ayyappa.route.airport;

public class AirPortDTO {

	private String id;
	private String name;
	private String location;
	private boolean type;

	public AirPortDTO(String id, String name, String location, boolean type) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

}
