package com.reddy.hajama;

public class SharkFaish extends Fish {
	
	public float height;
	public float weight;
	
	public SharkFaish() {
		
		super();
		System.out.println("Calling SharkFish....");
	}

	public SharkFaish(float height, float weight) {
		
		this.height = height;
		this.weight = weight;
		System.out.println("Invoked arg const..");
	}

}
