package com.ayyappa.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AadharNoAndName {

	public static void main(String[] args) {
		
		
		Map<Double, String> aadharNoAndName = new HashMap<Double, String>();
		
		aadharNoAndName.put(785841449533d, "Ayyappa Reddy");
		aadharNoAndName.put(835923869678d, "Sanguu");
		aadharNoAndName.put(895822149533d, "Sunitha Reddy");
		aadharNoAndName.put(805841449147d, "vandu");
		aadharNoAndName.put(875841449789d, "teju");
		
		
		Set<Double> stes = aadharNoAndName.keySet();
		System.out.println("---------Only key value");
		stes.stream().sorted().forEach((e) -> System.out.println(e));
		Collection<String> values = aadharNoAndName.values();
		System.out.println("--------------only Value of values-------------");
		values.stream().sorted(Comparator.reverseOrder()).forEach((r) -> System.out.println(r));
		System.out.println("--------------------- Using entrySet()-------------------");
		Set<Map.Entry<Double, String>> entrys = aadharNoAndName.entrySet();
		Iterator<Map.Entry<Double, String>> iterator = entrys.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Double, String> elements = iterator.next();
			System.out.println(String.valueOf(elements.getKey()).concat(" ").concat(String.valueOf(elements.getValue())));
		}
		System.out.println("---------------------Both key and value------------------------");

		entrys.forEach((entry) -> System.out
				.println(String.valueOf(entry.getKey()).concat(" ").concat(String.valueOf(entry.getValue().endsWith("u")))));
		System.out
				.println("-----------------------------------Using Stream().filter().collect()-----------------------");
        
        Map<Object, Object> filteredMap = aadharNoAndName
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == "Sunitha Reddy" )
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
              System.out.println(filteredMap);
        }
	}


