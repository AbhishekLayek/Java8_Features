/*
 * Static Method: Static method inside an interface belongs to the interface itself rather than the object of implementation class.
 * 
 * Usage: To keep Utility/Helper methods which are belong to same interface in a single place.
 * 
 * Key Points:
 * 
 * 1. Uses the keyword static.
 * 2. Has a method body.
 * 3. Cannot be overridden because the static method of interface will not be visible inside implementation class.
 * 4. Can be invoked by using Interface name, not using the object of implementation class.
 */

package static_method_in_interface;

public interface MathUtils {
	public static void add(int a, int b) {
		System.out.printf("%d + %d = %d", a,b,(a+b));
	}
}
