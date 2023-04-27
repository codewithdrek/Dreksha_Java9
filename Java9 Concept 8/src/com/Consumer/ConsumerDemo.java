

package com.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
     //only consume
	//never return anything
	//same like function
	//prototy
		/*
		 * interface Consumer<T>{
		 * 
		 * public void accept(T t ); }
		 */
	//Scenario when we dont want to return anything only consume

	public static void main(String[] args) {
		
		Consumer<String> c= n-> System.out.println(n);
		c.accept("DRE");
	}
}
