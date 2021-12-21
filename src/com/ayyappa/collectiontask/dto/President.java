package com.ayyappa.collectiontask.dto;

import java.util.ArrayList;
import java.util.List;

public class President {
	private String id, name, countryName;
	private int tenure;

	public President(String id, String name, String countryName, int tenure) {
		super();
		this.id = id;
		this.name = name;
		this.countryName = countryName;
		this.tenure = tenure;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + ", countryName=" + countryName + ", tenure=" + tenure
				+ "]";
	}

}

class PresidentDTO {

	private String name, countryName;
	private int tenure;

	public PresidentDTO(String name, String countryName, int tenure) {
		super();

		this.name = name;
		this.countryName = countryName;
		this.tenure = tenure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "PresidentDTO [ name=" + name + ", countryName=" + countryName + ", tenure=" + tenure + "]";
	}

}

