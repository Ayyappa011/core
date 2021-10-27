package com.ayyappa.dp;

import com.ayyappa.dp.dao.WalletDAO;
import com.ayyappa.dto.WalletDTO;

public class WalletOperation {
	
	public static void main(String args[]) {
		
		
		//String companyName, String material, Integer totalCompartments, Integer price,
		//byte coinCompartments
		WalletDTO wref = new WalletDTO("puma","cotten",5,999,2);
		WalletDTO wref1 = new WalletDTO("LP","cotten",5,977,2);
		WalletDTO wref2 = new WalletDTO("US pl","cotten",5,988,2);
		WalletDTO wref3 = new WalletDTO("nike","cotten",5,966,2);
		
		
		WalletDAO wdao = new WalletDAO();
		wdao.saveWallet(wref3);
        wdao.addWallet(wref1, 2);
        wdao.indexoccupied();
        wdao.findingWallet(977);
        
        WalletDTO[] lucky= wdao.getDisplay();
        for (int i = 0; i < lucky.length; i++) {
			WalletDTO ref =lucky[i];
		
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		if(ref!=null){
			System.out.println(ref.getCompanyName());
			System.out.println(ref.getMaterial());
			System.out.println(ref.getTotalCompartments());
			System.out.println(ref.getPrice());
			System.out.println(ref.getCoinCompartments());
		}
		else {
			System.err.println(" to print null");
			
		}
        }
	}
}

        
        
        
        
        
	
