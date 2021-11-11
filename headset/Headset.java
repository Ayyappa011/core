package com.reddy.headset;

import com.reddy.device.type.HeadsetType;

public class Headset {

	private String brand;
	private String battery;
	private Integer warranty;
	private HeadsetType type;

	@Override
	public String toString() {

		return "BOAT";
	}

	@Override
	public int hashCode() {

		return 78;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("invoked equal method is not equal to null");
			return false;

		}
		if (obj instanceof Headset) {
			Headset casted = (Headset) obj;
			String headset = casted.getBrand();
			Integer headset1 = casted.getWarranty();
			System.out.println("Headset brand name :".concat(headset));
			System.out.println("Headset Warrenty :".concat(String.valueOf(headset1)));

			if (this.brand.equals(headset) && this.warranty.equals(headset1)) {
				
				return true;
			} else {
				
				return false;
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

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public HeadsetType getType() {
		return type;
	}

	public void setType(HeadsetType type) {
		this.type = type;
	}

}
