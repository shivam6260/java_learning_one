package oop.Interfaces;

interface In1 {
	final int a = 10;

	public static void display() {
		System.out.println("hello");
	}
}

class TestClass implements In1 {
	public static void main(String[] args) {
		/*
		 * We can’t use the following modifiers for interface methods.
		 * 
		 * Private protected final static synchronized native strictfp
		 */
		In1.display();

		In1 obj1 = new TestClass();
		
		// Static Methods of Interface are not Inherited
		// We cannot call static method with the help of
		// Interface reference
		// Error
		// obj1.display();

		TestClass obj = new TestClass();
		// Error
		// obj.display();
	}
}

public class InterfaceConcept2 {
	public static void main(String[] args) {
		/*
		 * New Features Added in Interfaces in JDK 8 1. Prior to JDK 8, the interface
		 * could not define the implementation. We can now add default Method for
		 * interface methods. This default Method has a special use and does not affect
		 * the intention behind interfaces.
		 * 
		 * Suppose we need to add a new function in an existing interface. Obviously,
		 * the old code will not work as the classes have not implemented those new
		 * functions. So with the help of default implementation, we will give a default
		 * body for the newly added functions. Then the old codes will still work.
		 * 
		 * In case a new abstract method is added to the interface, all classes
		 * implementing the interface will break and will have to implement the new
		 * method. With default methods, there will not be any impact on the interface
		 * implementing classes. default methods can be overridden if needed in the
		 * implementation. Also, it does not qualify as synchronized or final.
		 * 
		 * Another feature that was added in JDK 8 is that we can now define static
		 * methods in interfaces that can be called independently without an object.
		 * Note: these methods are not inherited.
		 * 
		 * Abstract class VS Interface
		 * 
		 * 1) Abstract class can have abstract and non-abstract methods. Interface can
		 * have only abstract methods. Since Java 8, it can have default and static
		 * methods also.
		 * 
		 * 2) Abstract class doesn't support multiple inheritance. Interface supports
		 * multiple inheritance.
		 * 
		 * 3) Abstract class can have final, non-final, static and non-static variables.
		 * Interface has only static and final variables.
		 * 
		 * 4) Abstract class can provide the implementation of interface. Interface
		 * can't provide the implementation of abstract class.
		 * 
		 * 5) The abstract keyword is used to declare abstract class. The interface
		 * keyword is used to declare interface.
		 * 
		 * 6) An abstract class can extend another Java class and implement multiple
		 * Java interfaces. An interface can extend multiple Java interface only.
		 * 
		 * 7) An abstract class can be extended using keyword "extends". An interface
		 * can be implemented using keyword "implements".
		 * 
		 * 
		 * 
		 * Summary = Class - Extend only one class but Implements Multiple Interfaces
		 * Interfaces - Extend many other Interfaces, It does not implement other
		 * Interfaces
		 * 
		 * Example -
		 */
	}

}

interface Printable {
	void print();
}

interface Showable {
	void print(int a);
}

class TestInterface3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void print(int a) {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		TestInterface3 obj = new TestInterface3();
		obj.print();
	}
}