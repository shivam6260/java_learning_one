package oop.Interfaces;

// Example of Functional Interface using Lambda Expression

// This is the example to functional interface. It contain only one abstract method
interface Square {
	int calculate(int x);
    // It can contain any number of Object class methods, default and static methods  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}

class Test {
	public static void main(String args[]) {
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}

// Example From Javat Point

interface sayable {
	void say(String msg);
}

class FunctionalInterfaceExample implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {

		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Hello there");

		sayable obj = new FunctionalInterfaceExample();
		fie.say("Hello there");
	}
}

public class FunctionalInterface {
	public static void main(String[] args) {
		/*
		 * An Interface that contains exactly one abstract method is known as functional
		 * interface. It can have any number of default, static methods but can contain
		 * only one abstract method.
		 * 
		 * @FunctionalInterface annotation is used to ensure that the functional
		 * interface can’t have more than one abstract method. In case more than one
		 * abstract methods are present, the compiler flags an
		 * ‘Unexpected @FunctionalInterface annotation’ message. However, it is not
		 * mandatory to use this annotation.
		 * 
		 * Functional Interface is also known as Single Abstract Method Interfaces or
		 * SAM Interfaces. It is a new feature in Java, which helps to achieve
		 * functional programming approach.
		 * 
		 * Since Java SE 1.8 onwards, there are many interfaces that are converted into
		 * functional interface. All these interfaces are annotated
		 * with @FunctionalInterface. These interfaces are as follows –
		 * 
		 * Runnable –> This interface only contains the run() method.
		 * 
		 * Comparable –> This interface only contains the compareTo() method.
		 * 
		 * ActionListener –> This interface only contains the actionPerformed() method.
		 * 
		 * Callable –> This interface only contains the call() method.
		 * 
		 * A functional interface can extends another interface only when it does not
		 * have any abstract method.
		 */

	}

}

// Example of both Normal Implementation and Lambda Epressions in Functional Interface

interface f1 {
	int cube(int x);
}

interface f2 {
	void isSquare(String msg);
}

class Check implements f2, f1 {
	public void isSquare(String msg) {
		System.out.println(msg);
	}

	public int cube(int x) {
		return x + x;
	}

	public static void main(String[] args) {
		f1 fone = (x) -> x * x;
		f2 ftwo = (msg) -> {
			System.out.println("Hello");
		};

		int res = fone.cube(5);
		ftwo.isSquare("Hello");

		Check obj = new Check();
		obj.cube(10);
		obj.isSquare("Hello");
	}
}
