package com.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTimeD {

	
	public static void main(String[] args) {
//DATE
		LocalDate localDate =LocalDate.now();
		System.out.println(localDate);
	
		//TIME
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		int day=dt.getHour();
		int mon=dt.getMonthValue();
		int year=dt.getYear();
		
		System.out.printf("%d-%d-%d",day,mon,year);
		
		
		int hr = dt.getHour();
		int min=dt.getMinute();
		int minSec=dt.getNano();
		
		System.out.printf("%d:%d:%d",hr,min,minSec);
		
		
	}
}

//Note 
//LocalDate.now() is factory method present inside LocalDate
//LocalTime.now() is factory method present inside LocalTime
//Till NOw we have default format