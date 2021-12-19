package com.ayyappa.collection2.tester;

import com.ayyappa.collection2.BeerDAO;
import com.ayyappa.collection2.functionallinterface.BeerSearch;
import com.ayyappa.collection2.implementation.EqualsBeerSearch;
import com.ayyappa.collection2.implementation.EqulasIgnoreCaseBeerSearch;

public class BeerTester {

	public static void main(String[] args) {
	BeerDAO beerDAO = new BeerDAO();
		
		BeerSearch beerSearch = new EqualsBeerSearch();
		boolean result=beerDAO.find(beerSearch, "Beer1");
		System.out.println(result);
		
		BeerSearch beerSearch1 = new EqulasIgnoreCaseBeerSearch();
		boolean result1=beerDAO.find(beerSearch1, "beer1");
		System.out.println(result1);

	}

}
