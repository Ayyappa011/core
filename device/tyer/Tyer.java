package com.reddy.device.tyer;


import com.reddy.device.tyer.type.TyerType;

public class Tyer {
	private String brand;
	private TyerType type;
	private int price;
	
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("invoked equal method is not equal to null");

			if (obj instanceof Tyer) {
				Tyer casted = (Tyer) obj;

				TyerType match = casted.getType();

				if (this.type.equals(match)) {
					System.out.println("tyerType name are's are same");
					System.out.println("Both are same than print  :".concat(String .valueOf(match)));

					return true;
				} else {
					System.out.println("tyerType name are's are not same");
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
	public TyerType getType() {
		return type;
	}
	public void setType(TyerType type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

}
