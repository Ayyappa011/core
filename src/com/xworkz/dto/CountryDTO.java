package com.xworkz.dto;

public class CountryDTO {
	private int cid;
	private String cName;
	private int code;
	private String continent;

	public CountryDTO(int cid, String cName, int code, String continent) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.code = code;
		this.continent = continent;
	}

	public int getCid() {
		return cid;
	}

	public String getcName() {
		return cName;
	}

	public int getCode() {
		return code;
	}

	public String getContinent() {
		return continent;
	}

}
