package com.ayyappa.collection2.tester.tester1;

import com.ayyappa.collection2.BeerDAO;
import com.ayyappa.collection2.functionallinterface.BeerSearch;

public class Beerscammer {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		boolean match = beerDAO.find(new BeerSearch() {

			@Override
			public boolean expression(String args1, String args2) {
				return args1.equals(args2);
			}
		}, "Beer1");
		System.out.println(match);
		boolean match2 = beerDAO.find(new BeerSearch() {

			@Override
			public boolean expression(String args1, String args2) {

				return args1.equalsIgnoreCase(args2);
			}
		}, "BEER2");
		System.out.println(match2);

		boolean match3 = beerDAO.find(new BeerSearch() {

			@Override
			public boolean expression(String args1, String args2) {

				return args1.startsWith(args2);
			}
		}, "B");
		System.out.println(match3);

		boolean match4 = beerDAO.find(new BeerSearch() {

			@Override
			public boolean expression(String args1, String args2) {
				// TODO Auto-generated method stub
				return args1.endsWith(args2);
			}
		}, "r5");
		System.out.println(match4);

	}

}
