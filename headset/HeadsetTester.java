package com.reddy.device;

import com.reddy.device.type.HeadsetType;
import com.reddy.headset.Headset;

public class HeadsetTester {

	public static void main(String[] args) {

		Headset obj = new Headset();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(HeadsetType.CLOSEDBACKHEADPHONES);
		System.out.println("...................................");
		Headset headset = new Headset();
		headset.setBrand("BOAT");
		headset.setWarranty(3);

		obj.setBrand("BOTA");
		obj.setWarranty(3);
		obj.setBattery("Good");
		obj.setType(HeadsetType.OVEREARHEADPHONES);

		System.out.println(headset.getWarranty());
		System.out.println(headset.getBrand());
		System.out.println("----------------------------------------");
		System.out.println(obj.getBrand());
		System.out.println(obj.getBattery());
		System.out.println(obj.getWarranty());
		System.out.println(obj.getType());
		System.out.println("...................................");
		
		boolean equal=obj.equals(headset);
		System.out.println(equal);
	}
	

}