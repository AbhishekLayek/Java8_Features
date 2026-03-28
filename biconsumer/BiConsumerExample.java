/*
 * BiConsumer: BiCosumer in Java is a functional interface which belongs to java.util.function interface that represents a function that will take two arguments as input but not return anything.
 */

package biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		
		BiConsumer<String, String> biConsumer = (x,y) -> System.out.println(x.length() + y.length());
		
		biConsumer.accept("Hello", "World"); // 10
	}
}
