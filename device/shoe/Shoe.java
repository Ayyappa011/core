package com.reddy.device.shoe;

public class Shoe {
	private String brand;
	private String color;
	private String gender;
	private int size;

	public Shoe() {

	}

	public Shoe(String brand, String color, String gender, int size) {
		super();
		this.brand = brand;
		this.color = color;
		this.gender = gender;
		this.size = size;
	}

	@Override
	public String toString() {

		return super.toString();
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("invoked equal method is not equal to null");

			if (obj instanceof Shoe) {
				Shoe casted = (Shoe) obj;

				String match = casted.getBrand();

				if (this.brand.equals(match)) {
					System.out.println("Brand are's are same");

					return true;
				} else {
					System.out.println("Brand are's are not same");
				}

			}

		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
