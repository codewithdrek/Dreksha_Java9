package com.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee {
	int salary;
	String name;

	public Employee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
	

}

public class TotalSalary{
	
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<>();
		populate(arrayList);

		
		Predicate<Employee> p=n->n.salary<3500;
		Function<Employee, Employee> f= n-> {
			n.salary=n.salary+477;
			return n;
		};
		
		//new ArrayList
		
		ArrayList<Employee> newlist= new ArrayList<>();
		
		for (Employee employee : newlist) {
			if(p.test(employee)) {
				f.apply(employee);
				newlist.add(employee);
			}
		}
		
		//After increment
		for (Employee employee : newlist) {
			System.out.println("___________"+employee.name);
		}
		
		/*
		 * //Total salary in month Function<ArrayList<Employee>, Double> f = n->
		 * //Remember always n always is of type arrayList { double total =0; for
		 * (Employee employee : arrayList) {
		 * 
		 * total=total+employee.salary; //ye logic for every loop run ho }
		 * 
		 * return total;
		 * 
		 * }; System.out.println("Total Monthly Salary of All Employee : "+
		 * f.apply(arrayList));
		 */	
		}

	private static void populate(ArrayList<Employee> arrayList) {
		
		arrayList.add(new Employee(30000, "DRe"));
		arrayList.add(new Employee(10000, "IOI"));
		arrayList.add(new Employee(50000, "dnj"));
		arrayList.add(new Employee(5000, "dnj"));
		arrayList.add(new Employee(4000, "dnj"));
		
	}
	
	//SInglton and Immutable
	//singlton have one instance throught out the application,once the instance has been created ,you can use to change the state od the project
	//Immutable same but ijn that case you wont allow to change the state of the object like in object multiple filed can be der it wont allow to change those filed value
}