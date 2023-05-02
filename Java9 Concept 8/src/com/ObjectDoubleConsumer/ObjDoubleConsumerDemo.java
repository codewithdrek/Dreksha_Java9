package com.ObjectDoubleConsumer;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerDemo {
public static void main(String[] args) {
	
	ArrayList<Employee> al= new ArrayList<Employee>();
	populate(al);
	ObjDoubleConsumer<Employee> c = (e,d)->e.salary=e.salary+d; //+d se .0 will add automatically
	for (Employee employee : al) {
		c.accept(employee, 500.0);//obj1+500 added
	}
	
	for (Employee employee : al) {
		System.out.print("NAME: "+employee.name);
		System.out.print("SALARY: "+employee.salary);
		System.out.println(" ");
	}
}

private static void populate(ArrayList<Employee> al) {
	
	al.add(new Employee("Durga", 1000)); //obj1
	al.add(new Employee("SUNNY", 2000));//ob2
	al.add(new Employee("Bunny", 3000));//obj3
	al.add(new Employee("Chinny", 4000));//obj4
	
}
}

class Employee{
	
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	// 6 Primitive CONSUMER
	//intConsu
	//doullCondu
	//LongCon
	//ObjDounle
	//ObjLon
	//ObjIntConsumer
}
