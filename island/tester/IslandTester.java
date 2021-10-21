package com.reddy.island.tester;

import com.reddy.island.*;

public class IslandTester {

	public static void main(String[] args) {

		IslandOperator IslandTester = new IslandOperator();
		System.out.println(IslandTester);

		IslandTester.addIslandNames("Munroe Island");
		IslandTester.addIslandNames("Munroe Island");
		IslandTester.addIslandNames("Munroe Island");
		IslandTester.addIslandNames("Munroe Island");

		IslandTester.displayislandName();

	}

}
