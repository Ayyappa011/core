package com.reddy.hajama;

public class FishTester {

	public static void main(String[] args) {
		 
		
		Fish fish = new Fish();
		System.out.println(fish.region);
	System.out.println(fish.alive);
	
	System.out.println("``````````````````````");

	SharkFaish sharkfish = new SharkFaish(78,88);
	System.out.println(sharkfish.height);
	System.out.println(sharkfish.weight);
	}

}
