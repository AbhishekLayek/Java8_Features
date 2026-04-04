/*
 * forEach(): forEach() method is used to iterate over each elements of stream.
 */

package stream_api;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream().forEach(n -> System.out.println(n));
	}
}

/*
 * Output:
 * 
 * 1
 * 2
 * 3
 * 4
 * 5
 */