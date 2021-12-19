package com.ayyappa.collection2.functionallinterface.functionallinterface1;

import com.ayyappa.collection2.implementation.implement2.Find;

public class EndsWith  implements Find{

	@Override
	public boolean expression(String a1, String a2) {
		System.out.println("Elements endswith charter");
		return a1.endsWith(a2);
	}

}
