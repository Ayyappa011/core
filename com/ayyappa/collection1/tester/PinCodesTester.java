package com.ayyappa.collection1.tester;

import com.ayyappa.collection1.PinCodesDAO;

public class PinCodesTester {

	public static void main(String[] args) {
		
		PinCodesDAO pincode= new PinCodesDAO();
		pincode.save(583103);
		pincode.save(583126);
		pincode.save(583115);
		pincode.save(583198);
		pincode.save(583101);
		pincode.save(583133);
		

	}

}
