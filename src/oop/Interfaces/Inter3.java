package oop.Interfaces;

public interface Inter3 extends Inter2 ,Inter1  {
	/*
	 * Since Java 8, we can have method body in interface. But we need to make it
	 * default method. 
	 * 
	 * Since Java 8, we can have static method in interface.
	 * 
	 * Summary = 
	 * Interface ka static method kewal Interface ka name sai call hoga
	 * or kissi bhi reference sai nhi.
	 */
	void eat();

	default void msg() {
		System.out.println("default method");
	}
	
	public static void move() {
		System.out.println("Moving in Inter3");
	}

}
