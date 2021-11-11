package com.reddy.device.belt;

public class BoltTester {

	public static void main(String[] args) {
		
		
		Bolt b= new Bolt();
		b.setMaterial("Cotton");
		b.getMaterial();
		
		
		Bolt b1=new Bolt();
		b1.setMaterial("Plastic");
		b1.getMaterial();
		
		System.out.println(b.equals(b1));
		
		
		

	}

}
