package com.ayyappa.dp;

import com.ayyappa.dp.dao.TimerDAO;
import com.ayyappa.dto.TimerDTO;

public class TimerOperaton {

	public static void main(String[] args) {
		
		
		
		TimerDTO timerdto = new TimerDTO(true,9,"yes",4,"Max");
		TimerDTO timerdto1 = new TimerDTO(true,9,"yes",6,"Max");
		TimerDTO timerdto2 = new TimerDTO(true,5,"yes",3,"Max");
		TimerDTO timerdto3 = new TimerDTO(true,4,"yes",12,"Max");
		
		TimerDAO timerdao =new TimerDAO();
		timerdao.savetimer(timerdto1);
		timerdao.savetimer(timerdto2);
		
		
		timerdao.savertimer(timerdto2, 3);
		
		timerdao.occupied("max");
		TimerDTO[] ref = timerdao.getDTO();
		for (int i = 0; i < ref.length; i++) {
			TimerDTO fig= ref[i];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if(fig!=null) {
				System.out.println(fig.getBrand());
				
				System.out.println(fig.getDigital());
				System.out.println(fig.getBell());
				System.out.println(fig.getCorrectTime());
				System.out.println(fig.isWorking());
			}
			
		}
 		
		
	}

}
