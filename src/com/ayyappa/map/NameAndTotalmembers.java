package com.ayyappa.map;


import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

public class NameAndTotalmembers {

	public static void main(String[] args) {
		// In map there is one method put()
		Map<String, Integer> nameAndTotalmembers = new HashMap<String, Integer>();
		nameAndTotalmembers.put("Ayyappa Reddy", 04);
		nameAndTotalmembers.put("Vandu", 03);
		nameAndTotalmembers.put("teju", 03);
		nameAndTotalmembers.put("Sahana", 04);
		nameAndTotalmembers.put("Sunitha", 05);
		nameAndTotalmembers.put("sanguu", 04);
		//
		Set<String> stes = nameAndTotalmembers.keySet();
		stes.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		// here I am going to sorted Integer values
		System.err.println("--here I am going to sorted Integer values--");
		Collection<Integer> collections = nameAndTotalmembers.values();
		collections.stream().sorted().forEach((s) -> System.out.println(s));

		// Entry<K,V> entrySet();
		Set<Map.Entry<String, Integer>> entrySets = nameAndTotalmembers.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entrySets.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> element = iterator.next();
			System.out.println(element.getKey().concat(" ").concat(String.valueOf(element.getValue())));
		}
		System.out.println("---------------------Both key and value------------------------");

		entrySets.forEach(
				(entry) -> System.out.println(entry.getKey().concat("    ").concat(String.valueOf(entry.getValue()))));
		
	}

}
