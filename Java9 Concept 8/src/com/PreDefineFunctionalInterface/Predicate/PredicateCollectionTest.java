package com.PreDefineFunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCollectionTest {

	public static void main(String[] args) {
		Predicate<Collection> p = c -> c.isEmpty();
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("ckf");
		ArrayList<String> arrayList2 = new ArrayList<>();
		System.out.println(p.test(arrayList1));
		System.out.println(p.test(arrayList2));
	}
}


//test  method take only one argument 
//test can return one thing boolean 