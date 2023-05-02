package com.demo;

public class XYZ {

	static int[] a= {1,2,3,4,5,7,10};
	static int result=8;
	public static void main(String[] args) {
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				
			  if(a[i]+a[j]== result) {
				  
				  System.out.println("Sum of first numbers: "+a[i] +"  Second Number"+a[j]);
			  }
				
			}
		}
	}
}


