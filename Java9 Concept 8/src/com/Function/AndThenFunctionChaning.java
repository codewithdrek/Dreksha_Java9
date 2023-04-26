package com.Function;

import java.util.function.Function;

//Function Chaining
public class AndThenFunctionChaning {

	// f1.andThen(f2)//first apply f1 and then f2

	// 2 default method of interfacec
	// andThen()
	// compose()

	public static void main(String[] args) {
		Function<String, String> f1 = n -> n.toUpperCase();
        Function<String, String> f2 = n-> n.substring(0,9);

	
	System.out.println(""+f1.apply("Radhakrishna"));
	System.out.println(f2.apply("Radhakrishna"));
	System.out.println(f1.andThen(f2).apply("Radhakrishna"));
    System.out.println(f1.compose(f2).apply("Radhakrishna"));
	}

}
