package com.DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDateAndTimeBetween2Dates {

	public static void main(String[] args) {
		LocalDate birDate= LocalDate.of(1990,07,01);
		LocalDate today =LocalDate.now();
		//difference between today and birth day
		Period period= Period.between(birDate, today);
	//	System.out.printf("your age is %d year %d month %Day",
		//		period.getYears(),period.getMonths(),period.getDays());
		
		System.out.println(period.getYears());
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		//Death date also can find out from birth day
	
	
	}
}
