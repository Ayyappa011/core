class Watch
{
	int model=450;
	String brand="rolex";
	Light light=new Light();
	
	Watch(int model,String brand)
	{
		this.model=model;
		this.brand=brand;
		System.out.println("invoked int and String const");
		
	}
	
	public static void main(String[] value)
	{
	
	//primitive = initization
	//non primitive = instanstation
	Watch wref = new Watch(452,"rolex");
	System.out.println(wref.model);
	System.out.println(wref.brand);
	int model = wref.model;
	String brand =  wref.brand;
	Light light =wref.light;
	System.out.println(light.on);
	}
}