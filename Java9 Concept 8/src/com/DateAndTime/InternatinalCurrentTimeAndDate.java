package com.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InternatinalCurrentTimeAndDate {

	public static void main(String[] args) {
		
		//in Which Zone i m in
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);

		//India me kitna time chal rha hai abhi
		ZoneId zoneId1 = ZoneId.of("Asia/Calcutta");
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zoneId1);
		System.out.println(zonedDateTime1.getHour()+" "+zonedDateTime1.getMinute());
		System.out.println(zonedDateTime1.getDayOfMonth()+" "+zonedDateTime1.getYear());

		
		//America me kitna time chal rha abhi
		
		ZoneId zoneId2 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zoneId2);
		System.out.println(zonedDateTime2.getHour()+" "+zonedDateTime2.getMinute());
		System.out.println(zonedDateTime2.getDayOfMonth()+" "+zonedDateTime2.getYear());
	}
}
