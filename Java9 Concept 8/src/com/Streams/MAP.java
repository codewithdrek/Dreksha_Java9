package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MAP {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(3,5,7,9,10,2);
		System.out.println(list.stream().map(i->i*2).collect(Collectors.toList()));
	
	}
}


//Java .til.stream package Streams in present as interface
//c.stream : is a method present in Collection
