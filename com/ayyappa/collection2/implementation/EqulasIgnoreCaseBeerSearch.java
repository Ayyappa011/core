package com.ayyappa.collection2.implementation ;

import com.ayyappa.collection2.functionallinterface.BeerSearch;

public class EqulasIgnoreCaseBeerSearch implements BeerSearch {

	@Override
	public boolean expression(String args1, String args2) {
System.out.println("invoked equals Ignore case method");
		return args1.equalsIgnoreCase(args2);
	}

}
