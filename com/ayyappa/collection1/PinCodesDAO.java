package com.ayyappa.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PinCodesDAO {

	private Collection<Integer> pincodesDAO = new ArrayList<Integer>();

	public boolean save(int pincode) {
		return this.pincodesDAO.add(pincode);
	}

	public boolean findMatchingPinCode(int pinNumber) {
		if (pinNumber != 0) {
			if (pincodesDAO.contains(pinNumber)) {
				System.out.println("PinCode matched here");
				return true;
			}
		}
		System.out.println("PinCode doesn't matched here");
		return false;
	}
	public boolean findMatchingStartswith(int num) {
	
		System.out.println("if  we pass any starting number than it will invoked this method");
	Iterator<Integer> iterator=pincodesDAO.iterator();
	while(iterator.hasNext()) {
		Integer integer=iterator.next();
		integer.
	}
	return false;
	
	
	
	
	
	}
}
