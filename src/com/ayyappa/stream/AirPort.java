package com.ayyappa.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirPort {

	public static void main(String[] args) {

		String airPortName1 = "Visakhapatnam Airport";
		String airPortName2 = "Rajiv Gandhi International Airport";
		String airPortName3 = "Indira Gandhi International Airport";
		String airPortName4 = "Kempegowda International Airport";
		String airPortName5 = "Mangalore International Airport";
		String airPortName6 = "Chhatrapati Shivaji International Airport";
		String airPortName7 = "Tulihal Airport";
		String airPortName8 = "Coimbatore International Airport";
		String airPortName9 = "Tiruchirapalli International Airport";
		String airPortName10 = "Chaudhary Charan Singh Airport";
		String airPortName11 = "Lal Bahadur Shastri Airport";
		String airPortName12 = "Gaya Airport";
		String airPortName13 = "Surat International Airport";
		String airPortName14 = "Vadodara International Airport";
		String airPortName15 = "Kannur International Airport";

		Stream<String> names = Stream.of(airPortName1, airPortName2, airPortName10, airPortName11, airPortName12,
				airPortName13, airPortName14, airPortName15, airPortName3, airPortName4, airPortName5, airPortName6,
				airPortName7, airPortName8, airPortName8, airPortName9);

		List<String> temps = names.filter(f -> f.startsWith("V")).sorted().collect(Collectors.toList());
		temps.forEach((e) -> System.out.println(e));

	}

}
