package com.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {

	int id;
	String name;
	String grade;
	int marks;

	public Student(int id, String name, String grade, int marks) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}

}

public class AllTest {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		populate(arrayList);

		// predicate only for boolean
		Predicate<Student> p = s -> s.marks >= 60; // s is the type of marks pass in <Student>

		// function to calculate grade
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks > 60) {
				return "A";
			} else if (marks >= 80) {
				return "B";
			} else {
				return "fail";
			}

		};

		Consumer<Student> c = s -> {
			System.out.println(s.name);
			System.out.println(s.id);
			System.out.println(f.apply(s));
			System.out.println("  ");
		};

		// run for every element present in loop
		for (Student student : arrayList) {
			if (p.test(student)) { // predicate always comes in if condition
				c.accept(student);
			}
		}
	}

	private static void populate(ArrayList<Student> arrayList) {
		arrayList.add(new Student(0, "boy1", "A", 89));
		arrayList.add(new Student(2, "boy2", "B", 90));
		arrayList.add(new Student(3, "boy3", "C", 60));
		arrayList.add(new Student(4, "boy4", "D", 56));
		arrayList.add(new Student(5, "boy5", "E", 34));
	}
}
