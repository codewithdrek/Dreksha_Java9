package com.Function;

import java.util.function.Function;

public class FunctionLength {

	
	public static void main(String[] args) {
		Function<String, Integer> f1=s->s.length();
		System.out.println(f1.apply("D"));
		System.out.println(f1.apply("DATA"));
	
		
		Function<Integer, Integer> f2=i->i*i;
		System.out.println(f2.apply(5));
		System.out.println(f2.apply(6));
	
	}
}

