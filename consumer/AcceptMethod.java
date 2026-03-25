/*
 * Consumer: Consumer in Java is a functional interface which belongs to java.util.function package that represents a function that will take one argument as input but not return any value.
 */

package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AcceptMethod {
	public static void main(String[] args) {
		
		Consumer<String> stringConsumer = s -> System.out.println(s);
		
		Consumer<List<Integer>> listConsumer = li -> {
			for(Integer i: li) {
				System.out.println(i);
			}
		};
		
		stringConsumer.accept("Abhishek");
		listConsumer.accept(Arrays.asList(1,2,3,4,5));
	}
}

/*
 * Output:
 * 
 * Abhishek
 * 1
 * 2
 * 3
 * 4
 * 5
 */