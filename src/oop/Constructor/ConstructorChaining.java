package oop.Constructor;

// Constructor Chaining in Two different Class using Inheritance
/*
 * Constructor chaining occurs through inheritance. A sub class constructor’s task is to call super class’s constructor first. 
 * This ensures that creation of sub class’s object starts with the initialization of the data members of the super class. 
 * There could be any numbers of classes in inheritance chain. Every constructor calls up the chain till class at the top is reached.
 */

// Humlog child class ka object banate waqt kuch nahi batai to wo parent ka default or no-arg constructor ko call karega
// or agar batai to wo usi constructor ko call karega
class Base {
	/*
	 * Constructor chaining is the process of calling one constructor from another
	 * constructor with respect to current object. Constructor chaining can be done
	 * in two ways:
	 * 
	 * Within same class: It can be done using this() keyword for constructors in
	 * same class
	 * 
	 * From base class: by using super() keyword to call constructor from the base
	 * class.
	 */
	String name;

	Base() {
		this("");
		System.out.println("No-argument constructor of" + " base class");
	}

	Base(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor" + " of base");
	}
}

class Derived extends Base {

	Derived() {
		// this("");
		//super();
		System.out.println("No-argument constructor " + "of derived");
	}

	Derived(String name) {
		super(name);
		System.out.println("Calling parameterized " + "constructor of derived");
	}

	public static void main(String args[]) {
		// calls parameterized constructor 4
		Derived obj = new Derived("test");

		// Calls No-argument constructor
		// Derived obj = new Derived();
		// Base obj = new Derived("hello");
	}
}

// Constructor Chaining in same class
class Temp {
	/*
	 * Rules of constructor chaining :
	 * 
	 * The this() expression should always be the first line of the constructor.
	 * 
	 * There should be at-least be one constructor without the this() keyword
	 * (constructor 3 in above example).
	 * 
	 * Constructor chaining can be achieved in any order.
	 */

	Temp() {
		this(5);
		System.out.println("The Default constructor");
	}

	Temp(int x) {
		this(5, 15);
		System.out.println(x);
	}

	Temp(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		new Temp();
	}
}

public class ConstructorChaining {
	
	public static void main(String[] args) {
		
	}

}
