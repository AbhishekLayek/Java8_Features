/*
 * Period: Represents a period of time between two dates.
 */

package date_time_api;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
	public static void main(String[] args) {
		
		LocalDate current = LocalDate.now();
		
		LocalDate previous = LocalDate.of(2021, 3, 1);
		
		Period period = Period.between(current, previous);
		
		System.out.println(period); // P-5Y-27D
	}
}
