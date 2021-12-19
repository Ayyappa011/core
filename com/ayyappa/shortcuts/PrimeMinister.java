package com.ayyappa.shortcuts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeMinister {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Amitshah");
		list.add("RahulGandhi");
		list.add("Yogiadity");
		list.add("mansingh");
		list.add("Narendra Modi");
		list.add("H. D. Deve Gowda");
		list.add("Atal Bihari Vajpayee");
		list.add("Manmohan Singh");

		System.out.println("Using For loop");
		for (String element : list) {

			System.out.println(element);

		}
		System.out.println("================================================");
		System.out.println("Using ForEach method");
		list.forEach((s) -> {
			System.out.println(s);
		});

		System.out.println("================================================");

		System.err.println("Using List Iterator reverse order using ref dot size");
		ListIterator<String> listIterator = list.listIterator(list.size());

		while (listIterator.hasPrevious()) {
			String str = listIterator.previous();
			System.out.println(str);
		}

		System.out.println("================================================");
		System.err.println("Using List Iterator  order ");
		ListIterator<String> listIterator1 = list.listIterator();
		while (listIterator1.hasNext()) {
			String str1 = listIterator1.next();
			System.out.println(str1);

		}

	}

}
