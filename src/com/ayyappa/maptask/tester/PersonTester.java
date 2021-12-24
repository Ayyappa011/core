package com.ayyappa.maptask.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ayyappa.maptask.PersonDTO;

public class PersonTester {

	public static List<PersonDTO> findPersonDetails() {

		List<PersonDTO> persondtos = new ArrayList<PersonDTO>();

		persondtos.add(new PersonDTO(14, "vandu", 21, "vandu799@gmail.com"));
		persondtos.add(new PersonDTO(25, "Ayyappa reddy", 23, "ayyappa4013@gmail.com"));
		persondtos.add(new PersonDTO(10, "lucky reddy", 25, "ayyappa.xworkz@gmail.com"));
		persondtos.add(new PersonDTO(9, "Sun reddy", 20, "sunireddy011@gmail.com"));
		persondtos.add(new PersonDTO(54, "sangeeta", 26, "sanguu77@gmail.com"));
		persondtos.add(new PersonDTO(8, "teju", 22, "teju333@gmail.com"));
		persondtos.add(new PersonDTO(11, "kulli", 29, "kulli001@gmail.com"));
		return persondtos;
	}

	public static void main(String[] args) {

		List<PersonDTO> persondtos1 = findPersonDetails();

		Map<Integer, String> maps = persondtos1.stream()
				.collect(Collectors.toMap(PersonDTO::getAge, PersonDTO::getName));
		System.out.println(maps);
		System.out.println(
				"============================================================================================================");
		Map<String, String> maps2 = persondtos1.stream().filter((e) -> e.getEmail().contains("@"))
				.collect(Collectors.toMap(PersonDTO::getName, PersonDTO::getEmail));
		System.out.println(maps2);
		System.out.println(
				"============================================================================================================");
		Comparator<PersonDTO> comparator = (s1, s2) -> {
			int s1age = s1.getAge();
			int s2age = s2.getAge();
			if (s1age == s2age)
				return 0;
			if (s1age > s2age)
				return -25;
			if (s1age < s2age)
				return 25;
			return 0;

		};

		persondtos1.stream().sorted(comparator).forEach((e) -> System.out.println(e));
        System.out.println("=======================================================================");
		persondtos1.sort(Comparator.comparing(PersonDTO::getName).thenComparing(PersonDTO::getName));
		System.out.println("=======================================================================");
		Comparator<PersonDTO> cmpt = (h1, h2) -> h1.getName().compareTo(h2.getName());
		System.out.println(cmpt);
	}

}
