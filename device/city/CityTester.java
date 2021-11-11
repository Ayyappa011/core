package com.reddy.device.city;

public class CityTester {

	public static void main(String[] args) {

		City city = new City();
		city.setCountryName("INDIA");

		City city1 = new City();
		city1.setCountryName("INDIA");
		
		boolean equal=city.equals(city1);
		System.out.println(equal);
		

	}

}
