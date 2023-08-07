package oop.Polymorphism;

class Sample1 {
	// Error

//	public static void run(int a, int b) {
//		System.out.println("static run method");
//	}
//
//	public void run(int a, int b) {
//		System.out.println("run method");
//	}
}

public class MethodOverloading2 {
	public static void main(String[] args) {
		/*
		 * Can we overload methods that differ only by static keyword?
		 * 
		 * We cannot overload two methods in Java if they differ only by static keyword
		 * (number of parameters and types of parameters is same).
		 * 
		 * Method overloading in java is based on the number and type of the parameters
		 * passed as an argument to the methods.
		 * 
		 * We can not define more than one method with the same name, Order, and type of
		 * the arguments. It would be a compiler error.
		 * 
		 * The compiler does not consider the return type while differentiating the
		 * overloaded method. But you cannot declare two methods with the same signature
		 * and different return types. It will throw a compile-time error. If both
		 * methods have the same parameter types, but different return types, then it is
		 * not possible.
		 * 
		 * Java can distinguish the methods with different method signatures. i.e. the
		 * methods can have the same name but with different parameters list (i.e. the
		 * number of the parameters, the order of the parameters, and data types of the
		 * parameters) within the same class.
		 * 
		 * Summary = kewal return type different hoga and method signature same hoga toh
		 * method overloading is not possible
		 */

	}

}

/*
 * The reason why we get compile time error in the above scenario is, here the
 * method arguments Integer and String both are not primitive data types in
 * Java. That means they accept null values. When we pass a null value to the
 * method1 the compiler gets confused which method it has to select, as both are
 * accepting the null.
 */

class Test {
	public void fun(Integer i) {
		System.out.println("fun(Integer ) ");
	}

	public void fun(String name) {
		System.out.println("fun(String ) ");
	}

	// Driver code
	public static void main(String[] args) {
		Test mv = new Test();

		// This line causes error
//		 mv.fun(null);

		Integer arg = null;

		// No compiler error
		mv.fun(arg);
	}
}
