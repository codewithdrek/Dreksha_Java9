package com.Optional;

public class withOutOptional {

	public static void main(String[] args) {
		String s[]= new String[10];
	    String toLowerCase = s[5].toLowerCase();
	    System.out.println(toLowerCase);
	    
	    //output give us Null pointer exception s[5] ntng is kept
	}
}
