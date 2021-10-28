package com.reddy.hajama;

	public class NaturlSaloon extends Saloon{
		public String name;
		public int noOfhajamas;
		
		public NaturlSaloon() {
			this("Dana",78);
			System.out.println("Invoked saloon no-arg const");
		}

		public NaturlSaloon(String name, int noOfhajamas) {
			super();
			this.name=name;
			this.noOfhajamas=noOfhajamas;
		}
		
}
