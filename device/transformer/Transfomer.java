
package com.reddy.device.transformer;

public class Transfomer {
	
	
	public String name;
	private String type;
	private int price;
	private float size;

	public Transfomer() {
		System.out.println("Invoked method no -arg const");
	}
	public void transfomerName(String name) {
		System.out.println("Method invoked:".concat(name));
	}
	
	public void selltransfomer(int price) {
		System.out.println("method invoked:".concat(String.valueOf(price)));
		
	}
	public Transfomer(String name, String type, int price, float size) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
	
	
}
