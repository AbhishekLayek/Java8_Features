/*
 * Constructor Reference: Constructor Reference allows us to refer to a class's constructor without invoking it.
 */

package constructor_reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReference {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		
		List<Student> students1 = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
		
		List<Student> students2 = names.stream().map(Student :: new).collect(Collectors.toList()); // Constructor Reference
		
		students2.forEach(s -> System.out.println(s.getName()));
	}
}

/*
 * Output:
 * 
 * Alice
 * Bob
 * Charlie
*/