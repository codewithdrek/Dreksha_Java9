package com.DoubleColanOprater;


public class MethodRefrence {

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

//if Static 
//className:: methosName
//non static
//obj::methodName
