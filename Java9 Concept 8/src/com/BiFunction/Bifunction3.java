package com.BiFunction;

import java.util.function.BiFunction;

public class Bifunction3 {

	public static void main(String[] args) {
		BiFunction<Employee, TimeSheet, Double> bf = (emp, time) -> emp.dailywage * time.noOfDays;
		Employee employee= new Employee(1,"Dreksha", 50000);
		TimeSheet timeSheet = new TimeSheet(1, 30);
		System.out.println(bf.apply(employee, timeSheet));
	}
}

class Employee {

	int empId;
	String name;
	double dailywage;

	public Employee(int empId, String name, double dailywage) {
		this.empId = empId;
		this.name = name;
		this.dailywage = dailywage;
	}

}

class TimeSheet {

	int empId;
	int noOfDays;

	public TimeSheet(int empId, int noOfDays) {
		this.empId = empId;
		this.noOfDays = noOfDays;
	}

}