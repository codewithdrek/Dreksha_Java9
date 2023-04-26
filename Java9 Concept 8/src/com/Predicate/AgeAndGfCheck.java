package com.Predicate;

public class AgeAndGfCheck {

	int age;
	String name;
	boolean havingGfOrNot;

	public AgeAndGfCheck(String name, int age, boolean b) {

		this.name = name;
		this.age = age;
		this.havingGfOrNot = b;
	}

	@Override
	public String toString() {
		return "AgeAndGfCheck [age=" + age + ", name=" + name + ", havingGfOrNot=" + havingGfOrNot + "]";
	}

}
