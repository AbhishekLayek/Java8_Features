/*
 * LocalDate: It will represent a date without a timezone.
 */

package date_time_api;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today); // 2026-03-27
		
		LocalDate customDate = LocalDate.of(2026, 4, 1);
		System.out.println(customDate); // 2026-04-01
		
		int day = today.getDayOfMonth();
		System.out.println(day); // 27
		
		Month month = today.getMonth();
		System.out.println(month); // MARCH
		
		int year = today.getYear();
		System.out.println(year); // 2026
		
		LocalDate yeserday = today.minusDays(1);
		System.out.println(yeserday); // 2026-03-26
		
		LocalDate tommorow = today.plusDays(1);
		System.out.println(tommorow); // 2026-03-28
	}
}
