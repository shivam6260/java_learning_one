package oop.Constructor;

public class CopyConstructor {
	int id;
	String name;

	CopyConstructor(int i, String n) {
		// Constructor sai hum dono static and non static method ko call kar sakte
		
		
		this.calling();
		this.print();
		id = i;
		name = n;
	}

	// constructor to initialize another object
	CopyConstructor(CopyConstructor s) {
		id = s.id;
		name = s.name;
	}

	public static void calling() {
		System.out.println("in calling");
		// We can not call instance method from static method
	    //print();
	}

	public void print() {
		System.out.println("in print");
		// we can call static method from both Instance method and static method
		this.calling();
	}

	public static void main(String[] args) {
		CopyConstructor obj1 = new CopyConstructor(32, "Shivam");
		CopyConstructor obj2 = new CopyConstructor(obj1);

		// Static method ko Direct class ya obj bana kai call kar sakte
		obj1.calling();
		CopyConstructor.calling();

	}
	/*
	 * Can constructor perform other tasks instead of initialization? Yes, like
	 * object creation, starting a thread, calling a method, etc. You can perform
	 * any operation in the constructor as you perform in the method.
	 * 
	 */

}
