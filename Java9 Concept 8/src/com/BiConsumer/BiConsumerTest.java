package com.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		
		//No return Type so after arrow-> ntng logic 
		BiConsumer<String , String> bc= (str1,str2)->System.out.println(str1+str2);
		
		bc.accept("Dreksha", "Chaudhary");
	
	}
}
