/*
 * distinct(): distinct() method is used to remove duplicate elements from the stream.
 * 
 * Syntax: Stream<T> distinct(){}
 */

package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,4,4,6,6);
		
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctList); // [1, 2, 3, 4, 5, 6]
	}
}
