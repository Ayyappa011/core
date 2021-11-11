package com.reddy.device.plant;



public class Plant {

	private String name;
	private String alive;
	private int lifeSpan;

	@Override
	public String toString() {

		return super.toString();
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("invoked equal method is not equal to null");
			return false;

		}
		if (obj instanceof Plant) {
			Plant casted = (Plant) obj;
			String plant = casted.getName();

			System.out.println("plant name :".concat(plant));

			if (this.name.equals(plant)) {
				System.out.println("plant name's are same");

				return true;
			} else {
				System.out.println("plant name's are not same");
				return false;
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

	public String getAlive() {
		return alive;
	}

	public void setAlive(String alive) {
		this.alive = alive;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

}
