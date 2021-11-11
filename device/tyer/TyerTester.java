package com.reddy.device.tyer;

import com.reddy.device.tyer.type.TyerType;

public class TyerTester {
	
	public static void main(String args[]) {
	
	
	Tyer tyer=new Tyer();
	tyer.setType(TyerType.TUBELESS);
	
	
	
	Tyer tyer1= new Tyer();
	tyer1.setType(TyerType.TUBELESS);
	
	
	
	boolean equal=tyer1.equals(tyer);
	System.out.println(equal);
	

}
}
