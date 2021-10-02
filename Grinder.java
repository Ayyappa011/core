//Grinder   String company,int capacity,Motor motor
class Grinder
{
	int capacity;
	String company;
	Motor mref = new Motor();
	
	Grinder(int capacity,String company)
	{
		this.capacity=capacity;
		this.company=company;
	}
	
	public static void main(String[] mad)
	{
		Grinder gref = new Grinder(2,"Butterfly");
		System.out.println(gref.capacity);
		System.out.println(gref.company);
		int capacity=gref.capacity;
		String company=gref.company;
		Motor mref=gref.mref;
		System.out.println(mref.on);
		Motor merf=gref.mref;
		System.out.println(mref.off);
		
		
	}
}