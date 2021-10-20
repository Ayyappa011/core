package com.access.market;

public class ProductDatails {
	
	 public  String name;
	public long Marketprice;
	public int subMarketPrice;
	
	
	 void ProductDetails(String name,long Marketprice)
	{
		this.name=name;
		this.Marketprice=Marketprice;
		
		
	}

}
  class NextMonth extends ProductDatails
  {

	  public float villageprice;
	  
	  public NextMonth(String name,int subMarketPrice,float villageprice )
	  {
		  
		  super();
		  this.villageprice=villageprice;
		  
	}
	  
  }