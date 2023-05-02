package com.BinaryOpearrtors;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorDemo {

	
	public static void main(String[] args) {
		
		//function<T,T> : unaryOperator
		//BiFunction<T,T,T> :Binary Operator
		
		//All 3 type are of same type STring,String,String
		BinaryOperator<String> binaryOperator = (s1,s2)->s1+s2;
		System.out.println(binaryOperator.apply("Dreksha", "Durga"));
		
		//all 3 thing are of same type integer,integer,integer
		IntBinaryOperator intBinaryOperator =(i,j)->(i+j);
		System.out.println(intBinaryOperator.applyAsInt(12, 12));
		
		LongBinaryOperator longBinaryOperator =(i,j)->i+j;
		System.out.println(longBinaryOperator.applyAsLong(90,90));
		
		DoubleBinaryOperator doubleBinaryOperator  =(i,j)->i+j;
		System.out.println(doubleBinaryOperator.applyAsDouble(90,90));
	}
}
