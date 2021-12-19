package com.ayyappa.dto;

public class ProductDTO {
	private String id;
	private int price;
	private String name, manufacturer;

	public ProductDTO(String id, int price, String name, String manufacturer) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.manufacturer = manufacturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", price=" + price + ", name=" + name + ", manufacturer=" + manufacturer + "]";
	}

}
