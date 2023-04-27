package com.Function;

import java.util.function.Function;

public class IdentityStaticMethod {

	public static void main(String[] args) {
		Function<Integer, Integer> f1= Function.identity();
		System.out.println(f1.apply(78));
		
		
		Function<String, String> f2= Function.identity();
		System.out.println(f2.apply("DRe"));
		
		//return is same kind of result as same type of input you pass
	}
}
