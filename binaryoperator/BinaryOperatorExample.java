/*
 * BinaryOperator: BinaryOperator in Java is a functional interface which belongs to java.util.function package that represents a function which will take two argument of same type and return the result of the same type.
 */

package binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		
		BinaryOperator<String> binary = (x,y) -> x+y;
		
		System.out.println(binary.apply("Hello", " World!")); // Hello World!
	}
}
