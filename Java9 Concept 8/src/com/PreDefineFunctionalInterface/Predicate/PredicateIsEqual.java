package com.PreDefineFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateIsEqual {

	// negate ,and,or is default method
	// IsEqual is Static method

	public static void main(String[] args) {
		Predicate<String> predicate = Predicate.isEqual("Dreksha");
		System.out.println(predicate.test("Dreksha"));
		System.out.println(predicate.test("Dreks"));

		Predicate<Emplyoee> p = Predicate.isEqual(new Emplyoee("Pksha", 1000, "CEO", "Banagalore"));
		Emplyoee emplyoee1 = new Emplyoee("Pksha", 1000, "CEO", "Banagalore");
		Emplyoee emplyoee2 = new Emplyoee("Pksha", 1000, "Director", "Banagalore");

		System.out.println(p.test(emplyoee1));
		System.out.println(p.test(emplyoee2));

	}
}
