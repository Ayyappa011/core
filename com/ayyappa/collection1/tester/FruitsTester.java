package com.ayyappa.collection1.tester;

import com.ayyappa.collection1.FruitsDAO;

public class FruitsTester {

	public static void main(String[] args) {
		FruitsDAO daos = new FruitsDAO();
		daos.save("Kaju");
		daos.save("Almond ");
		daos.save("Apricot");
		daos.save("Dates");
		daos.save("Pistachios");

		boolean str = daos.findMatching("Dates");
		System.out.println(str);

		boolean itr = daos.findMatchingCaseSensitive("PISTACHIOS");
		System.out.println(itr);

		boolean itr1 = daos.findMatchingStartswith("K");
		System.out.println(itr1);

		boolean itr2 = daos.findMatchingendswith("OND");
		System.out.println(itr2);

	}

}
