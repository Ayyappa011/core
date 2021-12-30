package com.xworkz.dto;

public class IcecreamDTO {
	private int creamid;
	private String cflavour;
	private String cName;
	private int price;

	public IcecreamDTO(int creamid, String cflavour, String cName, int price) {
		super();
		this.creamid = creamid;
		this.cflavour = cflavour;
		this.cName = cName;
		this.price = price;
	}

	public int getCreamid() {
		return creamid;
	}

	public String getCflavour() {
		return cflavour;
	}

	public String getcName() {
		return cName;
	}

	public int getPrice() {
		return price;
	}

}
