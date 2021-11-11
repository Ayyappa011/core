package com.reddy.device.icecream;

import com.reddy.device.icecream.flavourtype.FlavourType;
import com.reddy.device.icecream.flavourtype.type.IceCreamType;


public class IceCream {
	 private String name;
	 private IceCreamType type;
	 private FlavourType ftype;
	 
	 @Override
	public String toString() {
		
		return "CUPICE";
	}
	
	@Override
	public int  hashCode() {
		
		return 45;
	}
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("invoked equal method is not equal to null");
			return false;

		}
		if (obj instanceof IceCream) {
			IceCream casted = (IceCream) obj;
			FlavourType ice = casted.getFtype();

			System.out.println(" Icecream FlavourType name :".concat(String.valueOf(ice)));

			if (this.ftype.equals(ice)) {
				System.out.println("Icecream FlavourType name's are same");

				return true;
			} else {
				System.out.println("Icecream FlavourType name's are not same");
				return false;
			}

		}
		return false;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IceCreamType getType() {
		return type;
	}
	public void setType(IceCreamType type) {
		this.type = type;
	}
	public FlavourType getFtype() {
		return ftype;
	}
	public void setFtype(FlavourType ftype) {
		this.ftype = ftype;
	}
	

}
