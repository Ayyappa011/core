package com.ayyappa.collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.ayyappa.collection2.functionallinterface.PaintsSearch;

public class PaintDAO {
	
	
	Collection<String> paintDao= new ArrayList<String>();
	public PaintDAO() {
		paintDao.add("Asian Paints ");
		paintDao.add("Berger Paints");
		paintDao.add("Indigo Paints");
		paintDao.add("Kansai Nerolac Paints");
		paintDao.add("Shalimar Paints");
		paintDao.add("Dulux Paints");
		
	}
	
	public boolean find(PaintsSearch search , String value) {
		Iterator<String> iterator= paintDao.iterator();
		while (iterator.hasNext()) {
			String str =  iterator.next();
			if(search.expression(str,value)) {
				return true;
			}
		}
		return false;
		
	}
	

}
