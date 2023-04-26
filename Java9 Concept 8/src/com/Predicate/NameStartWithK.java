package com.Predicate;

import java.util.function.Predicate;

public class NameStartWithK {
	static String[] names = { "SUNNY", "KAJAL", "MALIKA", "KATRINA" };

	public static void main(String[] args) {
		Predicate<String> p = s->s.charAt(0)=='K';
		try {
			for (String name : names) {
				if(p.test(name))
					System.out.println("name Stats with k is :  "+name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
