package com.Supplier;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		Supplier<String> s =()->{
			String s1[]= {"BINNY","SUNNY","CANNY"};
			int x= (int) ((Math.random())*2);
			return s1[x];
		};

		System.out.println(s.get());
	}
}
