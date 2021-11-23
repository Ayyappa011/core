package com.ayyappa.vaccin.state;

public class EmployeeDTO {
	private String name;
	private String stateName;
	private String vaccinName;
	private String regVaccination;
	private String firstDose;
	private String secondDose;

	public EmployeeDTO() {
		System.out.println("Invoked method all employee Details");
	}

	public EmployeeDTO(String name, String stateName, String vaccinName, String regVaccination, String firstDose,
			String secondDose) {
		super();
		this.name = name;
		this.stateName = stateName;
		this.vaccinName = vaccinName;
		this.regVaccination = regVaccination;
		this.firstDose = firstDose;
		this.secondDose = secondDose;
		System.out.println("data is added");
	}

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

	public String getVaccinName() {
		return vaccinName;
	}

	public void setVaccinName(String vaccinName) {
		this.vaccinName = vaccinName;
	}

	public String getRegVaccination() {
		return regVaccination;
	}

	public void setRegVaccination(String regVaccination) {
		this.regVaccination = regVaccination;
	}

	public String getFirstDose() {
		return firstDose;
	}

	public void setFirstDose(String firstDose) {
		this.firstDose = firstDose;
	}

	public String getSecondDose() {
		return secondDose;
	}

	public void setSecondDose(String secondDose) {
		this.secondDose = secondDose;
	}

}
