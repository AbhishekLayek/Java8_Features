/*
 * ZonedDateTime: It will represent a date and time with a timezone.
 */

package date_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
	public static void main(String[] args) {
		
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now); // 2026-03-27T22:07:09.099453800+05:30[Asia/Calcutta]
		
		ZoneId zone = now.getZone();
		System.out.println(zone); // Asia/Calcutta
		
		ZonedDateTime custom = ZonedDateTime.of(2026, 04, 10, 20, 30, 40, 400, ZoneId.of("America/Los_Angeles"));
		System.out.println(custom); // 2026-04-10T20:30:40.000000400-07:00[America/Los_Angeles]
	}
}
