package com.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BIFunction2Test {
	
	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		BiFunction<Integer, String, Student> bf = (id,name)-> new Student(id, name);

		arrayList.add(bf.apply(3, "fj"));
		arrayList.add(bf.apply(2, "Dreksha"));
		arrayList.add(bf.apply(1, "Preksha"));
		
		System.out.println("DATA"+arrayList.get(0));
		
		for (Student student : arrayList) {
			System.out.println("Id :"+student.id);
			System.out.println("Name:"+student.name);
		}
	}

}

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}