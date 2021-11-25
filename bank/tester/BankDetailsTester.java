package com.ayyappa.route.bank.tester;

import com.ayyappa.route.bank.BankAssociation;

import com.ayyappa.route.bank.BankDTO;
import com.ayyappa.route.bank.BankDetails;
import com.ayyappa.route.bank.BankDetailsDAO;

public class BankDetailsTester {

	public static void main(String[] args) {

		BankDTO bankdto = new BankDTO("PanCard", "DBS", 13439, "BTM");

		BankDetailsDAO bankdaos = new BankDetails();
		bankdaos.saveBankDetails(bankdto);
		bankdaos.findBankName("DBS");
		bankdaos.displayBankDetails();
		BankAssociation bankref = new BankAssociation(bankdaos);
		bankref.saveNames(bankdto);
		bankref.displayDetails();
	}

}
