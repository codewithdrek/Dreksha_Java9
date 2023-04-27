package com.Function;

import java.util.*;
import java.util.function.*;

public class AuthByStream {

	public static void main(String[] args) {

		Function<String, String> f1 = n -> n.toLowerCase();
		Function<String, String> f2 = n -> n.substring(0, 5);

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter UserName :");

		String userName = s1.next();

		System.out.println("Enter Password :");

		String pass = s1.next();


		if (f1.andThen(f2).apply(userName).equals("dreks") && pass.equals("password")) {
			System.out.println("Valid ");
		} else {
			System.out.println("Invalid");
		}
	}
}

/*
 * //dreksh Enter Password : password Valid
 */
