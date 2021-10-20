package com.access.array;

public class Array1 {
	

		private static final String Dallaroti = null;

		public static void main(String[] args) {
		
	       long AD1=778845691256L;
	       long AD2=778845691255L;
	       long AD3=778845691254L;
	       long AD4=778845691253L;
	       long AD5=778845691252L;
	       long AD6=778845691251L;
	       long AD7=778845691250L;
	       
	       long[] Aandhra= {AD1,AD2,AD3,AD4,AD5,AD6,AD7};
	       System.out.println(Aandhra[6]);
	       Aandhra[5]=778845691252L;
	       long index2=Aandhra[5];
	       System.out.println(index2);
	       
	       if(AD2==AD5)
	       {
	    	   System.out.println("This Aandhra card no is invalied");
	       }
	       else
	       {
	    	   System.out.println("This Aandhra card no is valied");  
	       }
	       
	       System.out.println("====================================================");
	       
	       
	       
	       int BLY=583103;
	       int MYS=570018;
	       int BLORE=560012;
	       int BTM=560012;
	       
	       int[] Pincode= {BLY,MYS,BLORE,BTM};
	       System.out.println(Pincode[1]);
	       
	       if(583103!=BTM)
	       {
	    	   System.out.println("The is true");
	       }
	       else
		 {
	    	   System.out.println("The is fale");  
	       }
	       int BLORE1=0;
	       while(BLORE1<=5)
	       {
	    	   System.out.println(BLORE1);
	    	   BLORE1++;
	    	}
	    	   
	    System.out.println("===================================================="); 
	      
	    //accountNo
	    
	    double reddy=20225242061D;
	    double lucky=20225242061D;
	    double Kulli=135468466556D;
	    double soun=789466359644D;
	    
	    double[] AccountNo= {reddy,soun};
	    boolean LL=AccountNo.equals(Pincode);
	    System.out.println(AccountNo);
	    
	    
	    double index0=AccountNo[0];
	    System.out.println(index0);
	    System.out.println("===================================================="); 
	    
	    //otpNo
	    int Y=55612;
	    int X=45698;
	    int R=77889;
	    int O=12654;
	    
	    int[] otpNo= {Y,X,R,O};
	    System.out.println("Fourth Element: " + otpNo[2]);
	    
	    for(int i=0;i<otpNo.length;i++)
	    {
	    	System.out.println(otpNo[i]);
	    }
	    for(int A:otpNo);
	    {
	    	System.out.println();
	    }
	    int sum=0;
	    Double average;
	    for(int otpNo1:otpNo)
	    {
	    	sum+=otpNo1;
	    }
	    int Nolgh=otpNo.length;
	    average=((double)sum /(double)Nolgh);
	    
	    System.out.println("sum ="+sum);
	    System.out.println("Average ="+average);
	    System.out.println("===================================================="); 
	    
	    
	    //marks card No
	     byte cardNo1=2;
	     byte cardNo2=3;
	     byte cardNo3=4;  
	     byte cardNo4=5;
	     byte cardNo5=6;
	     byte cardNo6=10;
	     
	     byte[] MarksCardNo= {4,10,2,3};
	     System.out.println(MarksCardNo.length);
	    
	     System.out.println(MarksCardNo.equals(MarksCardNo));
	     System.out.println("===================================================="); 
	     
	     // Foodorder I'ds
	     short Eggrise=10;
	     short roti=10;
	     short Dalla=19;
	     
	     short[] FoodorderIds= {Eggrise,roti,Dalla};
	     System.out.println(FoodorderIds.length);
	     
	     
	     
	     
	     //DoorNos
	     int Myhome1=1;
	     int myhome2=2;
	     int myhome3=3;
	     int myhome4=4;
	     int myhome5=5;
	     int myhome6=6;
	     int myhome7=7;
	     int myhome8=8;
	     int myhome9=9;
	     
	     
	     int[] myhomeDoorNos= {1,2,3,4,5,6,7,8,10};
	     System.out.println(myhomeDoorNos.length);
	     int foodisDalla=10;
	     if(myhome9==foodisDalla)
	     {
	    	 System.out.println("Food no and room no is same than deviler");
	     }
	     else
	     {
	    	 System.out.println("Food no and room no is not same than food deviler cancle"); 
	     }
	     
	     
	     
	     System.out.println("====================================================");
	     
	     
	     
	     
	     
	    
	     
	     
	     
	     
	       
	       
	       
	    	   
	    	   
	    	   
	       
	       
	      
	       
	       
	       
		}

	}

