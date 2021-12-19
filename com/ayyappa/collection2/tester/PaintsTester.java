package com.ayyappa.collection2.tester;

import com.ayyappa.collection2.PaintDAO;
import com.ayyappa.collection2.functionallinterface.PaintsSearch;
import com.ayyappa.collection2.implementation.EqualsPaints;
import com.ayyappa.collection2.implementation.EqulasIgnoreCasePaints;

public class PaintsTester {

	public static void main(String[] args) {
		
		PaintDAO paints = new PaintDAO();
		
		PaintsSearch paintsSearch = new EqulasIgnoreCasePaints();
		boolean res = paints.find(paintsSearch, "Paints");
		System.out.println(res);
		
		PaintsSearch paintsSearch2 = new EqualsPaints();
		boolean res1 = paints.find(paintsSearch2, "Kansai Nerolac Paints");
		System.out.println(res1);
		
		
		

	}

}
