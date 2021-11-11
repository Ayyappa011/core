package com.reddy.device.watch;

import com.reddy.device.type.WatchType;

public class Watch {
	private String name;
	private Integer price;
	WatchType type;

	@Override
	public String toString() {

		return "Mad";
	}

	@Override
	public int hashCode() {

		return 543;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("Object is equal to null");
			return false;
			
		}
		if (obj instanceof Watch)
		{

			Watch casted = (Watch) obj;
			
			String watch2= casted.getName();
			System.out.println("watch name is  :".concat(watch2));

			
			if(this.name.equals(watch2)){
				System.out.println(" Name is equal");
				return true;
			} else {
				System.out.println("Name not equals");
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public WatchType getType() {
		return type;
	}

	public void setType(WatchType type) {
		this.type = type;
	}

}
