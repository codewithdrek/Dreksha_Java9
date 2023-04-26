package com.Function;

import java.util.function.Function;

public class BlackSpacesCount {
	public static void main(String[] args) {
		String s = "gh hjh bjb jhj";
        System.out.println(s.length());
        System.out.println(s.replaceAll(" ", "").length());
	
        Function<String, Integer> f = s1 -> s1.length() - s1.replaceAll(" ", "").length();
		System.out.println(f.apply(s));
	}
}
