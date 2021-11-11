package com.reddy.device.aeroplane;

public class AeroplaneTester {

	public static void main(String[] args) {

		AeroPlane plane = new AeroPlane(1458, "AIR INDIA", "INDIA GOVT");
		AeroPlane plane2 = new AeroPlane(1458, "AIR INDIA", "INDIA GOVT");
		
		plane.getPlanNo();
		plane2.getPlanNo();
		plane.setPlanNo(142);
		plane2.setPlanNo(142);
		
		boolean match=plane.equals(plane2);
		System.out.println(match);
		
		
		
		
		System.out.println("Plane no:" + plane.getPlanNo());
		System.out.println("Plane company Name:" + plane.getCompany());
		System.out.println("which govt:" + plane.getGovt());

		System.out.println("------------------------------------------------");

		Class plane1 = plane.getClass();

		System.out.println("Display madifier name:".concat(String.valueOf(plane1.getModifiers())));

		System.out.println(plane1.getName());
		System.out.println("Class Program fils Name:" + plane1.getSimpleName());
		System.out.println("Java get class name:"+plane1.getClass());
		
		
		
		
		
		
		
		

	}

}
