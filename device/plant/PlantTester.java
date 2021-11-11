package com.reddy.device.plant;

public class PlantTester {

	public static void main(String[] args) {
		
		
		
		Plant obj = new Plant();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
		obj.setName("Coral Bells");
		obj.getName();
		
		
		
		
		Plant obj1 = new Plant();
		obj1.setName("Coral Bells");
		obj1.getName();
		
		boolean equal=obj.equals(obj1);
		System.out.println(equal);
		
		
		

	}

}
