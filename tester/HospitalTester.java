package com.ayyappa.hospital.tester;

import com.ayyappa.hospital.Hospital;
import com.ayyappa.hospital.HospitalAdmitRule;
import com.ayyappa.hospital.HospitalAssocation;
import com.ayyappa.hospital.HospitalDischargeRule;

public class HospitalTester {

	public static void main(String[] args) {
		
		
		
		
		    HospitalAdmitRule admit = new Hospital();
		    
		    HospitalDischargeRule discharge = new Hospital();
		    
		    
		    HospitalAssocation  hsptl = new  HospitalAssocation("LUCKY",admit,discharge);
		    
		    
		    hsptl.pesentDetails();
		    
		    
		    hsptl.pesentdischangeDetails();
		    

	}

}
