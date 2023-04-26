package com.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CheckNullAndEmptyPredicate {

	static String[] names= {"dreksha","",null,"preksha","om","duggu"};
	
	public static void main(String[] args) {
		Predicate<String> p =s->s !=null && s.length()!=0;
		ArrayList<String> al= new ArrayList<>();
		for (String name : names) { //for each String s in this names Array 
			if(p.test(name)) {//if true 
			System.out.println(" --"+name);
			al.add(name);
			}
		}
		
		System.out.println(al);
	}
}
