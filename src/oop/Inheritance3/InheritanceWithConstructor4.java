package oop.Inheritance3;

class Base {
	/*
	 * In Java, constructor of base class with no argument gets automatically called
	 * in derived class constructor.
	 * 
	 * But, if we want to call parameterized constructor of base class, then we can
	 * call it using super(). The point to note is base class constructor call must
	 * be the first line in derived class constructor.
	 */
	int x;

	Base(int _x) {
		x = _x;
	}
}

class Derived extends Base {
	int y;

	Derived(int x, int y) {
		super(x);
		this.y = y;
	}

	void Display() {
		System.out.println("x = " + x + ", y = " + y);
	}
}

public class InheritanceWithConstructor4 {

}
