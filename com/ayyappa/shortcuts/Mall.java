package com.ayyappa.shortcuts;

import java.util.HashSet;

import java.util.Set;

public class Mall {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Elante Mall");
		set.add("Phoenix Marketcity Mall");
		set.add("Orion Mall");
		set.add("Mantri Square Mall");
		set.add("Esplanade One Mall");
		set.add("Ambience Mall");
		set.add("World Trade Park Mall");

		for (String element : set) {
			System.out.println(element);

		}
		System.out.println("==================================");
		set.forEach((s1) -> {
			System.out.println(s1);
		});
		System.out.println("==================================");

	}

}
