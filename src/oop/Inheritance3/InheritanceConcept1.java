package oop.Inheritance3;

class Fruit {
	/*
	 * Inheritance in Java is a mechanism in which one object acquires all the
	 * properties and behaviors of a parent object. It is an important part of OOPs
	 * (Object Oriented programming system).
	 * 
	 * The idea behind inheritance in Java is that you can create new classes that
	 * are built upon existing classes. When you inherit from an existing class, you
	 * can reuse methods and fields of the parent class. Moreover, you can add new
	 * methods and fields in your current class also.
	 * 
	 * Inheritance represents the IS-A relationship which is also known as a
	 * parent-child relationship.
	 * 
	 * Why use inheritance in java For Method Overriding (so runtime polymorphism
	 * can be achieved). For Code Reusability.
	 * 
	 * Sub Class/Child Class: Subclass is a class which inherits the other class. It
	 * is also called a derived class, extended class, or child class.
	 * 
	 * Super Class/Parent Class: Superclass is the class from where a subclass
	 * inherits the features. It is also called a base class or a parent class.
	 */

	/*
	 * In inheritance, subclass acquires super class properties. An important point
	 * to note is, when a subclass object is created, a separate object of a
	 * superclass object will not be created. Only a subclass object is
	 * created that has superclass variables. This situation is different from a
	 * normal assumption that a constructor call means an object of the class is
	 * created, so we can not blindly say that whenever a class constructor is
	 * executed, the object of that class is created or not.
	 */
	public Fruit() {
		System.out.println("Super class constructor");
		System.out.println("Super class object hashcode :" + this.hashCode());
		System.out.println(this.getClass().getName());
	}
}

class Apple extends Fruit {
	public Apple() {
		System.out.println("Subclass constructor invoked");
		System.out.println("Sub class object hashcode :" + this.hashCode());

		System.out.println(this.hashCode() + " " + super.hashCode());

		System.out.println(this.getClass().getName() + " " + super.getClass().getName());
	}
}

public class InheritanceConcept1 {
	public static void main(String[] args) {
		Apple obj = new Apple();
		// o/p
//		Super class constructor
//		Super class object hashcode :1523554304
//		oop.Inheritance.Apple
//		Subclass constructor invoked
//		Sub class object hashcode :1523554304
//		1523554304 1523554304
//		oop.Inheritance.Apple oop.Inheritance.Apple

		System.out.println();
		Fruit obj1 = new Apple();
		// o/p
//		Super class constructor
//		Super class object hashcode :1175962212
//		oop.Inheritance.Apple
//		Subclass constructor invoked
//		Sub class object hashcode :1175962212
//		1175962212 1175962212
//		oop.Inheritance.Apple oop.Inheritance.Apple

	}

}
