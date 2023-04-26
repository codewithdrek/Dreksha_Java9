package com.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

 public class AuthTest {
	public static void main(String[] args) {
		// vv important line
		Predicate<AuthUsingPredicate> p = u -> u.userName.equals("Dreksha") && u.pass.equals("Java");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter userName: ");

		String un = scanner.next();

		System.out.println("Enter password:  ");
		String pass = scanner.next();

		AuthUsingPredicate u = new AuthUsingPredicate(un, pass);

		if (p.test(u)) {

			System.out.println("AUTH USER");
		}

		else {
			System.out.println("Invalid user");
		}
	}
}
