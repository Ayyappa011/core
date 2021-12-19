package com.ayyappa.collection2.implementation;

import com.ayyappa.collection2.functionallinterface.PaintsSearch;

public class EqualsPaints implements PaintsSearch {

	@Override
	public boolean expression(String s1, String s2) {
		System.out.println("invoked equals paints");
		return s1.equals(s2);
	}

}
