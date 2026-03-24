package function;

import java.util.function.Function;

public class AndThenMethod {
	public static void main(String[] args) {
		
		Function<String, String> toUppercase = s -> s.toUpperCase();
		
		Function<String, String> substring = s -> s.substring(0, 3);
		
		System.out.println(toUppercase.andThen(substring).apply("India")); // IND
	}
}
