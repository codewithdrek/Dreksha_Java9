package com.Function;

import java.util.ArrayList;
import java.util.Optional;

public class GreaterMultiplyAndSumStream {

	
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		//multiply if num is > 2
		//sum
		
		 Optional< Integer>  finalList = list.stream().filter(n->n > 2).map(n->n*2).reduce(Integer :: sum);
		// List<Integer> response //.collect(Collectors.toList());
				
				//.map(n->n*2);
		System.out.println(finalList);
		
	}
}
	