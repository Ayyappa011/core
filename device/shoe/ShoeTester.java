package com.reddy.device.shoe;

public class ShoeTester {

	public static void main(String[] args) {
		
		
		
		Shoe shoe = new Shoe();
		shoe.setBrand("NIKE");
		
		
		Shoe shoe1=new Shoe();
		shoe1.setBrand("NIKE");
		
		System.out.println(shoe.equals(shoe1));
		
		

	}

}
