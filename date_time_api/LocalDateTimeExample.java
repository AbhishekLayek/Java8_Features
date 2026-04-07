/*
 * LocalDateTime: It will represent a date and time without timezone.
 */

package date_time_api;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current); // 2026-03-27T22:02:07.922980700
		
		LocalDateTime custom = LocalDateTime.of(2026, 04, 15, 10, 15);
		System.out.println(custom); // 2026-04-15T10:15
		
		System.out.println(current.getDayOfMonth()); // 27
		System.out.println(current.getMonth()); // MARCH
		System.out.println(current.getYear()); // 2026
		System.out.println(current.getHour()); // 22
		System.out.println(current.getMinute()); // 02
	}
}
