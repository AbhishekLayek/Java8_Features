/*
 * Method Reference: Method Reference allows us to refer a method without invoking it, making the code cleaner and more readable. It can be used in place of lambda expression. 
 */

package method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceForStaticMethods {
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		List<String> students = Arrays.asList("Alice", "Bob", "Charlie");
		
		students.forEach(MethodReferenceForStaticMethods :: print); // Method Reference
	}
}

/*
 * Output:
 * 
 * Alice
 * Bob
 * Charlie
 */