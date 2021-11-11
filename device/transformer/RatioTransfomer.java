package com.reddy.device.transformer;

public class RatioTransfomer extends Transfomer{
	
	public  String tname;
	
	
	
	public RatioTransfomer() {
		System.out.println("method invoked no-arg const");
	}
	public RatioTransfomer(String name,String type,int price, float size,String tname)
	{
		super(name,type,price,size);
		this.tname=tname;
	}
	@Override
	public void transfomerName(String name) {
		System.out.println(" Method override invoked   :".concat(name));
	}
	
	

}
