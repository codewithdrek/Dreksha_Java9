package com.PreDefineFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateStringTest {

	public static void main(String[] args) {
		Predicate<String > p =s->s.length()>5;
		System.out.println(p.test("jdkdjdld"));
	    System.out.println(p.test("cdj"));	
	}
}
