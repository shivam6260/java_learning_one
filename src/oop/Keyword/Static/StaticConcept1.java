package oop.Keyword.Static;

public class StaticConcept1 {
	public int x = 10;
	public static int y = 20;

	/*
	 * If you apply static keyword with any method, it is known as static method.
	 * 
	 * A static method belongs to the class rather than the object of a class.
	 * 
	 * A static method can be invoked without the need for creating an instance of a
	 * class.
	 * 
	 * A static method can access static data member and can change the value of it.
	 * 
	 * An Static method can directly call the other static method without creating
	 * object.
	 * 
	 * There are two main restrictions for the static method. They are:
	 * 
	 * The static method can not use non static data member or call non-static
	 * method directly.
	 * 
	 * this and super cannot be used in static context.
	 * 
	 * Summary - Static is class based concept. we cannot call direct instance
	 * variable and method from static method because we don't know these instance
	 * method and variables is of which object.
	 * 
	 * Why is the Java main method static? Ans) It is because the object is not
	 * required to call a static method. If it were a non-static method, JVM creates
	 * an object first then call main() method that will lead the problem of extra
	 * memory allocation.
	 * 
	 * Memory Allocation:
	 * 
	 * They are stored in the Permanent Generation space of heap as they are
	 * associated with the class in which they reside not to the objects of that
	 * class. But their local variables and the passed argument(s) to them are
	 * stored in the stack. Since they belong to the class, so they can be called to
	 * without creating the object of the class.
	 * 
	 * Over-riding and Over-loading
	 * 
	 * Static methods can not be overridden, since they are resolved using static
	 * binding by the compiler at compile time. However, we can have the same name
	 * methods declared static in both superclass and subclass, but it will be
	 * called Method Hiding as the derived class method will hide the base class
	 * method.
	 * 
	 * 
	 * Instance method vs Static method
	 * 
	 * Instance method can access the instance methods and instance variables
	 * directly. Instance method can access static variables and static methods
	 * directly.
	 * 
	 * Static methods can access the static variables and static methods directly.
	 * 
	 * Static methods can’t access instance methods and instance variables directly.
	 * They must use reference to object. And static method can’t use this keyword
	 * as there is no instance for ‘this’ to refer to.
	 */
	public static void main(String[] args) {
		System.out.println(y);
		staticTest1();
		// Error
		// System.out.println(x);
	}

	public static void staticTest1() {
		// Summary = Static method sai kewal Static variable and method ko hi direct
		// call kar sakte
		// Error
		// Test1();

	}

	public void Test1() {
		// Summary = Instance method sai Instance variable, method and Static variable ,
		// method ko
		// directly call kar sakte.
		Test2();
		staticTest1();
		System.out.println(this.x);
		System.out.println(this.y);
	}

	public void Test2() {
		this.Test1();
		Test1();
	}
}

/*
 * The following are some important points for method overriding and static
 * methods in Java.
 * 
 * 1) For class (or static) methods, the method according to the type of
 * reference is called, not according to the object being referred, which means
 * method call is decided at compile time.
 * 
 * 2) For instance (or non-static) methods, the method is called according to
 * the type of object being referred, not according to the type of reference,
 * which means method calls is decided at run time.
 * 
 * 3) An instance method cannot override a static method, and a static method
 * cannot hide an instance method. For example, the following program has two
 * compiler errors.
 */
class Base {
	public static void display() {
		System.out.println("Static or class method from Base");
	}
	
	public void display(int a) {
		
	}

	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
}

class Derived extends Base {
//	public void display() {
//		System.out.println("Non-static method from Derived");
//	}
//
//	public static void print() {
//		System.out.println("Static method from Derived");
//	}
}
