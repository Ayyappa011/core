package com.xworkz.cooldrink;

public class CoolDrinks {

	private String[] cooldrinksNames = new String[5];
	private String name;
	private int price;
	private int counter = 0;

	public CoolDrinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String[] getCooldrinksNames() {
		return cooldrinksNames;
	}

	public void setCooldrinksNames(String[] cooldrinksNames) {
		this.cooldrinksNames = cooldrinksNames;
	}

	public void addcooldrinksNames(String drinksname) {
		System.out.println("Cool Drinks name is:-".concat(drinksname));
		if (counter < this.cooldrinksNames.length) {
			this.cooldrinksNames[counter++] = drinksname;

		} else {
			System.out.println("No cooldrinkings are store here");
		}
	}

	public void delete(int index) {
		if (index < this.cooldrinksNames.length && this.cooldrinksNames.length >= 0) {
			this.cooldrinksNames[index] = null;
		} else {
			System.out.println("array is full");
		}
	}

	public void update(int mak, String newref) {
		if (mak < this.cooldrinksNames.length && this.cooldrinksNames.length >= 0) {
			this.cooldrinksNames[mak] = newref;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getprice() {

		return null;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
