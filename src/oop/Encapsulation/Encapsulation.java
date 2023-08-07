package oop.Encapsulation;

public class Encapsulation {
	public static void main(String[] args) {
		/*
		 * Encapsulation in Java is a process of wrapping code and data together into a
		 * single unit.
		 * 
		 * We can create a fully encapsulated class in Java by making all the data
		 * members of the class private. Now we can use setter and getter methods to set
		 * and get the data in it.
		 * 
		 * The Java Bean class is the example of a fully encapsulated class.
		 * 
		 * Advantages -
		 * 
		 * By providing only a setter or getter method, you can make the class read-only
		 * or write-only. In other words, you can skip the getter or setter methods.
		 * 
		 * It provides you the control over the data. Suppose you want to set the value
		 * of id which should be greater than 100 only, you can write the logic inside
		 * the setter method. You can write the logic not to store the negative numbers
		 * in the setter methods.
		 * 
		 * It is a way to achieve data hiding in Java because other class will not be
		 * able to access the data through the private data members.
		 * 
		 * The encapsulate class is easy to test. So, it is better for unit testing.
		 * 
		 * The standard IDE's are providing the facility to generate the getters and
		 * setters. So, it is easy and fast to create an encapsulated class in Java.
		 * 
		 * Encapsulation is defined as the wrapping up of data under a single unit. It
		 * is the mechanism that binds together code and the data it manipulates.
		 * Another way to think about encapsulation is, it is a protective shield that
		 * prevents the data from being accessed by the code outside this shield.
		 * 
		 * Technically in encapsulation, the variables or data of a class is hidden from
		 * any other class and can be accessed only through any member function of its
		 * own class in which it is declared.
		 * 
		 * As in encapsulation, the data in a class is hidden from other classes using
		 * the data hiding concept which is achieved by making the members or methods of
		 * a class private, and the class is exposed to the end-user or the world
		 * without providing any details behind implementation using the abstraction
		 * concept, so it is also known as a combination of data-hiding and abstraction.
		 * 
		 * Encapsulation can be achieved by Declaring all the variables in the class as
		 * private and writing public methods in the class to set and get the values of
		 * variables It is more defined with setter and getter method.
		 * 
		 */
	}

}

//Read-Only class
//A Java class which has only getter methods.  
class Student {
	private String college = "AKG";

	public String getCollege() {
		return college;
	}
}

//Write-Only class
class Student1 {
	private String college;

	public void setCollege(String college) {
		this.college = college;
	}
}