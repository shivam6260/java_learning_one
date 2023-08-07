package oop.Polymorphism;

public class MethodOverriding {
	public static void main(String[] args) {
		/*
		 * If subclass (child class) has the same method as declared in the parent
		 * class, it is known as method overriding in Java. 
		 * 
		 * It is Run-time concept
		 * 
		 * Rules for Java Method Overriding The method must have the same name as in the
		 * parent class
		 * 
		 * The method must have the same parameter as in the parent class.
		 * 
		 * There must be an IS-A relationship (inheritance).
		 * 
		 * Why can we not override static method? It is because the static method is
		 * bound with class whereas instance method is bound with an object. Static
		 * belongs to the class area, and an instance belongs to the heap area.
		 * 
		 * Can we override java main method? No, because the main is a static method.
		 * 
		 * 
		 * Private methods can not be overridden : Private methods cannot be overridden
		 * as they are bonded during compile time. Therefore we can’t even override
		 * private methods in a subclass.
		 * 
		 * Overriding and constructor : We can not override constructor as parent and
		 * child class can never have constructor with same name(Constructor name must
		 * always be same as Class name).
		 * 
		 * Overriding and synchronized/strictfp method : The presence of
		 * synchronized/strictfp modifier with method have no effect on the rules of
		 * overriding, i.e. it’s possible that a synchronized/strictfp method can
		 * override a non synchronized/strictfp one and vice-versa.
		 * 
		 * Static binding is done during compile-time while dynamic binding is done
		 * during run-time. 
		 * 
		 * private, final and static methods and variables uses static
		 * binding and bonded by compiler while overridden methods are bonded during
		 * runtime based upon type of runtime object
		 */
	}

}

/*
 * If you are overriding any method, overridden method (i.e. declared in
 * subclass) must not be more restrictive.
 */
class A {
	protected void msg() {
		System.out.println("Hello java");
	}
}

class Simple extends A {
//	The default modifier is more restrictive than protected. That is why, there is a compile-time error.
//	void msg() {
//		System.out.println("Hello java");
//	}// C.T.Error

	public static void main(String args[]) {
		Simple obj = new Simple();
		obj.msg();
	}
}

/*
 * 1 - We cannot make a overridden method static in subclass, of instance method
 * of super class.
 * 
 * 2 When you define a static method with same signature as a static method in
 * Super class, it is known as method hiding.
 */

class B {
	public void msg() {
		System.out.println("Hello java");
	}

	public static void print() {
		System.out.println("static B class");
	}
}

class Simple1 extends B {
	// Error
//	public static void msg() {
//		System.out.println("Simple1 static method");
//	}

	// Method Hiding
	public static void print() {
		System.out.println("static Simple1 class");
	}

	public static void main(String args[]) {

		B obj3 = new Simple1();
		obj3.print();
		obj3.msg();
	}
}

/*
 * We cannot override static method
 */

class Parent1 {
	public static void print() {
		System.out.println("Parent1 , static");
	}
}

class Child1 extends Parent1 {
	// It will show error
//	public void print() {
//		
//	}
}

/*
 * Parent class ka mai final method hai toh overide nahi kar sakte lekin we can
 * make the over-ridden method final.
 */

class Parent2 {
	public final void print() {
		System.out.println("Parent2 , static");
	}

	public void msg() {
		System.out.println("Parent 2 , instance method");
	}
}

class Child2 extends Parent2 {
	// Error
//	public void print() {
//		
//	}

	public final void msg() {
		System.out.println("child 2 , final overridden");
	}

}

/*
 * Invoking overridden method from sub-class : We can call parent class method
 * in overriding method using super keyword.
 */
class Parent3 {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child3 extends Parent3 {
	@Override
	void show() {
		super.show();
		System.out.println("Child's show()");
	}

	public static void main(String[] args) {
		Parent3 obj = new Child3();
		obj.show();
	}
}
