package com.reddy.device.food;



public class Food {

	private String name;
	private int price;
	private int quantity;
	private String quality;
	
	
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("invoked equal method is not equal to null");

			if (obj instanceof Food) {
				Food casted = (Food) obj;

				String match = casted.getName();

				if (this.name.equals(match)) {
					System.out.println("Foodname are's are same");
					System.out.println("Both are same than print  :".concat(getName()));

					return true;
				} else {
					System.out.println("Food name are's are not same");
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
	
}



