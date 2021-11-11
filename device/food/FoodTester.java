package com.reddy.device.food;

public class FoodTester {

	public static void main(String[] args) {
		
		Food food = new Food();
		food.setName("ROTI");
		
		
		Food food1=new Food();
		food1.setName("ROTI");
		
		
		System.out.println(food.equals(food1));
		

	}

}
