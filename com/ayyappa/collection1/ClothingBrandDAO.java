package com.ayyappa.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothingBrandDAO {
	private Collection<String> clothBrandaDaos = new ArrayList<String>();

	public boolean save(String brand) {
		
		return this. clothBrandaDaos .add(brand);
	}

	public boolean findMatching(String brand) {
		if (brand != null) {
			if (clothBrandaDaos .contains(brand)) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does't match");
		return false;
	}

	public boolean findMatchingCaseSensitive(String brand) {
		Iterator<String> itr = clothBrandaDaos .iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.equalsIgnoreCase(brand)) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does't match");
		return false;
	}

	public boolean findMatchingStartswith(String brand) {
		System.out.println("invoked method Matching starts With charters");
		Iterator<String> itr = clothBrandaDaos .iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().startsWith(brand.toUpperCase())) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does't match");
		return false;
	}

	public boolean findMatchingendswith(String brand) {
		System.out.println("invoked method Matching Ends With charters");
		Iterator<String> itr =  clothBrandaDaos .iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().endsWith(brand.toUpperCase())) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does't match");
		return false;
	}
}
