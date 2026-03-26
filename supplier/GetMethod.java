/*
 * Supplier: Supplier in Java is a functional interface which belongs to java.util.function package that represents a function that will not take any argument but return a value.
 */

package supplier;

import java.util.function.Supplier;

public class GetMethod {
	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () -> 100;
		
		System.out.println(supplier.get()); // 100
	}
}
