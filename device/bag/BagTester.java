package com.reddy.device.bag;

import com.reddy.device.bag.type.Color;

public class BagTester {

	public static void main(String[] args) {
		
		
		
		Bag bag=new Bag();
		System.out.println(bag.toString());
		System.out.println(bag.hashCode());
		
		
		bag=new Bag();
		bag.setType(Color.PINK);
		bag.getType();
		
		
		
		Bag bag1 = new Bag();
		bag1.setType(Color.RED);
		bag1.getType();
		
		boolean equal= bag.equals(bag1);
		System.out.println(equal);
		
		

	}

}
