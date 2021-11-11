package com.reddy.device.stadium;



public class Stadium {

	private String name;
	private String city;
	private int areInMeters;

	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("invoked equal method is not equal to null");

			if (obj instanceof Stadium) {
				Stadium casted = (Stadium) obj;

				String match = casted.getCity();

				if (this.city.equals(match)) {
					System.out.println("Stadium cityname are's are same");
					System.out.println("Both are same than print  :".concat(getCity()));

					return true;
				} else {
					System.out.println("Stadium cityname are's are not same");
					System.out.println("Both are  not same than print  :".concat(getCity()));
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAreInMeters() {
		return areInMeters;
	}

	public void setAreInMeters(int areInMeters) {
		this.areInMeters = areInMeters;
	}
}
