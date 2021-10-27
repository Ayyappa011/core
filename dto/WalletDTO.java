package com.ayyappa.dto;

public class WalletDTO {
	
	private String companyName;
	private String material;
	private Integer totalCompartments;
	private Integer price;
	private int coinCompartments;
	
	public WalletDTO() {
		
	}

	public WalletDTO(String companyName, String material, Integer totalCompartments, Integer price,
		int coinCompartments) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalCompartments = totalCompartments;
		this.price = price;
		this.coinCompartments = coinCompartments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getTotalCompartments() {
		return totalCompartments;
	}

	public void setTotalCompartments(Integer totalCompartments) {
		this.totalCompartments = totalCompartments;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public int getCoinCompartments() {
		return coinCompartments;
	}

	public void setCoinCompartments(int coinCompartments) {
		this.coinCompartments = coinCompartments;
	}
	
	

}
