package com.ayyappa.collection1.tester;

import com.ayyappa.collection1.PlaceDAO;

public class PlaceTester {

	public static void main(String[] args) {
		PlaceDAO dao = new PlaceDAO();
		dao.save("Ballari");
		dao.save("Bengalore");
		dao.save("Hyderabad");
		dao.save("Ooty");
		dao.save("Mysuru");
		boolean ref = dao.findMatching("ballari");
		System.out.println(ref);
		System.out.println("___________________________________________");
		boolean itr = dao.findMatchingCaseSensitive("Ooty");
		System.out.println(itr);
		System.out.println("___________________________________________");

		boolean itr1 = dao.findMatchingStartswith("oo");
		System.out.println(itr1);
		System.out.println("___________________________________________");
		boolean itr2 = dao.findMatchingendswith("ari");
		System.out.println(itr2);
		System.out.println("___________________________________________");
	}

}
