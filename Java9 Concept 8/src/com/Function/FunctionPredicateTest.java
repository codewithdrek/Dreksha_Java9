package com.Function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

	public class FunctionPredicateTest {

		public static void main(String[] args) {
			ArrayList<Student> arrayList = new ArrayList<>();
			populate(arrayList);
		
			Function<Student, String> f = s-> //s of type student
			{
				
				int marks=s.marks;
				if(marks>=80) {
					return "A";
				}
				else if (marks>=50) {
					return"B";
					
				}
				else if (marks>20) {
					return "C";
				}
				else {
					return "Fail"; // return "" String type
				}
			} ;
			
			
			//PREDICATE ALONG WITH FUNCTION
			Predicate<Student> p = s->s.marks>70;
			for (Student student : arrayList) {
				if(p.test(student)) {
					
					System.out.println("Name : "+student.name);
					System.out.println("Marks : "+student.marks);
					System.out.println("GREADE : "+f.apply(student));
					System.out.println(" ");
				}
			}
		
			//total salary check
			
		}
		

		private static void populate(ArrayList<Student> arrayList) {
			arrayList.add(new Student("Dre", 100));
			arrayList.add(new Student("Pre", 99));
			arrayList.add(new Student("dn", 80));
			arrayList.add(new Student("bjb", 70));
			arrayList.add(new Student("mm", 60));
			arrayList.add(new Student("hj", 50));
			arrayList.add(new Student("hk", 40));
			arrayList.add(new Student("jbbj", 30));

		}
	}
	
	//always rmb Linklist while loop lagta hai 
	//Java 8 design patterns me always use forloop


