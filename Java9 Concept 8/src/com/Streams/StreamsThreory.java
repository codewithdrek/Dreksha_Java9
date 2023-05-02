package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsThreory {

	//OLD STREAMS
	//want to text data,binary data to the file or read binary,text from the file then we shuld for Streams
	//sequence of char which will be used to file IO  go for concept of Streams
	
	//NEW STREAMS
	//if we have to go for collection of data
	//if you want to process collection of object one by one from collections go for STreams
	
	//Difference between Collection and Streams
	
	//Collection: Represent group of obj as a single entity  called Collection
	//Streams: what is the purpose  if you want to proper object from the collection,I want to Apply operation on all the object from Collection
	//(bulk operation)
	
	//eg : iff i want all student whose marks are greater then 80% hense use Streams
	
	
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
	
}
}
