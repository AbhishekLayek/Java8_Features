/*
 * Predicate: Predicate in Java is a functional interface which belongs to java.util.function package that represents boolean-valued functions. 
 */

package predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckEvenUsingPredicate {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		for(Integer i: numbers) {
			if(isEven.test(i)) {
				System.out.println(i + " Is Even");
			}
		}
	}
}

/*
 * Output:
 * 
 * 2 Is Even
 * 4 Is Even
 */