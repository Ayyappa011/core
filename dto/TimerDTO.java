package com.ayyappa.dto;

public class TimerDTO {
	
	
	private boolean working;
	private Integer correctTime;
	private String digital;
	private Integer bell;
	private String brand;
	public TimerDTO() {
		
	}
	public TimerDTO(boolean working, Integer correctTime, String digital, Integer bell, String brand) {
		super();
		this.working = working;
		this.correctTime = correctTime;
		this.digital = digital;
		this.bell = bell;
		this.brand = brand;
	}
	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
	public Integer getCorrectTime() {
		return correctTime;
	}
	public void setCorrectTime(Integer correctTime) {
		this.correctTime = correctTime;
	}
	public String getDigital() {
		return digital;
	}
	public void setDigital(String digital) {
		this.digital = digital;
	}
	public Integer getBell() {
		return bell;
	}
	public void setBell(Integer bell) {
		this.bell = bell;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
