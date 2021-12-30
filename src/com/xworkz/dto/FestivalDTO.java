package com.xworkz.dto;

public class FestivalDTO {
	private int fid;
	private String fname;
	private String fdate;
	private String fstate;

	public FestivalDTO(int fid, String name, String fdate, String fstate) {
		super();
		this.fid = fid;
		this.fname = name;
		this.fdate = fdate;
		this.fstate = fstate;
	}

	public int getFid() {
		return fid;
	}

	public String getName() {
		return fname;
	}

	public String getFdate() {
		return fdate;
	}

	public String getFstate() {
		return fstate;
	}

}
