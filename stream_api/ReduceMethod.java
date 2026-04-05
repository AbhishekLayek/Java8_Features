/*
 * reduce(): reduce() method is used to reduce elements of stream into a single element.
 */

package stream_api;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int sum = list.stream().reduce(0, (a,b) -> a+b);
		
		System.out.println(sum); // 15
	}
}
