package com.PreDefineFunctionalInterface.Predicate;

public class Emplyoee {

	String name;
	int salary;
	String designation;
	String city;

	public Emplyoee(String name, int salary, String designation, String city) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.city = city;
	}

	@Override public String toString() { // String s1
	  //String s1 = String.format("(%s,%s,%s,%s)", name,salary,designation,city); 
	  //String s2 =String.format("{%s,%s,%s,%s}", name,salary,designation,city); 
	  String s3 =String.format("{%s,%.4s,%s,%s}", name,salary,designation,city);
	  
	  
	  return s3; }

}
