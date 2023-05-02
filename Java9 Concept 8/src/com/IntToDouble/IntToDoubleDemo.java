package com.IntToDouble;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleDemo {
	public static void main(String[] args) {
		
		IntToDoubleFunction doubleFunction = i->Math.sqrt(i);
		System.out.println(doubleFunction.applyAsDouble(6));
	}

}
