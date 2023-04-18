package com.Optional;


import java.util.Optional;

public class WithOptional {
	public static void main(String[] args) {
		String s[]= new String[10];
		s[5]="dVBJKBK";
		//Optional< String> optional = new Optional<String>();
		
		Optional< String> optional = Optional.ofNullable(s[5]);
		
		if(optional.isPresent()) {
			String localCase = s[5].toLowerCase();
			//System.out.println(localCase);
			
			//Diff way to print
			optional.ifPresent(System.out::println);
			 System.out.println(optional.get());
			 
		}
		else {
			System.out.println("Not Present");
		}
	
	}

}
