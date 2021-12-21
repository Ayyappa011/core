package com.ayyappa.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;

public class AirqualityIndex {

	public static void main(String[] args) {

		List<String> airQualityIndex = Arrays.asList("156AQI", "121AQI", "100AQI", "111AQI", "112AQI", "118AQI",
				"122AQI", "117AQI", "110AQI", "109AQI", "115AQI", "132AQI", "145AQI", "159AQI", "120AQI", "152AQI",
				"137AQI", "108AQI", "114AQI");
		List<String> sortedlist = airQualityIndex.stream().sorted().collect(Collectors.toList());

		sortedlist.forEach((e) -> System.out.println(e));
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------");

		List<String> sortedlist1 = airQualityIndex.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		sortedlist1.forEach((e) -> System.out.println(e));
	}
}
