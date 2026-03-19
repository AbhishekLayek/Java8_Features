package lambda_expression_in_comparator;

import java.util.Set;
import java.util.TreeSet;

public class SortSetInDescendingOrder {
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(6);
		set.add(8);
		set.add(2);
		
		System.out.println("Before Manual Sorting: " + set); // Before Manual Sorting: [2, 6, 8, 10]
		
		Set<Integer> descendingSet = new TreeSet<>((a,b) -> b-a);
		descendingSet.add(10);
		descendingSet.add(6);
		descendingSet.add(8);
		descendingSet.add(2);
		
		System.out.println("After Manual Sorting: " + descendingSet); // After Manual Sorting: [10, 8, 6, 2]
	}
}
