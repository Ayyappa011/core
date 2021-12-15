package com.ayyappa.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FruitsDAO {
	private Collection<String> fruitsDaos = new ArrayList<String>();

	public boolean save(String name) {

		return this.fruitsDaos.add(name);
	}

	public boolean findMatching(String name) {
		if (name != null) {
			if (fruitsDaos.contains(name)) {
				System.out.println("fruits name matched");
				return true;
			}
		}
		System.err.println("fruits name does't match");
		return false;
	}

	public boolean findMatchingCaseSensitive(String name) {
		Iterator<String> itr = fruitsDaos.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.equalsIgnoreCase(name)) {
				System.out.println("fruits name matched");
				return true;
			}
		}
		System.err.println("fruit name doen't match");
		return false;
	}

	public boolean findMatchingStartswith(String name) {
		System.out.println("Matching Starts With any chrater");
		Iterator<String> itr = fruitsDaos.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().startsWith(name.toUpperCase())) {
				System.out.println("fruits name matched");
				return true;
			}
		}
		System.err.println("fruit name does't match");
		return false;
	}

	public boolean findMatchingendswith(String name) {
		System.out.println("Matching ends With any chrater");
		Iterator<String> itr = fruitsDaos.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().endsWith(name.toUpperCase())) {
				System.out.println("fruit name matched");
				return true;
			}
		}
		System.err.println("fruit name does not match");
		return false;
	}

}
