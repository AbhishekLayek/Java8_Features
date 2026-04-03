/*
 * sorted(): sorted() method is used to sort elements of the stream.
 * 
 * Syntax:
 *       
 *       Stream<T> sorted(){}
 *       
 *       Stream<T> sorted(Comparator<? super T> comparator){}
 */

package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,2,6,5,4);
		
		List<Integer> ascedingList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascedingList); // [1, 2, 3, 4, 5, 6]
		
		List<Integer> descedingList = list.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
		System.out.println(descedingList); // [6, 5, 4, 3, 2, 1]
	}
}
