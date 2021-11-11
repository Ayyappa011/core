package com.reddy.device.belt;

public class Bolt {
	private int price;
	private String material;
	private int size;
	private String gender;
	

	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("invoked equal method is not equal to null");

			if (obj instanceof Bolt) {
				Bolt casted = (Bolt) obj;

				String match = casted.getMaterial();

				if (this.material.equals(match)) {
					System.out.println("Bolt are's are same");

					return true;
				} else {
					System.out.println("Bolt are's are not same");
				}

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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
