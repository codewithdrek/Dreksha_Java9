package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> integersList = Arrays.asList(1,3,6,8);
		
		   Optional<Integer> o = integersList.stream().reduce((a,b)->a+b); //return type is Optional 
		
		   System.out.println(o);
	}

}
