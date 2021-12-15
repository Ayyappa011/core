package com.ayyappa.collection1.tester;

import com.ayyappa.collection1.CountryDAO;

public class Countrytester {

	public static void main(String[] args) {
	
		CountryDAO dao = new CountryDAO();
		dao.save("India");
		dao.save("Belize");
		dao.save("Canada");
		dao.save("Germany");
		
		boolean countryName = dao.findMatching("GERMANY");
		System.out.println(countryName);
		System.out.println("___________________________________________");
		boolean itr = dao.findMatchingCaseSensitive("canada");
		System.out.println(itr);
		System.out.println("___________________________________________");

		boolean itr1 = dao.findMatchingStartswith("ind");
		System.out.println(itr1);
		System.out.println("___________________________________________");
		boolean itr2 = dao.findMatchingendswith("ia");
		System.out.println(itr2);
		System.out.println("___________________________________________");

	}

}
