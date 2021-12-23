package com.ayyappa.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileAndName {
	
	    public static void main(String[] args) {
	    	Map<Long, String> MobileAndName = new HashMap<Long, String>();
	    	MobileAndName.put(7975076714L, "Ayyappa reddy");
	    	MobileAndName.put(9148132660L, "Sunitha reddy");
	    	MobileAndName.put(9611606646L, "Sahana");
	    	MobileAndName.put(9611966456L, "Basavana Gowda");
	    	MobileAndName.put(7892726319L, "malli reddy");
	    	
	    	
	    	Set<Long> stes = MobileAndName.keySet();
			stes.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
			// here I am going to sorted Integer values
			System.err.println("--here I am going to sorted Integer values--");
			Collection<String> collections = MobileAndName.values();
			collections.stream().sorted(Comparator.reverseOrder()).forEach((s) -> System.out.println(s));
			System.out.println("---------------------Both key and value------------------------");
			// Entry<K,V> entrySet();
			Set<Map.Entry<Long, String>> entrySets = MobileAndName.entrySet();
			Iterator<Map.Entry<Long, String>> iterator = entrySets.iterator();

			while (iterator.hasNext()) {
				Map.Entry<Long, String> element = iterator.next();
				System.out.println(String.valueOf(element.getKey()).concat(" ").concat(String.valueOf(element.getValue())));
			}
			System.out.println("---------------------Both key and value------------------------");

			entrySets.forEach(
					(entry) -> System.out.println(String.valueOf(entry.getKey()).concat("    ").concat(String.valueOf(entry.getValue()))));
			
	    	
	    }

}
