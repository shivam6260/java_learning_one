package oop.Interfaces;

// public interface Serializable { // nothing here }

public class MarkerInterface {
	public static void main(String[] args) {
		/*
		 * It is an empty interface (no field or methods). Examples of marker interface
		 * are Serializable, Cloneable and Remote interface. All these interfaces are
		 * empty interfaces.
		 * 
		 * They are used to provide some essential information to the JVM so that JVM
		 * may perform some useful operation.
		 * 
		 * 
		 * public interface Serializable { // nothing here }
		 * 
		 * Examples of Marker Interface
		 * 
		 * Cloneable interface : Cloneable interface is present in java.lang package.
		 * There is a method clone() in Object class. A class that implements the
		 * Cloneable interface indicates that it is legal for clone() method to make a
		 * field-for-field copy of instances of that class. Invoking Object’s clone
		 * method on an instance of the class that does not implement the Cloneable
		 * interface results in an exception CloneNotSupportedException being thrown. By
		 * convention, classes that implement this interface should override
		 * Object.clone() method.
		 * 
		 * 
		 * Serializable interface : Serializable interface is present in java.io
		 * package. It is used to make an object eligible for saving its state into a
		 * file. This is called Serialization. Classes that do not implement this
		 * interface will not have any of their state serialized or deserialized. All
		 * subtypes of a serializable class are themselves serializable.
		 */
	}

}




