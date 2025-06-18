package oop.Constructor1;

public class ConstructorChaining2 {
	
	public static void main(String[] args) {
		/**
		 Constructor Chaining - Main aim is toh Initialise the Parent and Child class.
		 If not compiler will throw error.

		 If we had not created any constructor, compiler by default called no args constructor and initialize the
		 parent class

		 🧠 What is Constructor Chaining?
		 Constructor Chaining is the process of calling one constructor from another constructor within the same class
		 or from the parent class.

		 There are two types of constructor chaining:

		 Within the same class → using this(...)
		 From parent class (superclass) → using super(...)

		 🚨 Rules of Constructor Chaining
		 this(...) must be the first statement in the constructor.
		 super(...) must also be the first statement (so you can't use both in the same constructor).
		 If no constructor is explicitly called, Java automatically inserts a no-argument super() call.
		 Constructor chaining helps in reusing constructor logic and initializing fields consistently.



		 🔧 Constructor Chaining — Same Class (this())
		 🧪 Example 1: Basic Chaining in Same Class
		 */
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

/// 🧬 Constructor Chaining — Superclass (super())
/// 🧪 Example 2: Chaining Across Inheritance


class Parent {
	public Integer age;
	public String name;

	public Parent() {
		System.out.println("Default Constructor called - Parent");
	}

}

class Child extends Parent {
	public Integer roll;
	public String college;

	public Child() {
		System.out.println("Default Constructor called - Child");
	}

	public static void main(String[] args) {
		Child obj1 = new Child();
		System.out.println();

		Parent obj2 = new Child();
		System.out.println();

		Parent obj3 = new Parent();
	}
}

/// But if we had created any Parameterized Constructor in Parent, then we have to call that to initialize the
/// Parent Class . You have to call Parent class Constructor by any way
/// For Example -

class Parent1 {
	public Integer age;
	public String name;

	public Parent1(Integer age,String name) {
		System.out.println("Parameterized Constructor called - Parent");
	}

	public Parent1(Integer age) {
		this.age = age;
	}

}

class Child1 extends Parent1 {
	public Integer roll;
	public String college;

	public Child1() {
		super(10,"Bob");
		System.out.println("Default Constructor called - Child");
	}

	public Child1(Integer roll,String college) {
		this();
	}

	public static void main(String[] args) {

	}
}

/**
 🛑 Common Mistakes to Avoid
 Calling this() or super() not as the first statement → Compiler error.

 Trying to call both this() and super() → Not allowed in a single constructor.

 Creating infinite constructor chains (e.g., A calls B, B calls A) → StackOverflowError.
 */