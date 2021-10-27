package com.ayyappa.dp.dao;

import com.ayyappa.dto.DressCodeDTO;

public class DressCodeDAO {

	
	private DressCodeDTO[] dto = new DressCodeDTO[12];
	private int mad = 0;

	public void saveDressCode(DressCodeDTO mak) {

		if (mad < this.dto.length) {
			this.dto[this.mad++] = mak;
			System.out.println("Invoked is Dress code:".concat(mak.getColor()));

		} else {
			System.err.println("Dress code bad");

		}
	}

	public void deleteDressCode(int index) {
		if (index < this.dto.length && index >= 0)
		{
			this.dto[index] = null;
			System.out.println("Dress Code is GOOD ");
		} else {
			System.err.println("Dress code is very bad");
		}
	}

	public void updateDressCode(int code, DressCodeDTO newone) {
		if (code < this.dto.length && this.dto.length >= 0) {
			this.dto[code] = newone;

		}
	}
	public void displayDressCode() {
		for (int i = 0; i < dto.length; i++) {
			DressCodeDTO ref=dto[i];
			if (ref!=null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getMaterail());
				System.out.println(ref.getPrice());
				System.out.println(ref.getSize());
				System.out.println(ref.getgender());
				
			}
		}
	}
	
	public DressCodeDTO[] getDto() {
		return dto;
		
	}
	

}
