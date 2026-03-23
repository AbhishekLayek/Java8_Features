package predicates;

import java.util.function.Predicate;

public class IsEqualMethod {
	public static void main(String[] args) {
		
		Predicate<String> predicate = Predicate.isEqual("Abhishek");
		
		System.out.println(predicate.test("Abhishek")); // true
		System.out.println(predicate.test("Akash")); // false
	}
}
