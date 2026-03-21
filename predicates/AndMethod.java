package predicates;

import java.util.function.Predicate;

public class AndMethod {
	public static void main(String[] args) {
		
		Predicate<String> startsWithLetterA = x -> x.toLowerCase().charAt(0) == 'a';
		
		Predicate<String> endsWithLetterA = x -> x.toLowerCase().charAt(x.length() - 1) == 'k';
		
		Predicate<String> and = startsWithLetterA.and(endsWithLetterA);
		
		System.out.println(and.test("Abhishek")); // true
		System.out.println(and.test("Akash")); // false
	}
}
