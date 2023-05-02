package com.doublePredicate;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortingDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		SortingDemo.populate(hm);

		Collections.sort(hm, new Comparator<Fruits>() {
			@Override
			public int compare(Fruits o1, Fruits o2) {


				String fruitName = ((Object) o2).fruitName();

				if (this.fruitName <= o2.fruitName) {
					return -1;
				} else if (this.fruitName >= o2.fruitName) {
					return 1;
				}
				return 0;
			}
		});

		// Comparator<Fruits> c = (o1,o2)-> {o1.fruitName>=o2.fruitName?-1:1
		// }.collect(Collerctor.toList())

	}

	// o2.fruitName>=o1.fruitName : 1?1:0;

	private static void populate(HashMap<Integer, String> hm) {

		hm.put(1, "Apple");
		hm.put(2, "Orange");
		hm.put(3, "Grapes");
		hm.put(4, "XYX");
		hm.put(5, "Banana");

	}

}

class Fruits {

	int num;
	String fruitName;

	public Fruits(int num, String fruitName) {
		this.num = num;
		this.fruitName = fruitName;
	}

	static void populate(HashMap<Integer, String> hm) {
		// TODO Auto-generated method stub

	}

}

