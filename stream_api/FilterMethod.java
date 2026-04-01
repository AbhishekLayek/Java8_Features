/*
 * filter(): The filter() method is used to select elements based upon the Predicate passed as an argument.
 * 
 * Syntax:  Stream<T> filter(Predicate<? super T> predicate){}
 */

package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		
		System.out.println(filteredList); // [2, 4, 6, 8, 10]
	}
}
