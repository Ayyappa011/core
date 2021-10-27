package com.ayyappa.dto;

public class IplDTO {
	
	private String name;
	private Integer noOfPlayers;
	private Integer teamSize;
	private String owner;
	private String sponsor;
	public IplDTO() {
		
	}
	public IplDTO(String name, Integer noOfPlayers, Integer teamSize, String owner, String sponsor) {
		super();
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponsor = sponsor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public Integer getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String Sponsor ) {
		this.sponsor=sponsor;
		
	}
	

}
