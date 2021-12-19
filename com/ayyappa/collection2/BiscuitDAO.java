package com.ayyappa.collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.ayyappa.collection2.functionallinterface.BiscuitSearch;

public class BiscuitDAO {

	Collection<String> biscuitdao = new ArrayList<String>();

	public BiscuitDAO() {
		biscuitdao.add("Parle G");
		biscuitdao.add("20-20 Cookies");
		biscuitdao.add("Festo");
		biscuitdao.add("Monaco-Salted Craker");
		biscuitdao.add("Hide & Seek Bourbon");
	}

	public boolean find(BiscuitSearch search, String value) {
		Iterator<String> iterator = biscuitdao.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (search.expression(str, value)) {
				return true;

			}

		}
		return false;

	}

}
