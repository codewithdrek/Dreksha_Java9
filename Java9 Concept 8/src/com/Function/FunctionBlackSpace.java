package com.Function;

import java.util.function.Function;

public class FunctionBlackSpace {

	public static void main(String[] args) {
		String s="vvh bjbj bhjhjk nkj";
		Function<String, String> f=s1->s1.replaceAll(" ", "");
		System.out.println(f.apply(s));
		
	}
}
