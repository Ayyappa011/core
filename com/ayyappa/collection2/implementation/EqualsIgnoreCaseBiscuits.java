package com.ayyappa.collection2.implementation;

import com.ayyappa.collection2.functionallinterface.BiscuitSearch;

public class EqualsIgnoreCaseBiscuits implements BiscuitSearch {

	@Override
	public boolean expression(String a1, String a2) {
	System.out.println("invoked Equals Ignore Case Biscuits");
		return a1.equalsIgnoreCase(a2);
	}

}
