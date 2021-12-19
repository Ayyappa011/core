package com.ayyappa.collection2.tester;

import com.ayyappa.collection2.BiscuitDAO;
import com.ayyappa.collection2.functionallinterface.BiscuitSearch;
import com.ayyappa.collection2.implementation.EqualsBiscuits;
import com.ayyappa.collection2.implementation.EqualsIgnoreCaseBiscuits;


public class BiscuitsTester {

	public static void main(String[] args) {

		BiscuitDAO biscuitDAO = new BiscuitDAO();

		BiscuitSearch biscuitSearch = new EqualsBiscuits();
		boolean res = biscuitDAO.find(biscuitSearch, "Parle");
		System.out.println(res);

		BiscuitSearch biscuitSearch2 =  new EqualsIgnoreCaseBiscuits();
		boolean res1 = biscuitDAO.find(biscuitSearch2, "parle g");
		System.out.println(res1);

	}

}
