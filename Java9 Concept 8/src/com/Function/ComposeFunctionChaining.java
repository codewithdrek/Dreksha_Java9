package com.Function;

import java.util.function.Function;

public class ComposeFunctionChaining {

	
	//Defaullt : //Method Compose(),andThen()
	//anstract Method: apply(T t , R r)
	
	//f1.compose(f2) // first f2 apply then f1

public static void main(String[] args) {
	Function<Integer, Integer> f1=i->i+1;
	Function<Integer, Integer> f2=i->i*i*i;
	
	System.out.println(f1.andThen(f2).apply(2));
	System.out.println(f1.compose(f2).apply(2)); //f2 will run first 
}
}


