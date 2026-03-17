/*
 * Default Method: A default method is a method with body inside an interface.
 * 
 * Usage: To add new methods inside interface without breaking old classes which are already implementing it.
 * 
 * Key Points:
 * 
 * 1. Uses a keyword called default.
 * 2. Has a method body.
 * 3. Can be overridden inside implementation class.
 * 4. Can be invoked by using implementation class object.
 */

package default_method_in_interface;

public interface Animal {
	default void sound() {
		System.out.println("Animal Makes Sound!");
	}
}
