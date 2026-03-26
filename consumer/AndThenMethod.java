package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AndThenMethod {
	public static void main(String[] args) {
		
		Consumer<List<Integer>> listConsumer1 = li -> {
			for(Integer i: li) {
				System.out.println(i);
			}
		};
		
		Consumer<List<Integer>> listConsumer2 = li -> {
			for(Integer i: li) {
				System.out.println(i + 100);
			}
		};
		
		listConsumer1.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4,5));
	}
}

/* 
 * Output:
 * 
 * 1
 * 2
 * 3
 * 4
 * 5
 * 101
 * 102
 * 103
 * 104
 * 105
 */