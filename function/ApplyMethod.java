/*
 * Function: Function in Java is a functional interface which belongs to java.util.function package that represents a function which will take on argument as input and provide a result. 
 */

package function;

import java.util.function.Function;

public class ApplyMethod {
	public static void main(String[] args) {
		
		Function<String, Integer> length = s -> s.length();
		
		System.out.println(length.apply("Abhishek")); // 8
	}
}
