package com.Streams;

import java.util.Arrays;
import java.util.List;

public class TOARRAY {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(3, 5, 7, 8, 0, -8);

		// ll.stream().toArray(Integer[]:: new);
		Integer[] integer = ll.stream().toArray(Integer[]::new);
		for (Integer integer2 : integer) {
			System.out.print(integer2);
			System.out.print(" ");
		}
	}
}

//copy element present in stream into INTEGER array int[]