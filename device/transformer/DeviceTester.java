package com.reddy.device;

import com.reddy.device.transformer.RatioTransfomer;
import com.reddy.device.transformer.Transfomer;


public class DeviceTester {

	public static void main(String[] args) {
		
		
		
		Transfomer t1 = new Transfomer("High vtg transfomer", "Water cooling Transfomer", 230000, 78);
		System.out.println(t1.name);
		
		t1.transfomerName("booster Transfomer");
		System.out.println("............................");
		t1.selltransfomer(450000);
		System.out.println("............................");
		

		t1= new Transfomer();
		
		RatioTransfomer rt1 = new RatioTransfomer("Current Transfomer", "low vtg transfomer", 780000, 79,"Air cooling Transfomer");
		rt1.selltransfomer(500000);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println( "ratio Transfomer is :"+(rt1).tname);

		System.out.println("............................");
		
		System.out.println(rt1.getPrice());
		System.out.println(rt1.getSize());
		System.out.println(rt1.getType());
		System.out.println(rt1.name);
		System.out.println(rt1.tname);
		
		
		
	}

}
