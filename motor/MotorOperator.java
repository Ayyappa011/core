package com.xworkz.motor;

public class MotorOperator {

	private String[] brandNames = new String[6];
	private int more = 0;

	public void addBrandNames(String Bn) {
		System.out.println("BrandNames:".concat(Bn));
		this.brandNames[more++] = Bn;
	}

	public String[] getBrandNames() {
		return brandNames;
	}

	public void deleteMotorOperator(int k) {
		System.out.println("Deleted motor operator".concat(String.valueOf(k)));
		if (k >= 0 && k < brandNames.length) {
			this.brandNames[k] = null;

		}
	}

	public void updateMotorOperator(int M, String newref) {
		System.out.println("Deleted motor operator:".concat(String.valueOf(M)));
		if (M >= 0 && M < brandNames.length) {
			this.brandNames[M] = newref;
		}

	}

	public void displaybrandNames() {
		for (int mad = 0; mad < brandNames.length; mad++) {
			String mad1 = this.brandNames[mad];
			System.out.println(mad1);
		}
	}

	
}
