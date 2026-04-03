/*
 * limit(): limit() method is used to provide specified numbers of elements of stream from the first.
 */

package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> limitList = list.stream().limit(5).collect(Collectors.toList());
		
		System.out.println(limitList); // [1, 2, 3, 4, 5]
	}
}
