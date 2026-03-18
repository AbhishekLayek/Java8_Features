/*
 * Lambda Expression: Lambda Expression is an anonymous function.
 * 
 * Means,
 * 1. It don't have any name.
 * 2. It don't have any return name;
 * 3. It don't have any access specifier.
 * 
 * #How to covert a Normal Function to a Lambda Expression
 * 1. Remove the access specifier.
 * 2. Remove the return type.
 * 3. Remove the method name.
 * 4. Place an arrow in between () and {}.
 * 
 * Example:
 * 
 * Normal Function:  public void sayHello(){
 * 						System.out.println("Hello");
 * 					 }
 * 
 * Lambda Expression: () -> {System.out.println("Hello");}
 * 
 * #Rules:
 * 1. If the method body consist of only one statement then we can remove the curly braces.
 * Example: () -> System.out.println("Hello");
 * 
 * 2. Use type inference, let the compiler to guess the situation and assign the datatype.
 * Example: (a,b) -> System.out.println(a+b);
 * 
 * 3. We can remove return keyword.
 * Example: (str) -> str.length();
 * 
 * 4. If there is only one parameter then we can remove the parenthesis.
 * Example: str -> str.length();
 */

package lambda_expression_in_functional_interface;

public class Main {
	public static void main(String[] args) {
		Employee employee = () -> "Software Engineer"; // Here lambda expression will act as the implementation for the abstract method. 
		System.out.println(employee.getName());
	}
}

/*
 * Output: Software Engineer
 */