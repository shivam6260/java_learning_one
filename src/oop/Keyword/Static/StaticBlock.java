package oop.Keyword.Static;

public class StaticBlock {
	public static int a = 10;

	static {
		System.out.println(a);
		a = 20;
	}

	static {
		System.out.println(a);
		a = 100;
	}
	public static void main(String[] args) {
		
		System.out.println(a);

		/*
		 * Can we print something on the console without creating main() method? or Can
		 * we run the JAVA program without main method ??
		 * 
		 * It is very important question from the interview’s perceptive point. The
		 * answer is yes we can print if we are using JDK version 1.6 or previous and if
		 * after that that it will throw an. error.
		 * 
		 * Static blocks can also be executed before constructors.
		 * 
		 * A class can have any number of static initialization blocks, and they can
		 * appear anywhere in the class body. The runtime system guarantees that static
		 * initialization blocks are called in the order that they appear in the source
		 * code.
		 */
	}

}
