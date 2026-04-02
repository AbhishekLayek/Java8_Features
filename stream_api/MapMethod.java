/*
 * map(): The map() method will take a Function as argument that will perform operation on each elements and provide the sequence of resultant elements.
 * 
 * Syntax: <R> Stream<R> map(Function<? super T, ? extends R) mapper){}
 */

package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,6,8,10);
		
		List<Integer> mappedList = list.stream().map(x -> x * 2).collect(Collectors.toList());
		
		System.out.println(mappedList); // [4, 8, 12, 16, 20]
	}
}
