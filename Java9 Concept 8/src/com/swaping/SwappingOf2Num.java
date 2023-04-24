package com.swaping;

public class SwappingOf2Num {

	static int a = 20;
	static int b = 30;

	public static void main(String[] args) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}

}
