package com.ayyappa.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ayyappa.collections.sort.Company;


public class Developers  {


	public static void main(String[] args) {
		List<String> developersName = new ArrayList<String>();
		developersName.add("Ayyappa");
		developersName.add("Teju");
		developersName.add("Malli");
		developersName.add("KD");
		developersName.add("Vandu");
		developersName.add("sangu");
		developersName.add("savitha");
		developersName.add("kulli");
		developersName.add("shivu");
		developersName.add("abhi");
		developersName.add("LUCKY");

		System.out.println("LIST");
		System.out.println(developersName.size());
		Collections.sort(developersName);

		System.out.println("acending order.............");

		Iterator<String> itl = developersName.iterator();
		while (itl.hasNext()) {

			String itl1 = itl.next();
			System.out.println(itl1);

			System.out.println("******************************************************");

			System.out.println("Decending..........");

			Comparator<String> comparator = new Company();
			java.util.Collections.sort(developersName, comparator);

			Iterator<String> itl2 = developersName.iterator();
			while (itl2.hasNext()) {
				String str = itl2.next();
				System.out.println(str);

			}
			System.out.println("------------------------------------------------");
			System.out.println("SET");
			Set<String> developers = new TreeSet<String>();
			developers.add("Sangeet");
			developers.add("Sahana");
			developers.add("priya");
			developers.add("ranju");
			developers.add("vandau");
			developers.add("savitha");
			developers.add("gomu");
			developers.add("teju");
			developers.add("sweeti");
			developers.add("Lucky");
			developers.add("reddy");

			Comparator<String> compar =  new Company();
			java.util.Collections.sort((List<String>)developers, compar);

			Iterator<String> names = developers.iterator();
			while (names.hasNext()) {
				String name = names.next();
				System.out.println(name);

			}

		}
	}

	
}
