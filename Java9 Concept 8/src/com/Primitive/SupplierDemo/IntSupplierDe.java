package com.Primitive.SupplierDemo;

import java.util.function.IntSupplier;

public class IntSupplierDe {

	public static void main(String[] args) {

		// IntSupplier s = ()//make sure in supplier we can't pass anything
		IntSupplier s = () -> (int) (Math.random() * 10);
		String otp = "";
		for (int i = 0; i < 6; i++) {
			otp = otp + s.getAsInt();
			// otp = otp+s.get()//OLD
		}
		System.out.println("The 6 digit OTP : " + otp);
	}
	
     //	4 primitive Supplirs 
	//longSupplier   : getAsLong
	//DoubleSupplier : getAsDouble
	//IntSupplier    : getAsInt
	//BooleanSupplier: getAsBoolean
}
