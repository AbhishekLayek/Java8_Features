/*
 * Functional Interface: The Interface which is having exactly single abstract method but can have any number of  default and static method is called as Functional Interface.
 * 
 * Note:
 * Whenever we want to create a Functional Interface we need to annotate with @FunctionalInterface annotation, which will restrict the interface to write more than one abstract method.
 */

package functional_interface;

@FunctionalInterface
public interface Functional_Interface {
	
	public void sayHello();
	
	default void sayBye() {
		
	}
	
	public static void sayOK() {
		
	}
}
