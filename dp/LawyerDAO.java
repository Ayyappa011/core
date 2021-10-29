package com.ayyappa.dp.dao;

import com.ayyappa.dto.LawyerDTO;

public class LawyerDAO {

	private LawyerDTO[] lawyerdto = new LawyerDTO[5];

	private int count = 0;

//getter method for lawyerDTO
	public LawyerDTO[] getLawyerDTOs() {
		return lawyerdto;
	}

//  Save the values
	public void save(LawyerDTO lawyerDTO) {
		System.out.println("Create  save method invoked");

		if (lawyerDTO != null && count < this.lawyerdto.length) {
			this.lawyerdto[count++] = lawyerDTO;
			System.out.println("save data lawyer name :".concat(lawyerDTO.getName()));
		} else {
			System.out.println("Lawyer name is not printing here");
		}

	}

// deleting the indexs
	public void delete(int index) {

		System.out.println("invoked delete method using index");
		if (index >= 0 && index < this.lawyerdto.length) {
			System.out.println("index pointing null is :".concat(String.valueOf(index)));
			this.lawyerdto[index] = null;
		}
	}
// overloading method

	public void save(LawyerDTO lawyerDTO, int index) {
		if (lawyerDTO != null && index < this.lawyerdto.length && index >= 0) {
			this.lawyerdto[index] = lawyerDTO;
			System.out.println("overloading method ");
		} else {
			System.out.println("method is overloading");

		}

	}
// Lawyer name searchig 
	
	public boolean search(String name) {
		System.out.println("Searching the lawyer name");
		for (int i = 0; i < lawyerdto.length; i++) {
			LawyerDTO ref = this.lawyerdto[i];
			if(ref!=null) {
				String mak = ref.getName();
				System.out.println(mak);
				if(mak.equals(name));
				System.out.println("lawyer name  is found");
				return true;
			}else {
				System.err.println("lawyer name is not found ");
			}
		}
		return false;
	}
	
// get  lawyer Exp
	public void getLawyerWithExperience() {
		System.out.println("Max Experience ");
		int max=0;
		for (int i = 0; i < lawyerdto.length; i++) {
			LawyerDTO ref = lawyerdto[i];
			if(ref!=null) {
				int fig = ref.getExperience();
				if(max < fig) {
					max =fig;
				}
				
				}
		}
		System.out.println(max);
	}
	
//get Experience
	
	public void getExpbyName(String name) {
		System.out.println("Get ex invoked ");
		for (int i = 0; i < lawyerdto.length; i++) {
			LawyerDTO ref =lawyerdto[i];
			
			if(ref!=null) {
				String mad = ref.getName();
				if(mad.equals(name)) {
					System.out.println("Get exp Name :"+ref.getExperience());
				}
			}
		}
	}
	 
	
//get qualification
	public void getQualificationByName(String name) {
		System.out.println("Qualification Name");
		
		for (int i = 0; i < lawyerdto.length; i++) {
			LawyerDTO ref =lawyerdto[i];
			if(ref!=null) {
				String fig = ref.getName();
			
				if(name == fig) {
					String mad = ref.getQulification();
					System.out.println(mad);
				}
				
			}
		}
	}
	
	
// No of cases won by lawyer
	public void search(int digit) {
		System.out.println("Search in method invoked  :");
		for (int i = 0; i < lawyerdto.length; i++) {
			LawyerDTO ref = lawyerdto[i];
			
			if(ref != null) {
				int fig = ref.getCasesWon();
				System.out.println("Cases won by lawyer :"+fig);
				
				if(fig!=0) {
					if(fig == digit) {
						System.out.println("Case won :"+fig);
					}else {
						System.err.println("Cases lost");
					}
				}
			}
			
		}
		
	}
	

}
