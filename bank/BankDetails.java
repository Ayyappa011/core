package com.ayyappa.route.bank;

public class BankDetails implements BankDetailsDAO {

	BankDTO[] dtos = new BankDTO[3];
	int adder = 0;

	@Override
	public boolean saveBankDetails(BankDTO dto) {
		System.out.println(" invoked Save bank details here ");
		if (dto != null) {
			dtos[adder] = dto;
			return true;
		} else {
			System.err.println("No bank details saved here");
		}

		return false;
	}

	@Override
	public BankDTO findBankName(String name) {
		System.out.println("invoked method find the bank name");
		if (dtos != null) {
			for (int i = 0; i < dtos.length; i++) {
				BankDTO bankref = dtos[i];
				if (bankref != null) {
					String name1 = bankref.getName();
					if (name == name1) {
						System.out.println("Both bank name's are same but different branch's");
					} else {
						System.err.println("Both bank name's are not same ");
					}
				} else {
					System.err.println("bankref of dtos ref to  the null");
				}
			}
		}

		return null;
	}

	@Override
	public void displayBankDetails() {
		if (dtos != null) {
			for (int k = 0; k < dtos.length; k++) {
				BankDTO bankdto = dtos[k];
				if (bankdto != null) {
					System.out.println("Bank id:" + bankdto.getId());
					System.out.println("Bank Name:" + bankdto.getName());
					System.out.println("Bank IFSC Code:" + bankdto.getIfsc());
					System.out.println("Bank Branch Name:" + bankdto.getBranch());
				}
			}
		}

	}
}
