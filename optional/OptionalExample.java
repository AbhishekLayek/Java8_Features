/*
 * Optional Class: Optional class in Java belongs to java.util package and it is used to handle the problem of null values more gracefully.
 */

package optional;

import java.util.Optional;

public class OptionalExample {
	private static Optional<String> getName(int id){
		String name = "Ram";
		return Optional.of(name);
	}
	
	public static void main(String[] args) {
		Optional<String> name = getName(2);
		if(name.isPresent()) {
			System.out.println(name.get()); // Ram
		}
	}
}
