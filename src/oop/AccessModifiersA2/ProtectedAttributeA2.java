package oop.AccessModifiersA2;

import oop.AccessModifiersA1.ProtectedAttributeA1;

// Summary - Protected Attribute ko tabhi kar sakte hai
// (Jitna bhi child class ho , jab child class ka object bane, child ka hi reference ho and child class mai hi call ho.


class B extends ProtectedAttributeA1 {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.x);
		obj.print();

		ProtectedAttributeA1 obj1 = new ProtectedAttributeA1();
		// Error Not Visible
		// System.out.println(obj1.x);

		ProtectedAttributeA1 obj2 = new B();
		// Error Not Visible
		// System.out.println(obj2.x);

	}
}

public class ProtectedAttributeA2 extends B {

	public static void main(String[] args) {
		// Error Not visible method
//		ProtectedAttributeA1 obj = new ProtectedAttributeA1();
//		obj.print();

		ProtectedAttributeA2 obj = new ProtectedAttributeA2();
		obj.print();
		System.out.println(obj.x);

		B obj3 = new B();
		// Error dega usi class sai call karna hoga
		// System.out.println(obj3.x);

		B obj4 = new ProtectedAttributeA2();
		//System.out.println(obj4.x);

	}

}
