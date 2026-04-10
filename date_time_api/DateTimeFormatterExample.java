/*
 * DateTimeFormatter: Formats and parses date and time.
 */

package date_time_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
	public static void main(String[] args) {
		
		String date = "15/09/2001";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate parse = LocalDate.parse(date, formatter);
		
		System.out.println(parse); // 2001-09-15
	}
}
