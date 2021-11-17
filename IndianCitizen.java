package com.ayyappa.task;

public  class IndianCitizen implements VoltingRule, TrafficRule, MarriageRule {

	@Override
	public int validAge(int age) {
		System.out.println("this method from volting rule");
		return 18;
	}

	@Override
	public String licence() {
		System.out.println("this method from trafficeRule");
		return null;
	}

	@Override
	public boolean vaildAge(char gender, int age) {
		System.out.println("this method from marriageRule");
		return false;
	}

	private String name;
	private String stateName;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void displayDetails() {

		System.out.println("*****the details from IndianCitizen*****");
		name = "Ayyappa";
		stateName = "Ka";

	}

	@Override
	public boolean validLicence() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean vaildInsurance() {
		System.out.println("this method invoked from tarfficRule");
		return false;
	}

	@Override
	public String validId() {
		System.out.println("invoked method");
		return null;
	}

}
