package com.Streams;

import java.util.Arrays;
import java.util.List;

public class FOREACH {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(3,5,7,8,0,-8);
		ll.stream().forEach(s->System.out.println(s));
		ll.stream().forEach(System.out::println);
	}
}
