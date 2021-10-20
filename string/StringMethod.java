package com.access.string;

public class StringMethod {

	public static void main(String[] args) {
		
		String name = "xworkz";
		boolean contain = name.contains("kz");
		System.out.println("contains kz"+contain);
		 System.out.println("-----------------------");
		
		String branch = new String("BTM");
		boolean contains = branch.contains("BT");
        System.out.println(contains);
        System.out.println("-----------------------");
        
        char[] chars= {'r','e','d','d','y'};
        String convertString = String.copyValueOf(chars);
        System.out.println(convertString);
        System.out.println("-----------------------");
        
        String nagappa="nagappa";
        String nagamma= new String("nagappa");
        
        boolean same=nagappa.equals(nagamma);
        System.out.println(same);
        System.out.println("-----------------------");
        
        //getchar
        String str = new String("developer is a god ");
        char[] ch = new char[20];
       try {
        	str.getChars(1,26,ch,0);
        	System.out.println(ch);
       }catch(Exception e) {
    	   System.out.println(e);
       }
       System.out.println("-----------------------");
       
       //getbyte
       String n="ABCDEFGHIJKL";
       byte[] bref=n.getBytes();
       for(int i=0;i<bref.length;i++) {
    	   System.out.println(bref[i]);
    	   
       }
       System.out.println("-----------------------");
       
       // indexOf()
       int index1=n.indexOf("is");
       int index2=n.indexOf("index");
       System.out.println(index1+" "+index2);
       
       int index3=n.indexOf("op",5);
       System.out.println(index3);
       System.out.println("-----------------------");
       
       //String intern()
       String s1 = new String("mak");
       String s2="mak";
      
       String s3=s1.intern();
       System.out.println(s1==s2);
       System.out.println(s2==s3);
       System.out.println("-----------------------");
       
       //String isEmpty()
       String k1="";
       String k3="mak";
       System.out.println(k1.isEmpty());
       System.out.println(k3.isEmpty());
       System.out.println("-----------------------");
       
       //String join()
       String M8=String.join("TRUE LOVE END","TO","SOMEONE");
       System.out.println(M8);
       System.out.println("-----------------------");
       
       //String lastIndexOf(int ch, int fromIndex)
       String ref="Developer is a god";
       int lucky=ref.lastIndexOf('i',4);
       System.out.println(lucky);
       
       String fox="Developer is a god";
       int mad=fox.lastIndexOf("is");
       System.out.println(mad);
       System.out.println("-----------------------");
       
       //String length()
       String r="welcome to my bar";
       int size=r.length();
       System.out.println("welcome to my bar:"+size);
       System.out.println("-----------------------");
       
       //String replace() //String replaceALL()
       String TT="it is my book";
       String tt1=TT.replace("is", "was");
       System.out.println(tt1);
       tt1=tt1.replace("was", "is");
       System.out.println(tt1);
       System.out.println("-----------------------");
       
       //String builder
       StringBuilder W1= new StringBuilder("bad");
       StringBuilder W2 = new StringBuilder("boy");
       
       StringBuilder reddy=W1.append(W2);
       System.out.println(reddy.toString());
       System.out.println("-----------------------");
       
       
       		
       
       
       
       
       
       
       
       
       
       
       
       
        	
        
        
        
	}
        
        
        

}
