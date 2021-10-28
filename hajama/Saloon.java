package com.reddy.hajama;

public class Saloon{

   public String name;
   public int noOfhajamas;
   
   public Saloon() {
	
	System.out.println("Invoked saloon no-arg const");
	
}

public Saloon(String name, int noOfhajamas) {
	System.out.println("invoked  saloon arg const");
	this.name=name;
	this.noOfhajamas=noOfhajamas;
	
}


}



	


