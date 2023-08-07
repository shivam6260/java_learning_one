package oop.Keyword.Super;

public class SuperKeyword {
	public static void main(String[] args) {
		/*
		 * The super keyword in Java is a reference variable which is used to refer
		 * immediate parent class object.
		 * 
		 * Whenever you create the instance of subclass, an instance of parent class is
		 * created implicitly which is referred by super reference variable.
		 * 
		 * which is referred by super reference variable.
		 * 
		 * Usage of Java super Keyword
		 * 
		 * super can be used to refer immediate parent class instance variable.
		 * 
		 * super can be used to invoke immediate parent class method.
		 * 
		 * super() can be used to invoke immediate parent class constructor.
		 */
	}
}

/*
 * super is used to refer immediate parent class instance variable and static
 * variable
 */

class Animal {
	String color = "white";
	static int x;
	final int y = 100;
	static final int z = 200;
	private int m = 200;
}

class Dog extends Animal {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(super.z);
		// Error
		// System.out.println(super.m);
	}
}

class TestSuper1 {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.printColor();
	}
}

/*
 * 2) super can be used to invoke parent class method This is used when we want
 * to call parent class method. So whenever a parent and child class have same
 * named methods then to resolve ambiguity we use super keyword.
 */

class Animal1 {
	void eat() {
		System.out.println("eating Animal1");
	}

	void msg() {
		System.out.println("Animal1 class msg");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("eating DOg1");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		msg();
		bark();
		eat();
	}
}

class TestSuper2 {
	public static void main(String args[]) {
		Dog1 d = new Dog1();
		d.work();

	}
}

/*
 * 3) super is used to invoke parent class constructor.
 * 
 * Other Important points:
 * 
 * Call to super() must be first statement in Derived(Student) Class
 * constructor.
 * 
 * If a constructor does not explicitly invoke a superclass constructor, the
 * Java compiler automatically inserts a call to the no-argument constructor of
 * the superclass. If the superclass does not have a no-argument constructor,
 * you will get a compile-time error. Object does have such a constructor, so if
 * Object is the only superclass, there is no problem.
 * 
 * Summary - 
 * if no constructor in both child and parent
 * then compiler automatically create no arg cons in child then add super(), then create no arg constructor in parent.
 * but if you create some parameterized constructor in parent and you did not call it from a child constructor
 * so compiler put a super() in child and it will not found in parent
 * so there will be a compile time error.
 * 
 * 
 * If a subclass constructor invokes a constructor of its superclass, either
 * explicitly or implicitly, you might think that a whole chain of constructors
 * called, all the way back to the constructor of Object. This, in fact, is the
 * case. It is called constructor chaining..
 * 
 */

class Parent {
	int x;
	int y;
	int z;

	public Parent() {
		System.out.println("Parent 0");
	}

	public Parent(int x) {
		this(4, 5);
		System.out.println("Parent 1");
		this.x = x;
	}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Parent(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Parent 3");
	}

}

class Child extends Parent {
	public Child() {
		System.out.println("Child 0");
	}

	public Child(int x, int y, int z) {
		super(x, y, z);
		System.out.println("child 3");
	}
}

class Test {
	public static void main(String[] args) {
		Child obj = new Child();

	}
}
