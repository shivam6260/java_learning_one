package oop.Keyword.This;

public class ThisKeyword {
	public static void main(String[] args) {
		/*
		 * The this keyword can be used to refer current class instance variable.
		 * 
		 */

		/*
		1) this: To Refer Current Class Instance Variable
		2) this: To Invoke Current Class Method
		3) this(): To Invoke the Current Class Constructor
		 */
	}

}

/*
 * this: to invoke current class method
 * 
 * You may invoke the method of the current class by using the this keyword. If
 * you don't use the this keyword, compiler automatically adds this keyword
 * while invoking the method. Let's see the example
 */
class A {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
	}

	public static void print() {
		// Error
		// m();
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.n();
	}
}

/*
 * this() : to invoke current class constructor The this() constructor call can
 * be used to invoke the current class constructor. It is used to reuse the
 * constructor. In other words, it is used for constructor chaining.
 */

class A1 {
	A1() {
		this(5);
		System.out.println("hello a");
	}

	A1(int x) {
		// this();
		System.out.println(x);
	}
}

class TestThis5 {
	public static void main(String args[]) {
		A1 a = new A1();
	}
}

/*
 * Using �this� keyword to return the current class instance
 */
class Test {
	int a;
	int b;

	Test() {
		a = 10;
		b = 20;
	}

	// Method that returns current class instance
	Test get() {
		return this;
	}

	void display() {
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args) {
		Test object = new Test();
		object.get().display();
	}
}

/*
 * Can we assign the reference to this variable?
 * 
 * No, this cannot be assigned to any value because it always points to the
 * current class object and this is the final reference in Java. However, if we
 * try to do so, the compiler error will be shown. Consider the following
 * example.
 */

/*
 * What are the advantages of passing this into a method instead of the current
 * class object itself?
 * 
 * As we know, that this refers to the current class object, therefore, it must
 * be similar to the current class object. However, there can be two main
 * advantages of passing this into a method instead of the current class object.
 * 
 * this is a final variable. Therefore, this cannot be assigned to any new value
 * whereas the current class object might not be final and can be changed. this
 * can be used in the synchronized block.
 */
