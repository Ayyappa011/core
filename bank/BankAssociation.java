package com.ayyappa.route.bank;

public class BankAssociation {
	BankDetailsDAO dao;

	public BankAssociation(BankDetailsDAO dao) {
		super();
		this.dao = dao;
	}

	public void saveNames(BankDTO dto) {
		if (dto != null) {
			System.out.println("invoked method save name here");
		} else {
			System.err.println("dto is pointing to the null");
		}
	}

	public void displayDetails() {
		if (dao != null) {
			System.out.println("displayDetails here");
			dao.displayBankDetails();

		}
	}

}
