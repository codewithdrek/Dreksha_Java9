package com.DateAndTime;

import java.time.LocalTime;

public class CustomTimeFormat {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		int hour = localTime.getHour();
		int min = localTime.getMinute();
		int nanoSec= localTime.getNano();
		
		System.out.println(hour+"  "+min+"  "+nanoSec);
		
		System.out.printf("%d:%d:%d",hour,min,nanoSec);
	}
	}
