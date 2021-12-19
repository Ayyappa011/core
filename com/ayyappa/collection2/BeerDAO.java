package com.ayyappa.collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.ayyappa.collection2.functionallinterface.BeerSearch;
import com.ayyappa.collection2.functionallinterface.functionallinterface1.EqualElements;

public class BeerDAO {


		Collection<String> beercollection = new ArrayList<String>();

		public BeerDAO() {

			beercollection.add("Beer1");
			beercollection.add("Beer2");
			beercollection.add("Beer3");
			beercollection.add("Beer4");
			beercollection.add("Beer5");
			beercollection.add("Beer6");
			beercollection.add("Beer7");
			beercollection.add("Beer8");
			beercollection.add("Beer9");
			beercollection.add("Beer10");
		}

		public boolean find(BeerSearch equalElements, String value) {
			Iterator<String> itr = this.beercollection.iterator();
			while (itr.hasNext()) {
				String element =  itr.next();
				if (equalElements.expression(element, value)) {
					return true;
				}
			}
			return false;

		}

		
	}


