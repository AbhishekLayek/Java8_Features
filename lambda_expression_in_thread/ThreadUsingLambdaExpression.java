package lambda_expression_in_thread;

public class ThreadUsingLambdaExpression {
	public static void main(String[] args) {
		Runnable runnable = ()->{
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(runnable);
		t.start();
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
 */
 