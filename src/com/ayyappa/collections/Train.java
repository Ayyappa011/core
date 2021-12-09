package com.ayyappa.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ayyappa.collections.sort.Numbers;


public class Train {

	public static void main(String[] args) {
		List<Integer> trainNo = new ArrayList<Integer>();
		trainNo.add(8050);
		 trainNo .add(7204);
		 trainNo.add(9380);
		 trainNo.add(9449);
		 trainNo.add(9483);
		 trainNo.add(9483);
		 trainNo.add(9483);
		 trainNo.add(9886);
		 trainNo.add(7202);
		 trainNo.add(7852);

		System.out.println("LIST");
		System.out.println(trainNo.size());
		Collections.sort(trainNo);
		System.out.println("acending order....");
		
		
		Iterator<Integer> itr = trainNo.iterator();
		while (itr.hasNext()) {
			Integer type = itr.next();
			System.out.println(type);
		}

		System.out.println("----------------------------");
		System.out.println("decending...........");
		
	
		Comparator<Integer> compare= new Numbers();
		Collections.sort(trainNo, compare);
		
		Iterator<Integer> itr1 = trainNo.iterator();
	
	
		while (itr1.hasNext()) {
			Integer type = itr1.next();
			System.out.println(type);
			
		}

	
System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("SET");
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.add(8050);
		set1.add(7204);
		set1.add(9380);
		set1.add(9449);
		set1.add(9483);
		set1.add(9483);
		set1.add(9483);
		set1.add(9886);
		set1.add(7202);
		set1.add(7852);

		System.out.println(set1.size());
		System.out.println("acending order....");

		Iterator<Integer> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("----------------------------");
		System.out.println("descending order....");

		
		
		Comparator<Integer> comp1 =   new Numbers();
		Collections.sort(trainNo, comp1);
		Iterator<Integer> itr3 = trainNo.iterator();
		while (itr3.hasNext()) {
			Integer type1 = itr3.next();
			System.out.println(type1);
		}

	}

	}

