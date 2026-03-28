/*
 * UnaryOperator: UnaryOperator in Java is a functional interface which belongs to java.util.function package that represents a function which will take one argument and return the result of the same type.
 */

package unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> unary = x -> x * x;
		
		System.out.println(unary.apply(5)); // 25
	}
}
