package predicates;

import java.util.function.Predicate;

public class OrMethod {
	public static void main(String[] args) {
		
		Predicate<String> startsWithLetterA = x -> x.toLowerCase().charAt(0) == 'a';
		
		Predicate<String> endsWithLetterA = x -> x.toLowerCase().charAt(x.length() - 1) == 'k';
		
		Predicate<String> or = startsWithLetterA.or(endsWithLetterA);
		
		System.out.println(or.test("Akash")); // true
	}
}
