package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SORT {
	
		public static void main(String[] args) {
			List<Integer> list = Arrays.asList(3, 5, 7, 9, 10, 2);

			
			//Natural Order sorting
			System.out.println(list.stream().sorted().collect(Collectors.toList()));

			//Custom sorting
			System.out.println(list.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList()));

			System.out.println(list.stream().sorted((o1,o2)-> -o1.compareTo(o2)).collect(Collectors.toList()));

	}

}
