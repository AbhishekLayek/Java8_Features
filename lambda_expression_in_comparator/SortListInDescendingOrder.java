package lambda_expression_in_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListInDescendingOrder {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,10,8,6);
		
		System.out.println("Before Sort: " + list); // Before Sort: [2, 1, 10, 8, 6]
		
		Collections.sort(list, (a,b) -> b-a); // Here we are passing a comparator using lambda expression
		
		System.out.println("After Sort: " +list); // After Sort: [10, 8, 6, 2, 1]
	}
}
