package com.ayyappa.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ayyappa.collections.sort.Names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ProductBasedCompanies {

	public static void main(String[] args) {
		List<String> productBasedCompanies = new ArrayList<String>();
		productBasedCompanies.add("LTI");
		productBasedCompanies.add("IBM");
		productBasedCompanies.add("google");
		productBasedCompanies.add("bosce");
		productBasedCompanies.add("Adobe");
		productBasedCompanies.add("CISCO");
		productBasedCompanies.add("Microsoft");
		
		Iterator<String> itl=productBasedCompanies.iterator();
		while(itl.hasNext()) {
			String str=itl.next();
			System.out.println(str);
			
		}
		System.out.println("=================================");
		Comparator<String> compare = new Names();
		Collections.sort(productBasedCompanies, compare);
		
		Iterator<String> itl2=productBasedCompanies.iterator();
		while(itl2.hasNext()) {
			String str1=itl2.next();
			System.out.println(str1);
			
		}
		System.out.println("=================================");
		Set<String> productBasedCompanies1 = new TreeSet<String>();
		productBasedCompanies1.add("hp");
		productBasedCompanies1.add("Informatica");
		productBasedCompanies1.add("INTEL");
		productBasedCompanies1.add("MCAFEE");
		productBasedCompanies1.add("Salesforce");
		productBasedCompanies1.add("FILPKART");
		productBasedCompanies1.add("UBER");
		productBasedCompanies1.add("Oracle");
		
		Iterator<String> iterator=productBasedCompanies1.iterator();
		while(iterator.hasNext()) {
			String iterator1=iterator.next();
			System.out.println("Ascending order:"+"  "+iterator1);
			
		}
		System.out.println("");
		
		Comparator<String> compare1= new Names();
		Collections.sort(productBasedCompanies, compare1);
		Iterator<String>  iterator2=productBasedCompanies1.iterator();
		
		while(iterator2.hasNext()) {
			String str3=iterator2.next();
			System.out.println(str3);
		}
		
		
		
	}

}
