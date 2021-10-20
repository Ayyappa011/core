package com.access.string;

public class Stringuses {

	public static void main(String[] args) {

//Pan cardNo
		String vandu="cmla356p";
		String Malli="rdcsy778l";
		String lucky="bstw078o";
		String mak="bqmat789";
		String chandu="tyiu789u";
		
		String[] PancardNo= new String[4];
		PancardNo[2]=lucky;
		
		for(int i=0;i<PancardNo.length;i++)
		{
			System.out.println(i);
			String str=PancardNo[i];
			if(str!=null)
			{
				str=str.toUpperCase();
				System.out.println(str);
			}
			else {
				System.out.println(str);
			}
		}
		
		System.out.println("-------------------");
		
//PassPort No
		
		String Sahana="R12768";
		String priya="R512768";
		String ranju="R78916";
		String reddy="R12768";
		String Lucky="M78416";
		
		String[]  PassportNo=new String[6];
		PassportNo[3]=reddy;
		PassportNo[0]=Sahana;
		String Str=PassportNo[0];
		System.out.println("this is SAHANA passport no:"+PassportNo[0]);
		System.out.println(PassportNo.length);
		
		 String mad=PassportNo[3];
		 boolean mad1 = mad.contentEquals(Sahana);
		 System.out.println(mad1);
		 
		  boolean mad2=mad.isEmpty();
		  System.out.println(mad2);
		  System.out.println("-------------------");
		 
//AppVersions
		  String FB="2.3.66";
		  String WTP="2.5";
		  String INST="4.5";
		  String ECLIPSE="1.8";
		  String CHROME="3.6";
		  
		  String[] ref = new String[7];
		  ref[0]=FB;
		  ref[4]=CHROME;
		  ref[2]=WTP;
		  System.out.println(ref.length);
		  
		  String ref1=ref[0].replace(ECLIPSE, CHROME);
		  System.out.println(ref1);
		  
		  String ref2=ref[2].concat(ECLIPSE);
          System.out.println(ref2);
          System.out.println("-------------------");
		  
 //PaasWord
          String MMIP="258000";
          String BalanceCheck="225588";
          String phone="226644";
          String wtp="149732";
          String INS="789543";
          String Fb="Suni@011";
          
          String[] PassWord=new String[6];
          PassWord[3]=Fb;
          PassWord[0]=MMIP;
          
         
          System.out.println(PancardNo.length);
          System.out.println(PassportNo[0]);
          System.out.println(PassportNo[5]);
          
          String Bref=PassWord[3].toUpperCase();
          System.out.println(Bref);
          
          String bref=PassWord[3].concat(PassWord[0]);
          
          System.out.println(bref);
          System.out.println("-------------------");

          
          //FaceBookIds
        //  String FB1=
          
          
          
          
          
		 
		
	}

	

}
