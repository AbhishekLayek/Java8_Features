package optional;

import java.util.Optional;

public class OrElseMethod {
	private static Optional<String> getName(int id){
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		Optional<String> name = getName(2);
		
		String nameToBeUsed = name.orElse("NA");
		System.out.println(nameToBeUsed); // NA
	}
}
