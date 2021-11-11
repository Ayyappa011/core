package com.reddy.device;

import com.reddy.device.type.WatchType;
import com.reddy.device.watch.Watch;

public class WatchTester {

	public static void main(String[] args) {

		Watch watch = new Watch();

		System.out.println("To string method using parent class :" + watch.toString());

		System.out.println("by using hash code :" + watch.hashCode());

		System.out.println(WatchType.DIGITAL);

		Watch watch2 = new Watch();
		System.out.println("To string method using parent class :" + watch2.toString());

		System.out.println("by using hash code :" + watch2.hashCode());

		System.out.println(WatchType.ANALOG);

		watch.setName("Sonata");
		watch.setPrice(1599);

		watch2.setName("Sonata");
		watch2.setPrice(1599);

		watch.getName();
		watch.getPrice();
		watch.getType();

		watch2.getName();
		watch2.getPrice();
		watch2.getType();

		boolean equal = watch.equals(watch2);
		System.out.println(equal);

	}

}
