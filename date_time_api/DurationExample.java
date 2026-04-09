/*
 * Duration: Represents a duration of time between two points of time.
 */

package date_time_api;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
	public static void main(String[] args) throws InterruptedException {
		
		LocalDateTime then = LocalDateTime.now();
		
		for(int i = 0; i < 100000; i++) {
			
		}
		
		LocalDateTime now = LocalDateTime.now();
		
		Duration duration = Duration.between(now, then);
		System.out.println(duration); // PT-0.0010174S
	}
}
