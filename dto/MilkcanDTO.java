package com.ayyappa.dto;

public class MilkcanDTO {
	private Integer quantity;
	private String shape;
	private String quality;
	private Integer price;
	
	public MilkcanDTO() {
		
	}

	public MilkcanDTO(Integer quantity, String shape, String quality, Integer price) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.quality = quality;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	

}
