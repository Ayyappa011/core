package com.ayyappa.dp.dao;

import com.ayyappa.dto.BucketDTO;
import com.ayyappa.dto.ClubDTO;

public class ClubDAO {

	
	private ClubDTO[] dto = new ClubDTO[13];
	private int mad = 0;

	public void saveClub(ClubDTO mak) {

		if (mad < this.dto.length) {
			this.dto[this.mad++] = mak;
			System.out.println("Invoked is Club entry price :".concat(mak.getNoOfPeople()));

		} else {
			System.err.println("Bucket is  bad");

		}
	}

	public void deleteClub(int index) {
		if (index < this.dto.length && index >= 0)
		{
			this.dto[index] = null;
			System.out.println("Dress Code is GOOD ");
		} else {
			System.err.println("Dress code is very bad");
		}
	}

	public void updateClub(int code, ClubDTO newone) {
		if (code < this.dto.length && this.dto.length >= 0) {
			this.dto[code] = newone;

		}
	}
	public void displayClub() {
		for (int i = 0; i < dto.length; i++) {
			ClubDTO ref=dto[i];
			if (ref!=null) {
				System.out.println(ref.getNoOfPeople());
				System.out.println(ref.getNoOfBottel());
				System.out.println(ref.getEntryPrice());
				System.out.println(ref.getRating());
				
				
			}
		}
	}
	
	public ClubDTO[] getDto() {
		return dto;
		
	}
	
}
