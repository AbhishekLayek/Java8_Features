/*
 * LocalTime: It will represent a time without a date and a timezone.
 */

package date_time_api;

import java.time.LocalTime;

public class LocalTimeExample {
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		System.out.println(now); // 21:57:37.587895600
		
		LocalTime customTime = LocalTime.of(21, 56, 45);
		System.out.println(customTime); // 21:56:45
		
		int hour = now.getHour();
		System.out.println(hour); // 21
		
		int minute = now.getMinute();
		System.out.println(minute); // 57
		
		int second = now.getSecond();
		System.out.println(second); // 37
		
		int nanosecond = now.getNano();
		System.out.println(nanosecond); // 587895600
		
		LocalTime beforeOneHour = now.minusHours(1); 
		System.out.println(beforeOneHour); // // 20:59:51.423743800
		
		LocalTime afterOneHour = now.plusHours(1);
		System.out.println(afterOneHour); // 22:59:51.423743800
	}
}
