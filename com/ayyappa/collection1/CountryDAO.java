package com.ayyappa.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO {
	private Collection<String> countryDAO = new ArrayList<String>();

	public boolean save(String name) {
		return this.countryDAO.add(name);
	}
	public boolean findMatching(String place) {
		if (place != null) {
			if (place.contains(place)) {
				System.out.println("place matched");
				return true;
			}
		}
		System.out.println("place not matched");
		return false;

	}

	public boolean findMatchingCaseSensitive(String name) {
		Iterator<String> itr =  countryDAO.iterator();

		while (itr.hasNext()) {
			String type = itr.next();
			if (type.equalsIgnoreCase(name)) {
				System.out.println("place matched");
				return true;
			}
		}

		return false;
	}

	public boolean findMatchingStartswith(String chars) {
		System.out.println("invoked  method find matching starts with some charters");
		Iterator<String> itr =  countryDAO.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().startsWith(chars.toUpperCase())) {
				System.out.println("place matched");
				return true;
			}
		}

		return false;
	}

	public boolean findMatchingendswith(String chars) {
	System.out.println("invoked  method find matching ends with some charters");
		Iterator<String> itr =  countryDAO.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().endsWith(chars.toUpperCase())) {
				System.out.println("place matched");
				return true;
			}
		}

		return false;
	}
}
