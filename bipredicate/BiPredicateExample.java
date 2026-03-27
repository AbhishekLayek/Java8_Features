/*
 * BiPredicate: BiPredicate in Java is a functional interface which belongs to java.util.function interface that represents a boolean valued function that will take two arguments.
 */

package bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> biPredicate = (x,y) -> x % 2 == 0 && y % 2 == 0;
		
		System.out.println(biPredicate.test(2, 4));// true
	}
}
