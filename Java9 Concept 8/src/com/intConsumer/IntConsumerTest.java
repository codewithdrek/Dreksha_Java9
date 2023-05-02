package com.intConsumer;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class IntConsumerTest {

	
	public static void main(String[] args) {
		IntConsumer  intConsumer = i->System.out.println(""+i*i);
		intConsumer.accept(6);
		
		LongConsumer longConsumer= i->System.out.println(""+i);
	    longConsumer.accept(78);
	    
	    //NOTE if it is object type better to go for Normal Consumer
	    //if it is primitive type  GO FOR Primitype type
	}
	
}
