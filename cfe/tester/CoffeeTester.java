package com.xworkx.cfe.tester;

import com.xworkx.cfe.Coffee;

public class CoffeeTester {

	public static void main(String[] args) {
		
		Coffee cfe = new Coffee("Bru",56);
		System.out.println(cfe.name);
		System.out.println(cfe.price);
		
		
		
		
		cfe.getCoffee();
		
		
		cfe.addCoffee("TATA CFE");
		cfe.addCoffee("LEMAN CFE");
		cfe.addCoffee("CFE");
		cfe.addCoffee("LUCKY CFE");
		
		cfe.delete(3);
		cfe.update(1, "MAD");
		
	String[] mref=	cfe.getCoffee();
	for (int i = 0; i < mref.length; i++) {
		System.out.println(mref[i]);
		
		
	}
		
		

	}

}
