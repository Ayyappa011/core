package com.ayyappa.dto;

public class ClubDTO {
	
	private String noOfPeople;
	private int noOfBottel;
	private int rating;
	private int entryPrice;
	public ClubDTO() {
		
	}
	public ClubDTO(String noOfPeople, int noOfBottel, int  rating, int entryPrice) {
		super();
		this.noOfPeople = noOfPeople;
		this.noOfBottel = noOfBottel;
		this.rating = rating;
		this.entryPrice = entryPrice;
	}
	public String getNoOfPeople() {
		return noOfPeople;
	}
	public void setNoOfPeople(String noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	public int getNoOfBottel() {
		return noOfBottel;
	}
	public void setNoOfBottel(int noOfBottel) {
		this.noOfBottel = noOfBottel;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
		
	}
	public int getEntryPrice() {
		return entryPrice;
	}
	public void setEntryPrice(int entryPrice) {
		this.entryPrice = entryPrice;
	}
	

}
