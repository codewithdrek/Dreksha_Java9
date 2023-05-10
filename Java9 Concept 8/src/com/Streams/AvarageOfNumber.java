package com.Streams;

import java.util.Arrays;
import java.util.List;

public class AvarageOfNumber {

	public static void main(String[] args) {
		List<Integer > jg= Arrays.asList(2,54,7,9);
		   double gh = jg.stream().mapToInt(a->a).average().getAsDouble();
		   System.out.println(gh);
		
 	}
}
