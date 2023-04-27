package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	// 2 things are coming at a same time we should go for streams

	// if u want process each obj from collection one by one use Streams concept

	// get stream obj
//	Stream s = c.stream() . 11 methods i studied
	// .filter (check boolean )
	// .map() (salary inncrement)
	// .collect()
	// .count()
	// min(Comparator c)
	// max(Comparator c)
	// sorted(): natural order sorting
	// sorted(Comparator c): custom sorting
	// foreach()
	// toArray() change stream into Array
	// Stream.of(): apply stream concept on group of value of for arrays also

public static void main(String[] args) {
	List<Integer> ll= new ArrayList<>(Arrays.asList(1,3,4,5,6,7,7));
	System.out.println(ll);//[1, 2, 4, 5, 6, 8] output

	System.out.println(ll.stream().distinct().collect(Collectors.toList()));	
}

}
