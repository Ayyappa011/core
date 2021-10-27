package com.ayyappa.dto;

public class BucketDTO {
	
	private String color;
	private int size;
	private float price;
	private String company;
	
	public BucketDTO() {
		
	}

	public BucketDTO(String color, int size, float price, String company) {
		super();
		this.color = color;
		this.size = size;
		this.price = price;
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	

}
