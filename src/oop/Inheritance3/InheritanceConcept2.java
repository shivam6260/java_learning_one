package oop.Inheritance3;

public class InheritanceConcept2 {
	public static void main(String[] args) {
		/*
		 * Default superclass: Except Object class, which has no superclass, every class
		 * has one and only one direct superclass (single inheritance). In the absence
		 * of any other explicit superclass, every class is implicitly a subclass of the
		 * Object class.
		 * 
		 * Superclass can only be one: A superclass can have any number of subclasses.
		 * But a subclass can have only one superclass. This is because Java does not
		 * support multiple inheritances with classes. Although with interfaces,
		 * multiple inheritances are supported by java.
		 * 
		 * Inheriting Constructors: A subclass inherits all the members (fields, methods
		 * (Not Private Methods), and nested classes) from its superclass. Constructors
		 * are not members, so they are not inherited by subclasses, but the constructor
		 * of the superclass can be invoked from the subclass.
		 * 
		 * Private member inheritance: A subclass does not inherit the private members
		 * of its parent class. However, if the superclass has public or protected
		 * methods(like getters and setters) for accessing its private fields, these can
		 * also be used by the subclass. So we can create the exact same method in
		 * subclass but that is not overriding
		 * 
		 * 
		 * 
		 * 
		 * Q) Why multiple inheritance is not supported in java? To reduce the
		 * complexity and simplify the language, multiple inheritance is not supported
		 * in java.
		 * 
		 * 
		 * Consider a scenario where A, B, and C are three classes. The C class inherits
		 * A and B classes. If A and B classes have the same method and you call it from
		 * child class object, there will be ambiguity to call the method of A or B
		 * class.
		 * 
		 * Since compile-time errors are better than runtime errors, Java renders
		 * compile-time error if you inherit 2 classes. So whether you have same method
		 * or different, there will be compile time error.
		 */
	}

}
