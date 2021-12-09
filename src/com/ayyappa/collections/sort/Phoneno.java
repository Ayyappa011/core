package com.ayyappa.collections.sort;

import java.util.Comparator;


public class Phoneno implements  Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		
		return o1.compareTo(o2);
	}
	
		

}
