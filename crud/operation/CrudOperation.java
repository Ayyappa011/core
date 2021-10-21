package com.reddy.crud.operation;

import com.reddy.crud.CrudTester;


public class CrudOperation {

	public static void main(String[] args) {

		CrudTester Refgin = new CrudTester();

		Refgin.addGin("LONDON DRY GIN");
		Refgin.addGin("OLD TOM");
		Refgin.addGin("PLTMOUTH GIN");
		Refgin.addGin("NAVY STRENGTH GIN");

		Refgin.displayGins();

		CrudTester restaurant = new CrudTester();

		restaurant.addRestaurant("The Table, Mumbai");
		restaurant.addRestaurant("Bomra's, Goa");
		restaurant.addRestaurant("Trishna, Mumbai");
		restaurant.addRestaurant("Slink & Bardot, Mumbai");

		restaurant.displayResort();

		CrudTester resort = new CrudTester();

		resort.addResort("woodrose");
		resort.addResort("Royal Orchid Resort & Convention Centre");
		resort.addResort("Palm Meadows Club");

		resort.displayResort();

		CrudTester waterFall = new CrudTester();

		waterFall.addWaterFall("dudhsagar waterfalls");
		waterFall.addWaterFall("hebbe waterfalls");
		waterFall.addWaterFall("magod waterfalls");

		waterFall.displayWaterFall();

	}

}
