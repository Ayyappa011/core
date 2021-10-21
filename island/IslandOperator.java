package com.reddy.island;

public class IslandOperator {

	private String country = new String();
	private String[] IslandNames = new String[6];
	int counter=0;

	public IslandOperator() {

	}

	public IslandOperator(String[] i) {
		this.IslandNames = i;
	}

	public String getcountry() {
		return country;
	}

	public void addIslandNames(String name) {
		if (this.counter <8) {
			this.IslandNames[this.counter] = name;
			this.counter++;

		} else {
			System.out.println("array is full,cannot add go do what ever you want");
		}
	}

	public void displayislandName() {
		for (int K = 0; K <= this.counter; K++) {
			String name1 = this.IslandNames[K];
			System.out.println(name1);

		}

	}

}
