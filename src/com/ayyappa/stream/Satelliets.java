package com.ayyappa.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Satelliets {

	public static void main(String[] args) {

		String satellites1 = "CartoSat-1";
		String satellites2 = "HamSa";
		String satellites3 = "RISAT-2";
		String satellites4 = "TES";
		String satellites5 = "IRS-1C";
		String satellites6 = "INSAT-1";
		String satellites7 = "SROSS";
		String satellites8 = "IRS-1A";
		String satellites9 = "SROSS-";
		String satellites10 = "INSAT-";
		String satellites11 = "NSAT-1A";
		String satellites12 = "Bhaskara -II";
		String satellites13 = "APPLE";
		String satellites14 = "Rohini";

		Stream<String> varName1 = Stream.of(satellites1, satellites2, satellites3, satellites4, satellites5,
				satellites6, satellites7, satellites8, satellites9, satellites10, satellites11, satellites12,
				satellites13, satellites14);
		List<String> list = varName1.parallel().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(
				".......................................................lower case.......................................................");
		list.forEach(s -> System.out.println(s));

		Stream<String> varName = Stream.of(satellites1, satellites2, satellites3, satellites4, satellites5, satellites6,
				satellites7, satellites8, satellites9, satellites10, satellites11, satellites12, satellites13,
				satellites14);
		List<String> list2 = varName.parallel().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(
				"............................................upper case................................................");
		list2.forEach(s -> System.out.println(s));

		Stream<String> varName2 = Stream.of(satellites1, satellites2, satellites3, satellites4, satellites5,
				satellites6, satellites7, satellites8, satellites9, satellites10, satellites11, satellites12,
				satellites13, satellites1);
		List<String> list3 = varName2.sorted().collect(Collectors.toList());
		System.out.println(
				"------------------------------------------ascending order-----------------------------------------------");
		list3.forEach(s -> System.out.println(s));

		Stream<String> varName3 = Stream.of(satellites1, satellites2, satellites3, satellites4, satellites5,
				satellites6, satellites7, satellites8, satellites9, satellites10, satellites11, satellites12,
				satellites13, satellites14);
		List<String> list4 = varName3.sorted((d1, d2) -> d2.compareTo(d1)).collect(Collectors.toList());
		System.out.println("********************************descending order*****************************************");
		list4.forEach(i -> System.out.println(i));

	}

}
