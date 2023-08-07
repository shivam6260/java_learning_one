package oop.Keyword.Final;

public class FinalClass {
	public static void main(String[] args) {
		/*
		 * The final keyword in java is used to restrict the user. The java final
		 * keyword can be used in many context.
		 * 
		 * Final can be:
		 * 
		 * variable 
		 * 
		 * method 
		 * 
		 * class
		 * 
		 * When a method is declared with final keyword, it is called a final method. A
		 * final method cannot be overridden.
		 */
	}

}

/*
 * If you make any class as final, you cannot extend it.
 */
//final class Bike {
//}
//
//class Honda extends Bike {
//	void run() {
//		System.out.println("running safely with 100kmph");
//	}
//}

/*
 * 
 * When a method is declared with final keyword, it is called a final method. A
 * final method cannot be overridden.
 * But we can overload the final method
 */
class Sample {
	public final void run() {
		System.out.println("run 0 parameter");
	}
	public final void run(int a) {
		System.out.println("run with one parameter");
	}
	public void print() {
		System.out.println("sample class print method");
	}
}

class Child extends Sample {
	//Error
//	public final void run() {
//		System.out.println("run 0 parameter");
//	}
	
	//Error
//	public void run() {
//		System.out.println("run 0 parameter");
//	}
	
	public void print() {
		System.out.println("Child class print method");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		obj.run(5);
		
		Sample obj1 = new Child();
		obj1.run();
		obj1.print();
	}
}



