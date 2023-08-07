package oop.AccessModifiersA1;

public class ProtectedAttributeA1 {
	protected int x = 10;
	protected void print() {
		System.out.println("Method with protected specifier in A1");
	}
	
	public static void main(String[] args) {
		/*
		 * The protected access modifier is accessible within package and outside the
		 * package but through inheritance only.
		 * 
		 * The protected access modifier can be applied on the data member, method and
		 * constructor. It can't be applied on the class.
		 */
	}

}
