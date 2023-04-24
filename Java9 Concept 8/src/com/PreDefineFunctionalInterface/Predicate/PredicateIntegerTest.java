package com.PreDefineFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateIntegerTest {

	public static void main(String[] args) {
		Predicate<Integer> p=I->I>10;
		System.out.println(p.test(0));
		System.out.println(p.test(4));
		System.out.println(p.test(400));
	//	System.out.println(p.test("DRe"));
	}
}

