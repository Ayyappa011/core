package com.reddy.chocolate.Operator;

public class ChocolateOperator {

	private String Brand = new String();
	private String[] ChocSize = new String[3];
	private float adder = 0;

	public ChocolateOperator() {

	}

	public float getadder() {
		return adder;
	}

	public int adder1 = 5;

	public ChocolateOperator(int size) {
		this.adder1 = size;

	}

	public void ChocolateOperator1(int size) {
		// TODO Auto-generated constructor stub
	}

	public int getadder1() {
		return adder1;

	}

	public void addChocSize(int size) {
		System.out.println("Chocolate size:".concat(Brand));
		if (this.adder1 < 2) {
			this.adder1++;
		} else {
			System.out.println("array is full,cannot add go do what ever you want");
		}
	}

	public void displayChocSize() {
		// Illegal modifier for parameter displayChocName; only final is permitted
		// meaing in java
		for (int i = 0; i < adder1; i++)
			;
		{
			String Brand = this.ChocSize[adder1];
			System.out.println(Brand);
		}

	}

}
