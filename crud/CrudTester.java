package com.reddy.crud;

public class CrudTester {

	private String[] gins = new String[5];

	private int counter = 0;
//gin	
	public void addGin(String name)
	{
		System.out.println("passed arguments ".concat(name));
		if (this.counter < this.gins.length) {
			this.gins[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("Gin Array is full. You cant add more");
		}
	}

	public void displayGins() {
		System.out.println("elements of Gins ");
		for (int gin = 0; gin < this.gins.length; gin++) {
			System.out.println(gins[gin]);
		}
	}
	//restaurant
	private String[] restaurants = new String[4];

	
		public void addRestaurant(String name) 
		{
			System.out.println("passed arguments ".concat(name));
			if (this.counter < this.restaurants.length) {
				this.restaurants[this.counter] = name;
				this.counter++;
			} else {
				System.out.println("Restaurant Array is full. You cant add more");
			}
		}
//resort
		private String[] resorts = new String[5];

		public void addResort(String name)
		{
			System.out.println("passed arguments ".concat(name));
			if (this.counter < this.resorts.length) {
				this.resorts[this.counter] = name;
				this.counter++;
			} else {
				System.err.println("Resort Array is full. You cant add more");
			}
		}

		public void displayResort()
		{
			System.out.println("elements of Resort");
			for (int I = 0; I < this.resorts.length; I++) {
				System.out.println(resorts[I]);
			}
		}
//waterfalls

		private String[] waterFalls = new String[5];

		
		public void addWaterFall(String name)
		{
			System.out.println("passed arguments ".concat(name));
			if (this.counter < this.waterFalls.length) {
				this.waterFalls[this.counter] = name;
				this.counter++;
			} else {
				System.err.println("WaterFall Array is full. You cant add more");
			}
		}

		public void displayWaterFall() 
		{
			System.out.println("elements of WaterFall");
			for (int falls = 0; falls < this.waterFalls.length; falls++)
			{
				System.out.println(waterFalls[falls]);
			}
		}


}
