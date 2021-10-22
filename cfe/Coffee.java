package com.xworkx.cfe;

public class Coffee {

	private String[] coffee = new String[4];
	private int counter = 0;
	public String name;
	public int price;

	 public Coffee(String name, int price) {
		this.name = name;
		this.price=price;
	}

	public void addCoffee(String coffename) { // create,read,delete,update
		System.out.println("Coffee Name is:-".concat(coffename));
		if (counter < this.coffee.length) {
			this.coffee[counter] = name;
			this.counter++;

		} else {
			System.out.println("Coffee Name is not available");

		}
	}

	public String[] getCoffee() {
		return this.coffee;
	}

	public void delete(int index) {
		if (index < this.coffee.length && this.coffee.length >= 0) {
			this.coffee[index] = null;
		} else {
			System.out.println("array is full");
		}
	}

	public void update(int mad, String newref) {
		if (mad < this.coffee.length && this.coffee.length >= 0) {
			this.coffee[mad] = newref;
		}

	}
}
