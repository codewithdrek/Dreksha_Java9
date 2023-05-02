package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FILTER {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 7, 9, 10, 2);
		List<String> listString = Arrays.asList("RAVI", "SANI", "GIGI", "hjhkhknn", "bbjbjj");
		System.out.println(list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

		List<String> l = listString.stream().filter(s -> s.length() >= 7).collect(Collectors.toList());
		List<String> ll = listString.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l);
		System.out.println(ll);
		
		//COUNT()
		
		
		// from the collection , i filter data based on some condition

		// filter(Can be lemda expression)
		// filter(Predicate<T> t)
		// map<Function<T,U> f>
	}
}
