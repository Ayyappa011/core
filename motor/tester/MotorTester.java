package com.xworkz.motor.tester;



import com.xworkz.motor.MotorOperator;


public class MotorTester {

	public static void main(String[] args) {
		
		
		MotorOperator  mref = new MotorOperator();
		mref.addBrandNames("TATA MOTORS");
		mref.addBrandNames("HONDA MOTORS");
		mref.addBrandNames("BMW MOTORS");
		mref.addBrandNames("AUDI MOTORS");
		mref.addBrandNames("FORD MOTORS");
		mref.addBrandNames("KTM MOTORS");
		
		
	     String g1="inducation";
		mref.deleteMotorOperator(2);
		mref.updateMotorOperator(2, g1);
	
	
	mref.displaybrandNames();
		

	}}

/*Error: Main method not found in class com.xworkz.motor.tester.MotorTester, please define the main method as:

or a JavaFX application class must extend javafx.application.Application*/



