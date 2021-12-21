package com.ayyappa.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cereals {

	public static void main(String[] args) {
		Float cereals= 10.5f;
		Float cereals1= 11.9f;
		Float cereals2= 9.5f;
		Float cereals3= 5.6f;
		Float cereals4= 7.18f;
		Float cereals5= 9.11f;
		Float cereals6= 6.7f;
		Float cereals7= 7.0f;
		Float cereals8= 1.3f;
		Float cereals9= 7.6f;
		Float cereals10= 11.4f;
		Float cereals11= 8.6f;
		Float cereals12= 9.7f;
		Float cereals13= 2.6f;
		Float cereals14= 6.3f;
		Float cereals15= 3.9f;
		Float cereals16= 8.5f;
		Float cereals17= 13.9f;
		Float cereals18= 4.4f;
		Float cereals19= 1.8f;
		
		Stream<Float> cereal=Stream.of(cereals,cereals1,cereals2,cereals3,cereals4,cereals5,cereals6,cereals7,cereals8,cereals9,
				cereals10,cereals11,cereals12,cereals13,cereals14,cereals15,cereals16,cereals17,cereals18,cereals19);
		
		List<Float> values=cereal.filter((s)-> s<=7.9 && s>2.2).collect(Collectors.toList());
		values.forEach(s-> System.out.println(s));
		


	}

}
