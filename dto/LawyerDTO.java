package com.ayyappa.dto;

public class LawyerDTO {

	
	private String name;
	private String qulification;
	private int experience;
	private String gender;
	private int age;
	private String courtType;
	private int casesWon;
	private int casesLost;
	
	public LawyerDTO() {
		
	}

	public LawyerDTO(String name, String qulification, int experience, String gender, int age, String courtType,
			int casesWon, int casesLost) {
		super();
		this.name = name;
		this.qulification = qulification;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.courtType = courtType;
		this.casesWon = casesWon;
		this.casesLost = casesLost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourtType() {
		return courtType;
	}

	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}

	public int getCasesWon() {
		return casesWon;
	}

	public void setCasesWon(int casesWon) {
		this.casesWon = casesWon;
	}

	public int getCasesLost() {
		return casesLost;
	}

	public void setCasesLost(int casesLost) {
		this.casesLost = casesLost;
	}
	
	
	
}
