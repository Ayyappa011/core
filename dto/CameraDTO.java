package com.ayyappa.dto;

public class CameraDTO {
	
	 private String company;
	 private String type;
	 private float pixle;
	 private int cost;
	 private int batterycapacity;
	 private int weight;
	 
	 public CameraDTO() {
		
	}

	public CameraDTO(String company, String type, float pixle, int cost, int batterycapacity, int weight) {
		this.company = company;
		this.type = type;
		this.pixle = pixle;
		this.cost = cost;
		this.batterycapacity = batterycapacity;
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPixle() {
		return pixle;
	}

	public void setPixle(float pixle) {
		this.pixle = pixle;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getBatterycapacity() {
		return batterycapacity;
	}

	public void setBatterycapacity(int batterycapacity) {
		this.batterycapacity = batterycapacity;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	 
	 

}
