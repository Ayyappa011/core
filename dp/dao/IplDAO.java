package com.ayyappa.dp.dao;

import com.ayyappa.dto.IplDTO;

public class IplDAO {
	
	
	private IplDTO[]  dtos = new IplDTO[10];
	private int count=0;
	
	 public void create(IplDTO dto) {
		 System.out.println("create method invoked");
		 if (count<this.dtos.length && dtos!=null) {
			this.dtos[count++]=dto;
			System.out.println("Create team no :".concat(String.valueOf(count)));
		} else {
			System.err.println("Create method is invalid");

		}
	 }
	 public void create(IplDTO dto,int mad) {
		 System.out.println("overload invoked");
		 if (dto!=null && mad<this.dtos.length) {
			this.dtos[mad]=dto;
			
		}else {
			System.err.println("create method overloda is invalid");
		}
	 }
	 public void occupied() {
		 System.out.println("occupied inde :".concat(String.valueOf(count)));
	 }
	 
	 public boolean matchName(String name) {
		 for (int i = 0; i < dtos.length; i++) {
			 IplDTO ref =this.dtos[i];
			 if(ref!=null) {
				 System.out.println("ref in index is not null :".concat(String.valueOf(i)));
				 String tempName=ref.getName();
				 System.out.println("Matching".concat(tempName));
				 if(name.equals(tempName)) {
					 System.out.println("team name found");
					 return true;
				 }else {
					 System.err.println("team not found");
				 }
			 }
			
		}
		 return false;
		 
	 }


public IplDTO[] getIplDTOs() {
	return dtos;
}
}

