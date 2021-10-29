package com.ayyappa.dp;

import com.ayyappa.dp.dao.LawyerDAO;
import com.ayyappa.dto.LawyerDTO;

public class LawyerTester {

	public static void main(String[] args) {

		LawyerDTO lawyerdto = new LawyerDTO("vanduu", "BBA", 5, "female", 25, "civil court", 78, 15);
		LawyerDTO lawyerdto1 = new LawyerDTO("Reddy", "B.com", 5, "female", 25, "civil court", 78, 15);
		LawyerDTO lawyerdto2 = new LawyerDTO("kulli", "B.de", 5, "female", 25, "civil court", 78, 15);
		LawyerDTO lawyerdto3 = new LawyerDTO("lucky", "B.com", 5, "female", 25, "civil court", 78, 15);

		LawyerDAO lawyerdao = new LawyerDAO();
		lawyerdao.save(lawyerdto2);
		lawyerdao.save(lawyerdto3);
		lawyerdao.save(lawyerdto);
		lawyerdao.save(lawyerdto1);
		System.out.println("---------------------------------");

		lawyerdao.delete(2);
		System.out.println("---------------------------------");

		lawyerdao.save(lawyerdto3, 1);
		System.out.println("---------------------------------");

		lawyerdao.search("lucky");
		System.out.println("---------------------------------");

		lawyerdao.delete(1);
		System.out.println("---------------------------------");

		LawyerDTO[] mad = lawyerdao.getLawyerDTOs();
		for (int i = 0; i < mad.length; i++) {
			LawyerDTO ref = mad[i];

			System.out.println("~~~~~~~~~~~~~~~~~~");
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getQulification());
				System.out.println(ref.getExperience());
				System.out.println(ref.getGender());
				System.out.println(ref.getAge());
				System.out.println(ref.getCourtType());
				System.out.println(ref.getCasesWon());
				System.out.println(ref.getCasesLost());

			}
		}

	}
}
