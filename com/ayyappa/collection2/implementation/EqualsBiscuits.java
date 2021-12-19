package com.ayyappa.collection2.implementation;

import com.ayyappa.collection2.functionallinterface.BiscuitSearch;

public class EqualsBiscuits implements BiscuitSearch {

	@Override
	public boolean expression(String a1, String a2) {
		System.out.println("invoked equals method");
		return a1.equals(a2);
	}

}
