package oop.Interfaces;

public class InterfaceConcept1 implements Inter1 {
	int a = 100;

	public void print() {
		System.out.println("Printing...");
	}

	public static void main(String[] args) {

		/*
		 * When we can achieve 100 % interface from Abstraction, why we need interface??
		 * Why abstraction have constructor and Interface dosen't ?
		 * 
		 * Interface does not have Constructors.
		 * 
		 * An interface in Java is a blueprint of a class.
		 * 
		 * The Java compiler adds public and abstract keywords before the interface
		 * method. Moreover, it adds public, static and final keywords before data
		 * members.
		 * 
		 * Data Members are by default public static and final hai.
		 * 
		 * Jo Method hai wo by default public and abstract hai.
		 * 
		 * It cannot be instantiated just like the abstract class.
		 * 
		 * In other words, Interface fields are public, static and final by default, and
		 * the methods are public and abstract.
		 * 
		 * Since Java 8, we can have default and static methods in an interface.
		 * 
		 * Since Java 9, we can have private methods in an interface.
		 * 
		 * If a class implements an interface and does not provide method bodies for all
		 * functions specified in the interface, then the class must be declared
		 * abstract.
		 * 
		 * Inheritance vs Abstraction: A Java interface can be implemented using the
		 * keyword “implements” and an abstract class can be extended using the keyword
		 * “extends”.
		 * 
		 * 
		 * 
		 * Multiple implementations: An interface can extend another Java interface
		 * only, an abstract class can extend another Java class and implement multiple
		 * Java interfaces.
		 * 
		 * An interface can extend other interfaces, just as a class
		 * subclass or extend another class. However, whereas a class can extend only
		 * one other class, an interface can extend any number of interfaces.
		 * 
		 * Q - Multiple inheritance is not supported through class in java, but it is
		 * possible by an interface, why?
		 * 
		 * As we have explained in the inheritance chapter, multiple inheritance is not
		 * supported in the case of class because of ambiguity. However, it is supported
		 * in case of an interface because there is no ambiguity. It is because its
		 * implementation is provided by the implementation class. For example:
		 */

		System.out.println(Inter1.a);
		// Error
		// Inter1.a = 10;

	}
}

interface Printable1 {
	void print();
}

interface Showable1 {
	void print();
}

class TestInterface1 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		TestInterface1 obj = new TestInterface1();
		obj.print();
	}
}
