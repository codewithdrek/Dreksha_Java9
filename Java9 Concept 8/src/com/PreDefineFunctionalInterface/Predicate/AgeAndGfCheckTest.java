package com.PreDefineFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class AgeAndGfCheckTest {

	public static void main(String[] args) {
		AgeAndGfCheck[] ageAndGfChecks=  {
				                       new AgeAndGfCheck("SONAL",17,true),
									   new AgeAndGfCheck("DURGA",90,false),
									   new AgeAndGfCheck("TOVJ",7,true),
									   new AgeAndGfCheck("JAVIK",19,true)
									   };
		
		Predicate<AgeAndGfCheck> p = s-> s.age>18 && s.havingGfOrNot==true;
		for (AgeAndGfCheck ageAndGfCheck : ageAndGfChecks) {
		  if(p.test(ageAndGfCheck)) {
			  System.out.println(ageAndGfCheck);
		  }
		}
		
	}
}
