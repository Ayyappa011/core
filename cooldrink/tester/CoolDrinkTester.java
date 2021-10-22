package com.xworkz.cooldrink.tester;

import com.xworkz.cooldrink.CoolDrinks;

public class CoolDrinkTester {

	public static void main(String[] args) {
		
		CoolDrinks Cooldrinksref = new CoolDrinks("Orande",120);
		
		System.out.println(Cooldrinksref.getName());
		System.out.println(Cooldrinksref.getprice());
		
		Cooldrinksref.delete(4);
		Cooldrinksref.update(4, "Pink cham-pine");

		Cooldrinksref.addcooldrinksNames("appie");
		Cooldrinksref.addcooldrinksNames("strawpple");
		Cooldrinksref.addcooldrinksNames("flu fighter");
		Cooldrinksref.addcooldrinksNames("pinoopple kiss");
		
		String[] coolref =Cooldrinksref.getCooldrinksNames();
		for (int i = 0; i < coolref.length; i++) {
			
		}
		
		
		

	}

}
