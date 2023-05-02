package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DISTINT {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<>(Arrays.asList(90, 3, 4, 5, 6, 7, 7));
	
		System.out.println(ll);// [1, 2, 4, 5, 6, 8] output
		System.out.println(ll.stream().distinct().collect(Collectors.toList()));
		System.out.println(ll.stream().count());
		System.out.println(ll.stream().findFirst());
		System.out.println(ll.stream().findAny());
	}

}
