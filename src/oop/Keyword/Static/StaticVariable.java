package oop.Keyword.Static;

class Sample {
	public static int noOfObject;
	public int instance;

	public Sample() {
		this.noOfObject++;
		this.instance++;
	}
}

public class StaticVariable {
	public static void main(String[] args) {
		/*
		 * Java static property is shared to all objects.
		 * 
		 * When a variable is declared as static, then a single copy of the variable is
		 * created and shared among all objects at the class level. Static variables
		 * are, essentially, global variables. All instances of the class share the same
		 * static variable.
		 * 
		 * Important points for static variables:
		 * 
		 */
		Sample obj1 = new Sample();
		Sample obj2 = new Sample();
		Sample obj3 = new Sample();
		System.out.println(obj1.noOfObject); // o/p = 3
		System.out.println(Sample.noOfObject);
		System.out.println(obj3.instance);
	}
}
/*
 * We can create static variables at the class level only. See here static block
 * and static variables are executed in the order they are present in a program.
 */

class Test {
	// static variable
	static int a = m1();

	// static block
	static {
		System.out.println("Inside static block");
	}

	// static method
	static int m1() {
		System.out.println("from m1");
		return 20;
	}

	// static method(main !!)
	public static void main(String[] args) {
		System.out.println("Value of a : " + a);
		System.out.println("from main");
	}
}
//o/p
//from m1
//Inside static block
//Value of a : 20
//from main