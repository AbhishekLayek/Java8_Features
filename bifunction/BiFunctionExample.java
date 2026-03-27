/*
 * BiFunction: BiFunction in Java is a functional interface which belongs to java.util.function interface that represents a function that will take two arguments as input and provide a result.
 */

package bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> biFunction = (x,y) -> x.length() + y.length();
		
		System.out.println(biFunction.apply("Hello", "Hi")); // 7
	}
}
