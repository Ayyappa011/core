package com.ayyappa.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;
import java.util.stream.Collectors;

public class CountryAndState {

	public static void main(String[] args) {
		Map<String, String> CountryAndState = new HashMap<String, String>();
		CountryAndState.put("IN", "KA");
		CountryAndState.put("AN", "AP");
		CountryAndState.put("IM", "MP");
		CountryAndState.put("CJ", "JP");
		CountryAndState.put("MG", "KL");
		CountryAndState.put("DP", "TN");

		Set<String> stes = CountryAndState.keySet();
		System.out.println("---------Only key value");
		stes.stream().sorted().forEach((e) -> System.out.println(e));
		Collection<String> values = CountryAndState.values();
		System.out.println("--------------only Value of values-------------");
		values.stream().sorted(Comparator.reverseOrder()).forEach((r) -> System.out.println(r));
		System.out.println("--------------------- Using entrySet()-------------------");
		Set<Map.Entry<String, String>> entrys = CountryAndState.entrySet();
		Iterator<Map.Entry<String, String>> iterator = entrys.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, String> elements = iterator.next();
			System.out.println(elements.getKey().concat(" ").concat(elements.getValue()));
		}
		System.out.println("---------------------Both key and value------------------------");

		entrys.forEach((entry) -> System.out
				.println(entry.getKey().concat(" ").concat(String.valueOf(entry.getValue().endsWith("P")))));
		System.out
				.println("-----------------------------------Using Stream().filter().collect()-----------------------");
		Map<String, String> filteredMap = CountryAndState
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey() == "IM" )
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
              System.out.println(filteredMap);
	}

}
