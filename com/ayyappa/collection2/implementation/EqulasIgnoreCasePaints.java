package com.ayyappa.collection2.implementation;

import com.ayyappa.collection2.functionallinterface.PaintsSearch;

public class EqulasIgnoreCasePaints implements PaintsSearch {

	@Override
	public boolean expression(String s1, String s2) {
		System.out.println("invoked equlas ignore case  method");
		return s1.equalsIgnoreCase(s2);
	}

}
