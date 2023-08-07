package oop.Polymorphism;

class Adder {
//  It will show error because only return type is different
//	static int add(int a, int b) {
//		return a + b;
//	}
//
//	static double add(int a, int b) {
//		return a + b;
//	}
}

public class MethodOverloading {
	public void print(int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		// Automatic Promotion
		// For Automatic promotion diagram
		// Link = https://www.javatpoint.com/method-overloading-in-java
		obj.print('a', 'b');

		/*
		 * If a class has multiple methods having same name but different in parameters,
		 * it is known as Method Overloading. Method Overloading happens within Same
		 * class.
		 * 
		 * Method overloading can be done by changing:
		 * 
		 * The number of parameters in two methods.
		 * 
		 * The data types of the parameters of methods.
		 * 
		 * The Order of the parameters of methods.
		 * 
		 * In Java, Method Overloading is not possible by changing the return type of
		 * the method only.
		 * 
		 * Q) Why Method Overloading is not possible by changing the return type of
		 * method only? In java, method overloading is not possible by changing the
		 * return type of the method only because of ambiguity. Let's see how ambiguity
		 * may occur: class Adder
		 * 
		 * 
		 * Can we overload java main() method? Yes, by method overloading. You can have
		 * any number of main methods in a class by method overloading. But JVM calls
		 * main() method which receives string array as arguments
		 * 
		 * Overloading is related to compile-time (or static) polymorphism.
		 */

	}

}

// If there are matching type arguments in the method, type promotion is not performed.

class OverloadingCalculation2 {
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
		
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
		
	}

	public static void main(String args[]) {
		OverloadingCalculation2 obj = new OverloadingCalculation2();
		obj.sum(20, 20);// now int arg sum() method gets invoked
	}
}

//If there are no matching type arguments in the method, and 
//each method promotes similar number of arguments, there will be ambiguity.
//Error Ayega
// kyuki dono mai int promote to long or phir dono same method ho gaya
// obj.method1(20, 20);

class OverloadingCalculation3 {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		OverloadingCalculation3 obj = new OverloadingCalculation3();
		// obj.sum(20, 20);// now ambiguity
		long a = 40;
		// This is correct
		// No automatic promotion is happening, directly calling the exact method
		obj.sum(a, 10); // O/P = b method invoked
	}

}

/*
 * Q. What if the exact prototype does not match with arguments.
 * 
 * Ans. Priority wise, compiler take these steps:
 * 
 * Type Conversion but to higher type(in terms of range) in same family. Type
 * conversion to next higher family(suppose if there is no long data type
 * available for an int data type, then it will search for the float data type).
 */

class Demo {
	public void show(int x) {
		System.out.println("In int" + x);
	}

	public void show(String s) {
		System.out.println("In String" + s);
	}

	public void show(byte b) {
		System.out.println("In byte" + b);
	}
}

class UseDemo {
	public static void main(String[] args) {
		byte a = 25;
		Demo obj = new Demo();
		obj.show(a); // it will go to
		// byte argument

		obj.show("hello"); // String
		obj.show(250); // Int

		obj.show('A'); // Since char is
		// not available, so the datatype
		// higher than char in terms of
		// range is int.
		obj.show("A"); // String
		// obj.show(7.5); // since float datatype
		// is not available and so it's higher
		// datatype, so at this step their
		// will be an error.
	}
}
