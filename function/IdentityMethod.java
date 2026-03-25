package function;

import java.util.function.Function;

public class IdentityMethod {
	public static void main(String[] args) {
		
		Function<String, String> identityFunction = Function.identity();
		
		System.out.println(identityFunction.apply("Abhishek")); // Abhishek
	}
}
