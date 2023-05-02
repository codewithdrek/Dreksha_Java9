package com.unaryOperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	//Its a child of Function<T,U>
	//if the output and input are of same typr we should go for Uranary operator
	public static void main(String[] args) {
		
		UnaryOperator<Integer> unaryOperator =n->n*10;
		System.out.println(unaryOperator.apply(10));
		
		IntUnaryOperator intUnaryOperator = n->n*10;
		System.out.println(intUnaryOperator.applyAsInt(10));
	
		
		LongUnaryOperator longUnaryOperator = n->n*10;
		System.out.println(longUnaryOperator.applyAsLong(10));
		
		DoubleUnaryOperator doubleUnaryOperator = n->n*10;
		System.out.println(doubleUnaryOperator.applyAsDouble(10));
	}
	
	
}
