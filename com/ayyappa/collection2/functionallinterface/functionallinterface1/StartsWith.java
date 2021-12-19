package com.ayyappa.collection2.functionallinterface.functionallinterface1;

import com.ayyappa.collection2.implementation.implement2.Find;

public class StartsWith  implements Find{

	@Override
	public boolean expression(String a1, String a2) {
		System.out.println("invoked methode starts with charter");
		return a1.startsWith(a2);
	}

}
