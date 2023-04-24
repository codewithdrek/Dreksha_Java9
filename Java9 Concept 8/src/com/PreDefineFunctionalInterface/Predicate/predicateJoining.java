package com.PreDefineFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class predicateJoining {
//you can join multiple predicate join in one 
	//p1 : greater then 10
	//p2 : even or not
	
	//p1.negate(): not greater then is 10 or not 
	//p1.and(p2); combining p1 and p2 in one condition
	//p1.or(p2)
	
	//Multiple Default method
	//negate()
	//and()
	//or()
	//and one abstract method
	//test<T t>
	
	public static void main(String[] args) {
		
		int[] x = {0,1,2,40,4,5,60,7,};
		
		Predicate< Integer> p1 = I -> I>10;
		Predicate<Integer> p2=I->I%2==0;
		
		System.out.println("The num is greatere then 10:");
         m1(p1,x);
         
         System.out.println("The number is even or not :");
         m1(p2,x);
         
         System.out.println("The number is not  gretare then 10");
         m1(p1.negate(),x);
         
         System.out.println("The number is gretare then 10 or even too:");
         m1(p1.or(p2),x);
         
         System.out.println("The number is gretare then 10 and even too:");
         m1(p1.and(p2),x);
	}

	private static void m1(Predicate<Integer> p, int[] x) {
	
		for (int i : x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
