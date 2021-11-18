package com.ayyappa.cart.dto;

public class CartDTO {

	private String name;
	private int quantity;
	private float price;
	private String item;

	public CartDTO(String name, int quantity, float price, String item) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
