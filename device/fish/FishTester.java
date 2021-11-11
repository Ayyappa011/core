package com.reddy.device.fish;

import com.reddy.device.fish.type.FishType;

public class FishTester {

	public static void main(String[] args) {
		
		
		Fish fish= new Fish();
		
		fish.setType(FishType.CATLA);
		
		Class fish1=fish.getClass();
		System.out.println(fish1.getSimpleName());
		System.out.println(fish1.getTypeName());
		System.out.println(fish1.getModifiers());
		System.out.println(fish1.getTypeName());
		System.out.println(fish1);
		
		
		Fish obj= new Fish();
		obj.setType(FishType.RANI);
		
		System.out.println(fish.equals(obj));
		
		
		

	}

}
