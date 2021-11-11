package com.reddy.device.city;



public class City {

	private String name;
	private String stateName;
	private String countryName;

	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("invoked equal method is not equal to null");

			if (obj instanceof City) {
				City casted = (City) obj;

				String match = casted.getCountryName();

				if (this.countryName.equals(match)) {
					System.out.println("Countryname are's are same");
					System.out.println("Both are same than print  :".concat(getCountryName()));

					return true;
				} else {
					System.out.println("Country name are's are not same");
				}

			}

		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
