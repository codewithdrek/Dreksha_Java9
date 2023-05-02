package com.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer>   biPredicate = (a,b)-> (a+b)%2 == 0;
		System.out.println(biPredicate.test(10, 10));
		System.out.println(biPredicate.test(19, 20));
		
	}
}
