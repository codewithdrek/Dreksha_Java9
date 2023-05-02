package com.BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BIConsumerByFunction {

	public static void main(String[] args) {

		ArrayList<Emp> arrayList = new ArrayList<>();

		//BI Function return EMP Object
		BiFunction<String, Double, Emp> biFunction = (a, b) -> new Emp(a, b);
		arrayList.add(biFunction.apply("DADA", (double) 1000000));
		arrayList.add(biFunction.apply("AAA", (double) 70000));	
		arrayList.add(biFunction.apply("BBB", (double) 80808));

		for (Emp emp : arrayList) {
			System.out.println(emp.name+" "+emp.salary);
		}
		
		//BiConsumer accept Emp obbj + incremental salary
		BiConsumer<Emp, Double> bc3 = (e,incre)-> e.salary = e.salary+incre;
		
		for (Emp emp1 : arrayList) {
			bc3.accept(emp1, (double) 5000);
		}
		
		for (Emp emp : arrayList) {
			System.out.println(emp.name);
			System.out.print(emp.salary);
		}
		
	}

}

class Emp {
	String name;
	double salary;

	public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

}
