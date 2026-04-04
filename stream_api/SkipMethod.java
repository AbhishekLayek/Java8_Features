/*
 * skip(): skip() method will skip the specified number of elements of stream from the first.
 */

package stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipMethod {
	public static void main(String[] args) {
		
		List<Integer> skipList = Stream.iterate(0, n -> n+1).limit(10).skip(1).collect(Collectors.toList()); // It will skip 0
		
		System.out.println(skipList); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
	}
}
