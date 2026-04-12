package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OrElseThrowMethod {
	private static Optional<String> getName(int id){
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		Optional<String> name = getName(2);
		
		String nameToBeUsed = name.orElseThrow(NoSuchElementException::new);
		System.out.println(nameToBeUsed);
	}
}

/*
 * Output:
 * 
 * Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.Optional.orElseThrow(Optional.java:403)
	at Java8/optional.OrElseThrowMethod.main(OrElseThrowMethod.java:14)
 */