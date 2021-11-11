package com.reddy.device.fish;

import com.reddy.device.fish.type.FishType;

public class Fish {
	private String name;
	private FishType type;
	private int price;
	private String color;
	
	

	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("invoked equal method is not equal to null");

			if (obj instanceof Fish) {
				Fish casted = (Fish) obj;

				FishType match = casted.getType();

				if (this.type.equals(match)) {
					System.out.println("Fishtype are's are same");

					return true;
				} else {
					System.out.println("Fishtype are's are not same");
				}

			}

		}
		return false;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public FishType getType() {
		return type;
	}



	public void setType(FishType type) {
		this.type = type;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	

}
