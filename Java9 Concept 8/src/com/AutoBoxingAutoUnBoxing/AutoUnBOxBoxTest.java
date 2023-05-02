package com.AutoBoxingAutoUnBoxing;

import java.util.Iterator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class AutoUnBOxBoxTest {

	public static void main(String[] args) {
		int x[]= {4,5,7,9,2};
		
		//EG BY PREDICATE WILL ALSO RUN BUT it lower down the performance by auto boxing and unboxing
		Predicate<Integer> p = n->n%2==0;
		//Predicate<Integer> p1 = n-> n*2; //my statement is returning something but predicate always ask boolen logic hence line is wrong
		for (int i : x) {
			//p.test(i);//wrong always test will cod e in either sysout or if condition
			if(p.test(i)) {
				System.out.println(" "+i);
			}
			
		}
		
		
		//NOW CHECK SAME XAMPLE 
		
		IntPredicate ip = n->n%2==0;
		
		for (int i : x) {
			if(ip.test(i)) {
				System.out.println(""+i);
			}
		}
		
		//BOTH CASE SAME OUTPUT but in below case it gives us high perfomant becz we are passing primite as in Predicate ,no need to do Autoboxing and unboxing 
		
		
 	}
}

