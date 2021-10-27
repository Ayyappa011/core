package com.ayyappa.dp;

import com.ayyappa.dp.dao.IplDAO;
import com.ayyappa.dto.IplDTO;

public class IplTester {

	public static void main(String[] args) {
		
		
		IplDTO dtoref = new IplDTO("KKR",25,13,"Lucky","JIO");
		dtoref.setName("RR");
		dtoref.setNoOfPlayers(24);
		dtoref.setTeamSize(11);
		dtoref.setOwner("Vandu"); 
		dtoref.setSponsor("JIO");
		
		IplDAO daoref = new IplDAO();
		daoref.create(dtoref);
		daoref.create(new IplDTO("MI",24,11,"Reddy","jio"),2);
		
		daoref.create(dtoref, 1);
		daoref.occupied();
		daoref.matchName("RCB");
		
		IplDTO[] reft = daoref.getIplDTOs();
		for (int i = 0; i < reft.length; i++) {
		IplDTO	ref= reft[i];
		System.out.println("+++++++++++++++++");
		if (ref!=null) {
			System.out.println(ref.getName());
			System.out.println(ref.getNoOfPlayers());
			System.out.println(ref.getTeamSize());
			System.out.println(ref.getOwner());
			System.out.println(ref.getSponsor());
			
		}else {
			System.err.println("empty index :".concat(String.valueOf(i)));
		}
			
		}
		}
	
	
 }
