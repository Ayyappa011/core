package com.reddy.device.bag;

import com.reddy.device.bag.type.Color;


public class Bag {
	
	private int price;
	private String sections;
	private Color type;
	
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("invoked equal method is not equal to null");
			return false;

		}
		if (obj instanceof Bag) {
			Bag casted = (Bag) obj;
			Color bag = casted.getType();

			System.out.println("plant name :".concat(String.valueOf(bag)));

			if (this.type.equals(bag)) {
				System.out.println("bag color's are same");

				return true;
			} else {
				System.out.println("bag color's are not same");
				return false;
			}

		}
		return false;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}
	public Color getType() {
		return type;
	}
	public void setType(Color type) {
		this.type = type;
	}
	

	

}
