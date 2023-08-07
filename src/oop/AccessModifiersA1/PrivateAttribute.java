package oop.AccessModifiersA1;



public class PrivateAttribute {
	public static void main(String[] args) {
		/*
		 * Private: The access level of a private modifier is only within the class. It
		 * cannot be accessed from outside the class.
		 * 
		 * Private Constructor -
		 * 
		 * Role of Private Constructor If you make any class constructor private, you
		 * cannot create the instance of that class from outside the class. For example:
		 * 
		 * Top-level classes or interfaces can not be declared as private
		 */
	}

}
/*
 * Private Method inherit nahi hota
 * Private method ko humlog dusre class sai call nahi kar sakte
 */

class Parent {
	public void print() {
		System.out.println("Print Parent");
	}
	
	private void msg() {
		System.out.println("Private method");
	}
	private void msg(int a) {
		System.out.println("Private method");
	}
}

class Child extends Parent{
	// This is not over-riding
	private void msg() {
		System.out.println("Private method");
	}
	
	public static void main(String[] args) {
		// Parent obj = new Parent();
		// Error not visible
		// obj.msg();
		
		Parent obj = new Child();
		//Error
//		obj.msg();
//		obj.print();
		
//		Child obj = new Child();
//		obj.msg();
		
		
	}

	
}
















