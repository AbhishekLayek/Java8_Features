package method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceForNonStaticMethods {
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		MethodReferenceForNonStaticMethods obj = new MethodReferenceForNonStaticMethods();
		
		List<String> students = Arrays.asList("Alice", "Bob", "Charlie");
		
		students.forEach(obj :: print); // Method Reference
	}
}

/*
 * Output:
 * 
 * Alice
 * Bob
 * Charlie
 */