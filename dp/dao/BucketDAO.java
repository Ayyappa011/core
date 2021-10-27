package com.ayyappa.dp.dao;

import com.ayyappa.dto.BucketDTO;


public class BucketDAO {
	
	private BucketDTO[] dto = new BucketDTO[13];
	private int mad = 0;

	public void saveBucket(BucketDTO mak) {

		if (mad < this.dto.length) {
			this.dto[this.mad++] = mak;
			System.out.println("Invoked is bucket name:".concat(mak.getColor()));

		} else {
			System.err.println("Bucket is  bad");

		}
	}

	public void deleteBucket(int index) {
		if (index < this.dto.length && index >= 0)
		{
			this.dto[index] = null;
			System.out.println("Dress Code is GOOD ");
		} else {
			System.err.println("Dress code is very bad");
		}
	}

	public void updateBucket(int code, BucketDTO newone) {
		if (code < this.dto.length && this.dto.length >= 0) {
			this.dto[code] = newone;

		}
	}
	public void displayDressCode() {
		for (int i = 0; i < dto.length; i++) {
			BucketDTO ref=dto[i];
			if (ref!=null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getCompany());
				System.out.println(ref.getPrice());
				System.out.println(ref.getSize());
				
				
			}
		}
	}
	
	public BucketDTO[] getDto() {
		return dto;
		
	}
	

}


