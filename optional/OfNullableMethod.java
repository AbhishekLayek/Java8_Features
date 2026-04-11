package optional;

import java.util.Optional;

public class OfNullableMethod {
	private static Optional<String> getName(int id){
		String name = null;
		return Optional.ofNullable(name); // It will handle null values
	}
	
	public static void main(String[] args) {
		Optional<String> name = getName(2);
		
		name.ifPresent(System.out::println);
	}
}
