package com.ayyappa.collectiontask.dto;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class PresidentTester {

	public static void main(String[] args) {

		List<President> presidents = new ArrayList<President>();

		presidents.add(new President("IN1962", "Rajendra Prasad", "India", 12));
		presidents.add(new President("IN1963", "Dr. Sarvepalli Radhakrishnan", "India", 5));
		presidents.add(new President("IN1969", "V. V. Giri", "India", 3));
		presidents.add(new President("IN1974", "Fakhruddin Ali Ahmed", "India", 4));
		presidents.add(new President("IN1977", "Neelam Sanjeeva Reddy", "India", 2));
		presidents.add(new President("IN2017", "Ram Nath Kovind", "India", 10));

		List<PresidentDTO> presidentDTOs = new ArrayList<PresidentDTO>();

		for (President details : presidents) {
			presidentDTOs.add(new PresidentDTO(details.getName(), details.getCountryName(), details.getTenure()));
		}
		for (PresidentDTO dtos : presidentDTOs) {
			System.out.println(dtos);
		}
		System.out
				.println("------------------------------------------------------------------------------------------");

		// using stream().map()
		presidents.stream().map((President details) -> new PresidentDTO(details.getName(), details.getCountryName(),
				details.getTenure())).forEach((dtos) -> {
					System.out.println(dtos);
				});

		System.out.println(
				"========================================================================================================");
		List<PresidentDTO> presidentDtosDetails = presidents.stream()
				.map((President details) -> new PresidentDTO(details.getName(), details.getCountryName(),
						details.getTenure()))
				.collect(Collectors.toList());
		System.out.println(presidentDtosDetails);

	}

}
