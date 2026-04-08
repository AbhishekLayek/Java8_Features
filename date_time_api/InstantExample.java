/*
 * Instant: Represents an instantaneous point on the timeline with respective to UTC.
 */

package date_time_api;

import java.time.Instant;

public class InstantExample {
	public static void main(String[] args) {
		
		Instant now = Instant.now();
		
		System.out.println(now); // 2026-03-28T06:36:24.246507100Z (Here Z represents UTC)
	}
}
