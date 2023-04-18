package com.DateAndTime;

import java.time.LocalDate;


public class CustomDateFormat {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		int day = localDate.getDayOfMonth();
		int month = localDate.getMonthValue();
		int year= localDate.getYear();
		
		System.out.println(day+"  "+month+"  "+year);
		
		System.out.printf("%d-%d-%d",day,month,year);
	}
}
