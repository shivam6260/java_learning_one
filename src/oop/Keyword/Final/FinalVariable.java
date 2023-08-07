package oop.Keyword.Final;

public class FinalVariable {
	public static void main(String[] args) {
		/*
		 * When a variable is declared with final keyword, its value can’t be modified,
		 * essentially, a constant. This also means that you must initialize a final
		 * variable.
		 * 
		 * If the final variable is a reference, this means that the variable cannot be
		 * re-bound to reference another object, but the internal state of the object
		 * pointed by that reference variable can be changed i.e. you can add or remove
		 * elements from the final array or final collection.
		 * 
		 * Initializing a final Variable We must initialize a final variable, otherwise,
		 * the compiler will throw a compile-time error.
		 * 
		 * There are three ways to initialize a final variable:
		 * 
		 * You can initialize a final variable when it is declared. This approach is the
		 * most common.
		 * 
		 * A final variable is called a blank final variable if it is not initialized
		 * while declaration. Below are the two ways to initialize a blank final
		 * variable.
		 * 
		 * A blank final variable can be initialized inside an instance-initializer
		 * block or inside the constructor. If you have more than one constructor in
		 * your class then it must be initialized in all of them, otherwise, a
		 * compile-time error will be thrown.
		 * 
		 * A blank final static variable can be initialized inside a static block.
		 */
	}

}

/*
 * Reference final variable?
 * 
 * When a final variable is a reference to an object, then this final variable
 * is called the reference final variable. For example, a final StringBuffer
 * variable looks like defined below as follows:
 * 
 * As we all know that a final variable cannot be re-assign. But in the case of
 * a reference final variable, the internal state of the object pointed by that
 * reference variable can be changed. Note that this is not re-assigning.
 */

class GFG {
	public static void main(String[] args) {
		final StringBuilder sb = new StringBuilder("Geeks");
		System.out.println(sb);
		sb.append("ForGeeks");
		System.out.println(sb);
		// Error
//		sb = new StringBuilder();
		// Same for Array or any object
	}
}

/*
 * Remember: When a final variable is created inside a method/constructor/block,
 * it is called local final variable, and it must initialize once where it is
 * created. See below program for local final variable.
 */

class GFG1 {
	public static void main(String args[]) {
		final int i = 20;
		System.out.println(i);
	}
}

/*
 * A blank final variable can be initialized inside an instance-initializer
 * block or inside the constructor. If you have more than one constructor in
 * your class then it must be initialized in all of them, otherwise, a
 * compile-time error will be thrown.
 * 
 */

class Bike10 {
	final int speedlimit;// blank final variable
	final int gear;
	{
		speedlimit = 100;
	}

	Bike10(int a) {
		this.gear = 120;
	}

	Bike10() {
		this.gear = 100;
		// speedlimit = 70;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		new Bike10();
	}
}

/*
 * static blank final variable A static final variable that is not initialized
 * at the time of declaration is known as static blank final variable. It can be
 * initialized only in static block.
 */

class A {
	static final int data;// static blank final variable
	//Error
//	{
//		data = 50;
//	}
	
	// Error
//	public A() {
//		data = 50;
//	}
	static {
		data = 50;
	}

	public static void main(String args[]) {
		System.out.println(A.data);
	}
}
