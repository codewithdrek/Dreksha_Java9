package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomJAVA8SortingCustomAndManual {
	public static void main(String[] args) {
	
		List<String> s1 = Arrays.asList("RED","BLUE","BLANK","RED","A","BIBI","CISCO");
		List<Integer> s2 = Arrays.asList(1,3,5,7);
		
		//select RED
		System.out.println(s1.stream().filter(n->n.equals("RED")).collect(Collectors.toList()));
		//By Default Sorting
		System.out.println(s1.stream().sorted().collect(Collectors.toList()));
		
		//Custom Sorting
		System.out.println(s1.stream().sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1) ;
			}
		}).collect(Collectors.toList()));
	}
}

//z@hasRole
//1 level cache
//2 leve : default

//2 work 30 sec 20 sec : Multhinring
//Hashset and Treeset diff
//Hashset is the execution of the set interface and is backed by hashmap, while on the other hand, Tree set executes sorted sets and is backed by TreeMap.
//

//toList(), toSet(), toMap(), and toConcurrentMap()


