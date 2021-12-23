package com.ayyappa.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollageAndTotalStudents {

	public static void main(String[] args) {

		Map<String, Integer> CollageAndTotalStudents = new HashMap<String, Integer>();

		CollageAndTotalStudents.put("NIE-IT", 1202);

		CollageAndTotalStudents.put("BITM", 2500);

		CollageAndTotalStudents.put("VV", 1235);

		CollageAndTotalStudents.put("NIE", 4500);

		CollageAndTotalStudents.put("PES", 1202);
		Set<String> stes = CollageAndTotalStudents.keySet();
		stes.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		// here I am going to sorted Integer values
		System.err.println("--here I am going to sorted Integer values--");
		Collection<Integer> collections = CollageAndTotalStudents.values();
		collections.stream().sorted().forEach((s) -> System.out.println(s));

		// Entry<K,V> entrySet();
		Set<Map.Entry<String, Integer>> entrySets = CollageAndTotalStudents.entrySet();
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
