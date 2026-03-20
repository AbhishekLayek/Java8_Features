package lambda_expression_in_comparator;

import java.util.Map;
import java.util.TreeMap;

public class SortMapInDescendingOrder {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(10, "Ajay");
		map.put(1, "Akash");
		map.put(5, "Rahul");
		
		System.out.println("Before Manual Sorting: " + map); // Before Manual Sorting: {1=Akash, 5=Rahul, 10=Ajay}
		
		Map<Integer, String> descendingMap = new TreeMap<>((a,b) -> b-a);
		
		descendingMap.put(10, "Ajay");
		descendingMap.put(1, "Akash");
		descendingMap.put(5, "Rahul");
		
		System.out.println("After Manual Sorting: " + descendingMap); // After Manual Sorting: {10=Ajay, 5=Rahul, 1=Akash}
	}
}
