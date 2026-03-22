package predicates;

import java.util.function.Predicate;

public class NegateMethod {
	public static void main(String[] args) {
		
		Predicate<String> startsWithLetterA = x -> x.toLowerCase().charAt(0) == 'a';
		
		System.out.println(startsWithLetterA.negate().test("Abhisek")); // false
	}
}
