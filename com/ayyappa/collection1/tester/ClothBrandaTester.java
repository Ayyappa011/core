package com.ayyappa.collection1.tester;

import com.ayyappa.collection1.ClothingBrandDAO;

public class ClothBrandaTester {

	public static void main(String[] args) {
		ClothingBrandDAO dao = new ClothingBrandDAO();

		dao.save("Lee");
		dao.save("L & P");
		dao.save("ARROW");
		dao.save("Peter England");
		dao.save("Us  polo");

		boolean clothbrandaName = dao.findMatching("ARROW");
		System.out.println(clothbrandaName);
		System.out.println("-----------------------------------------------");

		boolean itr = dao.findMatchingCaseSensitive("lee");
		System.out.println(itr);
		System.out.println("-----------------------------------------------");

		boolean itr1 = dao.findMatchingStartswith("l");
		System.out.println(itr1);
		System.out.println("-----------------------------------------------");
		boolean itr2 = dao.findMatchingendswith("lo");
		System.out.println(itr2);
		
	}

}
