package com.ayyappa.dp.dao;

import com.ayyappa.dto.WalletDTO;

public class WalletDAO {
  
	//
	
	
	 private WalletDTO[] wdto = new WalletDTO[10];
	 
	private int count=0;
	
	
	public void saveWallet(WalletDTO dto) {
		System.out.println("create method invoked");
		if (dto!=null && count<this.wdto.length) {	
		this.wdto[count++]=dto;
		System.out.println("create method invoked:".concat(dto.getCompanyName()));
	}else {
		System.err.println("create");
	}
		}
	
	public void addWallet(WalletDTO dto,int index) {
		System.out.println("overloading");
		if (index<this.wdto.length && dto!=null) {
			this.wdto[index]=dto;
			System.out.println("overloading :".concat(String.valueOf(index)));
		} else {
			System.err.println("Overloading msg");

		}
	}
	
	public void indexoccupied() {
		System.err.println("index :"+count);
		
	}
	
	public boolean findingWallet(int price) {
		System.out.println("findingwallet");
		for (int i = 0; i < wdto.length; i++) {
			WalletDTO ref=this.wdto[i];
			if(ref!=null) {
				Integer mak=ref.getPrice();
				System.out.println(mak);
				if(mak.equals(price));
				System.out.println("wallet is foun njjh/d");
				return true;
			}else {
				System.err.println("wallet is not found");
			}
		}
		return false;
		
	}
	
	public  WalletDTO[] getDisplay() {
		return wdto;
	}
}
