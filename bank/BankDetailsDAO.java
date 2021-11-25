package com.ayyappa.route.bank;

public interface BankDetailsDAO {

	boolean saveBankDetails(BankDTO dto);

	BankDTO findBankName(String name);

	void displayBankDetails();

}
