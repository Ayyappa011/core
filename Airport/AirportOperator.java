package com.xworkz.Airport;

public class AirportOperator {
	
	private String[] portnames = new String[5];
	private int counter = 0;

	public void addportnames1(String pname) {
		System.out.println("Airport Names:".concat(pname));
		this.portnames[counter++] = pname;

	}

	public String[] getPortnames() {
		return portnames;
	}

	public void deleteAirportOperator(int L) {
		System.out.println(" Delete Airport Names:".concat(String.valueOf(L)));
		if (L >= 0 && L < portnames.length) {
			this.portnames[L] = null;

		}
	}

	public void updateAirportOperator(int A, String newref) {
		System.out.println(" Delete Airport Names:".concat(String.valueOf(A)));
		for (int i = 0; i < portnames.length; i++) {
			this.portnames[A] = newref;
		}

	}
	public void displayAirportOperator() {
		for (int i = 0; i < portnames.length; i++) {
			String c1=this.portnames[i];
			System.out.println(c1);
			
		}
	}
}
