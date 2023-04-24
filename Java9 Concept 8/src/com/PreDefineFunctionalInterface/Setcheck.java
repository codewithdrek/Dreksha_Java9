package com.PreDefineFunctionalInterface;

import java.util.HashSet;

public class Setcheck {

	public static void main(String[] args) {
		HashSet<String>  h= new HashSet<>();
		h.add(null);
		h.add(null);
		h.add(null);
		h.add("hi");
		System.out.println(h);
		
		//hense proved Nul allow
		//[null, hi]
	}
}
