package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EMPLOYEEExample {

	public static void main(String[] args) {

		List<EMP1> employees = new ArrayList<EMP1>();

		employees.add(new EMP1("A", "MALE", 67, "IT"));
		employees.add(new EMP1("B", "FEMALE", 7, "HR"));
		employees.add(new EMP1("C", "MALE", 6, "IT"));
		employees.add(new EMP1("D", "FEMALE", 6790, "HR"));
		employees.add(new EMP1("E", "FEMALE", 6877, "IT"));
		
		//employees.stream().map(n->n.getDepartment()).distinct().collect(Collectors.toList());
		employees.stream().map(n->n.getDepartment() ).distinct().forEach(System.out::println);
	   //&& n.getAge()	 
		
		Map<String ,Long> empCount = employees.stream().collect(Collectors.groupingBy(EMP1 :: getDepartment,Collectors.counting()));
	 //groupingBy is method with give us MAP 
              
		Map<String, Double>  map2= employees.stream().collect(Collectors.groupingBy(EMP1::getGender,Collectors.averagingDouble(EMP1::getAge)));
       // System.out.println(empCount);
        //System.out.println(map2);
	
	}

}

class EMP1 {

	private String name;
	private String gender;
	private int age;
	private String department;

	public EMP1(String name, String gender, int age, String department) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EMP{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", age=" + age + ", department='"
				+ department + '\'' + '}';
	}
}
