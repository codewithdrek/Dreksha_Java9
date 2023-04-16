package com.DateAndTime;

import java.time.LocalDateTime;
import java.time.Month;

public class ofInDateTimeBeforeAndAfter {

	public static void main(String[] args) {
	
		//can print our own Date and Time
		LocalDateTime localDateTime = LocalDateTime.of(1990, Month.JULY, 01, 12, 01);
		System.out.println(localDateTime);
		
		System.out.println(localDateTime.plusDays(1));
		System.out.println(localDateTime.minusDays(1));
		
		
		//special time in joda time API
	}
}