package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreationOfStream {
	public static void main(String[] args) {
		
		// Creation Of Stream From List
		List<String> list = Arrays.asList("Rakesh","Riya","Raj");
		Stream<String> listStream = list.stream();
		
		// Creation Of Stream From Array
		String [] arr = {"Rakesh","Riya","Raj"};
		Stream<String> arrayStream = Arrays.stream(arr);
		
		// Creation Of Stream With List Of Values
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		// Creation Of Stream With Range Of Values
		Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(10);
		
		// Creation Of Stream With Same Elements
		Stream<Integer> generate = Stream.generate(()-> 10).limit(5);
	}
}
