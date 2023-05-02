package com.ToIntFunction;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {

	public static void main(String[] args) {
		ToIntFunction<String> toIntFunction = s->s.length();
		System.out.println(toIntFunction.applyAsInt("DEMO"));
		
	}
}
