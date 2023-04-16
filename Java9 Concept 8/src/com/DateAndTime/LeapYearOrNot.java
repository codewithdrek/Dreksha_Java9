package com.DateAndTime;

import java.time.Year;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:- ");
		int i =scanner.nextInt();
		Year yr = Year.of(i);
		if (yr.isLeap()) {
			System.out.printf("%d year is Leap year",i);
		}
		else {
			System.out.printf("%d year not a Leap year",i);
		}
	}
}
