package com.reddy.device.icecream;

import com.reddy.device.icecream.flavourtype.FlavourType;

public class IceCreamTester {

	public static void main(String[] args) {

		IceCream ice = new IceCream();

		System.out.println(ice.toString());
		System.out.println(ice.hashCode());
	    ice.setFtype(FlavourType.CHOCOLATECHIPCOOKIEDOUGH);
	    
	    ice.getFtype();
	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    
	    IceCream ice4=new IceCream();
	    
	    System.out.println(ice4.toString());
	    System.out.println(ice4.hashCode());
	    
	    ice4.setFtype(FlavourType.VANILLA);
	    ice4.getFtype();
	    
	    
	    boolean icecream = ice4.equals(ice);
	    System.out.println(icecream);
	    
	    
		
		
		

	}

}
