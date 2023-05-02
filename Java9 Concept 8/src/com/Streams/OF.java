package com.Streams;

import java.util.stream.Stream;

public class OF {

	public static void main(String[] args) {
		
		
		//streams are not applicable for only collection
		//applicable to group of values and  for array
		
		//stream can not only be applicable for collection application for  group of value+arrays as well
		
		Stream<Integer> stream =Stream.of(9,99,999,9999);
        stream.forEach(System.out::println);
        
        Double[] d= {(double) 90,(double) 90,(double) 0,	(double) 10};
        Stream<Double> stream2 =Stream.of(d);
        stream2.forEach(System.out :: println);
	}
}
