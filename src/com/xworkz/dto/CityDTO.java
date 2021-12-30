package com.xworkz.dto;

public class CityDTO {
	private int cid;
	private String cName;
	private int population;
	private String famousfor;

	public CityDTO(int cid, String cName, int population, String famousfor) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.population = population;
		this.famousfor = famousfor;
	}

	public int getCid() {
		return cid;
	}

	public String getcName() {
		return cName;
	}

	public int getPopulation() {
		return population;
	}

	public String getFamousfor() {
		return famousfor;
	}

}
