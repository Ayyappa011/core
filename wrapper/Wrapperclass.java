package com.access.wrapper;

public class Wrapperclass {

	public static void main(String[] args) {
		
		
		double l=8.65;
		int O=8;
		 
		
		Integer A1 = Integer.valueOf(O);
		Double L1 = Double.valueOf(l);
		
	/*	if(A1 instanceof Integer)
		{
			System.out.println("An object of integer is created."+A1);
		}
		if(L1 instanceof Double)
		{
			System.out.println("An object of integer is created."+L1);
		}
		*/
	System.out.println(A1);
	System.out.println(L1);
	
	int zeros=Integer.numberOfLeadingZeros(2);
	System.out.println(zeros);
	
	 int trailing=Integer.numberOfTrailingZeros(5);
    System.out.println(trailing);

   int Yl=Integer.lowestOneBit(O);
   System.out.println(Yl);
   
   //double
   
   double S=82.2D;
     
   double DD= Double.doubleToLongBits(5);
   System.out.println(DD);
   
   
   
   
   
   
   
   
   
   

		
	}

}
