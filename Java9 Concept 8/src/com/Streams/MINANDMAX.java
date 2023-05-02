package com.Streams;

import java.util.Arrays;
import java.util.List;

public class MINANDMAX {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(3,5,7,8,0,-8);
		Integer i = ll.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min :"+i);
		
		Integer i2 = ll.stream().max((obj1,obj2)->obj1.compareTo(obj2)).get();
		System.out.println("Max: "+i2);
		
		}
}
