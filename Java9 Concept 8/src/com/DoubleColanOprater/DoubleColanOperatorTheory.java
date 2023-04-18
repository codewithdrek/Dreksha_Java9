package com.DoubleColanOprater;

public class DoubleColanOperatorTheory {
//to implements method reference and const reference
	//inspite of making new method i can use already made method such facilities i can use by :: operators
//already implementation code we cab be able to reuse
	
	//method Ref
	//Inter i = ()->{}
	 
	//Inter i =Test ::m1 test ka m1 uuse karo y we to define again ablove 
	
	//const ref
	//Interf i =Test::new
	
	
	//biggest adv code reusalibity 

	
	//FI can ref Lemda Exp
	//FI can ref Method Ref
	//ofcourse Lemda exp can be replaced with MR
	
	//Method Ref is alternative syntax to Lemda EXp
	//metho name can be diff, arugument must be same, return type is diff 
	
	
	
	///Syntax for MR  
	
	//need
	//one interface
	//old way
	/*
	 * interface Interf { public void m1(); } class Test{ public static void
	 * main(String[] args) { //one way //provide implement of m1 Interf i
	 * =()->{System.out.println("lemda exp"); //m1 body by lamda //n no of line
	 * i.m1();//calling of m1 };
	 * 
	 * }
	 * 
	 * }
	 */


	//orher way is MR
	interface InterfMR
	{
		public void m1();
	}
	class TestMR{
		
		public static void m2() {
		System.out.println("implementation code is der by MR");
			}
		//in case of MR we can ref simlar Method
		//like above m2 body is same like we made m1 in above code 
		//rule metho has static keyword
		//method no argument
		
		
		public static void main(String[] args) {
			//provide implement of m1
			InterfMR i1= TestMR::m2; // bracket open and close,Function interface internally ref to m1 method
			i1.m1();
			//System.out.println(TestMR::m2());
			};
	
	}
}

	

	//implement
	//Advantage 
	
	
	
	
	//if static method
	   // className:: method name  
	  //  Test::m2
	//or if instance method non static 
    //objectRef::methodName
    //  obj::m2

