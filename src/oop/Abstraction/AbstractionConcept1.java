package oop.Abstraction;

abstract class Parent {
	/*
	 * A class which is declared as abstract is known as an abstract class. It can
	 * have abstract and non-abstract methods. It needs to be extended and its
	 * method implemented. It cannot be instantiated.
	 * 
	 * Points to Remember An abstract class must be declared with an abstract
	 * keyword. It can have abstract and non-abstract methods. It cannot be
	 * instantiated. It can have constructors and static methods also. It can have
	 * final methods which will force the subclass not to change the body of the
	 * method.
	 * 
	 * An abstract class can have a data member, abstract method, method body
	 * (non-abstract method), constructor, and even main() method.
	 * 
	 * If there is an abstract method in a class, that class must be abstract.
	 * 
	 * If you are extending an abstract class that has an abstract method, you must
	 * either provide the implementation of the method or make this class abstract.
	 * 
	 * 
	 * The following are various illegal combinations of other modifiers for methods
	 * with respect to abstract modifier : 
	 * 
	 * 
	 * abstract final
	 * 
	 * abstract native
	 * 
	 * abstract synchronized
	 * 
	 * abstract static
	 * 
	 * abstract private
	 * 
	 * abstract strictfp
	 * 
	 * 
	 * In java, you will never see a class or method declared with both final and
	 * abstract keywords. For classes, final is used to prevent inheritance whereas
	 * abstract classes depends upon their child classes for complete
	 * implementation. In cases of methods, final is used to prevent overriding
	 * whereas abstract methods needs to be overridden in sub-classes.
	 * 
	 * Some General Concept
	 * Link = https://www.geeksforgeeks.org/abstract-classes-in-java/
	 */
	int x = 1;

	public Parent() {
		System.out.println("Parent constructor");
	}

	abstract void print();

	public static void run() {
		System.out.println("Parent class, run method");
	}

	public void eat() {
		System.out.println("Parent class, eat method");
	}
}

class Child extends Parent {
	int x = 10;
	int y = 11;

	public Child() {
		System.out.println("Child constructor");
	}

	void print() {
		System.out.println("Child class, print method " + x * y);
	}

	public void eat() {
		System.out.println("Child class, eat method");
	}

	public static void run() {
		System.out.println("Child class, run method");
		
	}
}

public class AbstractionConcept1 {
	public static void main(String[] args) {
		Parent obj = new Child();
		System.out.println(obj.x);
		obj.print();
		obj.eat();
		obj.run();
	}

}
