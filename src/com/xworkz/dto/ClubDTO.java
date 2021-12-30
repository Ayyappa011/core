package com.xworkz.dto;

public class ClubDTO {

	private int idClub;
	private String Club_Name;
	private String Club_location;
	private int Club_entry_fees;

	public ClubDTO(int idClub, String club_Name, String club_location, int club_entry_fees) {
		super();
		this.idClub = idClub;
		Club_Name = club_Name;
		Club_location = club_location;
		Club_entry_fees = club_entry_fees;
	}

	public int getIdClub() {
		return idClub;
	}

	public String getClub_Name() {
		return Club_Name;
	}

	public String getClub_location() {
		return Club_location;
	}

	public int getClub_entry_fees() {
		return Club_entry_fees;
	}

}
