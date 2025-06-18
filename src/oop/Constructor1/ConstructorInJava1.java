package oop.Constructor1;

public class ConstructorInJava1 {
	public ConstructorInJava1() {
		
	}
	public static void main(String[] args) {
		/*
		 * It is called when an instance of the class is created. At the time of calling
		 * constructor, memory for the object is allocated in the memory.
		 * 
		 * It is a special type of method which is used to initialize the object.
		 * 
		 * Every time an object is created using the new() keyword, at least one
		 * constructor is called.
		 * 
		 * It calls a default constructor if there is no constructor available in the
		 * class. In such case, Java compiler provides a default constructor by default.
		 * 
		 * Rules for creating Java constructor
		 * 
		 * Constructor name must be the same as its class name
		 * 
		 * A Constructor must have no explicit return type
		 * 
		 * A Java constructor cannot be abstract, static, final, and synchronized
		 *
		 * ❌ abstract constructor — Not allowed
			Why? abstract means the method has no implementation and must be overridden in a subclass.
			But a constructor is never inherited, so it cannot be overridden.
			Also, every constructor must have a body to initialize the object.
			✅ Summary: A constructor must have implementation; hence it can’t be abstract.


		❌ static constructor — Not allowed
		Why? static means the method belongs to the class, not to instances.
		But a constructor is used to create an instance, so making it static defeats its purpose.
		✅ Summary: Constructors are tied to objects, not the class itself — so they can't be static.

		❌ final constructor — Not allowed
		Why? final prevents a method from being overridden.
		But constructors cannot be overridden anyway — they're not inherited by subclasses.
		✅ Summary: Since constructors can’t be overridden, final is meaningless on them.

		❌ synchronized constructor — Not allowed
		Why? You can’t synchronize a constructor directly, because the object doesn’t exist yet when the constructor is called.
		Instead, you can synchronize blocks inside the constructor if needed.

		 * 
		 * We can use access modifiers while declaring a constructor. It controls the
		 * object creation. In other words, we can have private, protected, public or
		 * default constructor in Java.
		 * 
		 * Q) What is the purpose of a default constructor? The default constructor is
		 * used to provide the default values to the object like 0, null, etc.,
		 * depending on the type.
		 * 
		 * 
		 * 
		 */

		/*
		Important Points to Remember
		1 - A constructor is automatically called when an object is created using the new keyword.
		2 - If no constructor is defined, Java provides a default constructor that initializes
			instance variables to default values (0, null, etc.).
		3 - Constructors do not have a return type, not even void.
		4 - A constructor's name must match the class name exactly.
		5 - Constructor overloading is allowed, meaning multiple constructors can be defined with different parameters.
		6 - A constructor can call another constructor within the same class using this(),
			which is known as constructor chaining.
		7 - A constructor can call a superclass constructor using super(), which must be the first statement in the constructor.
		8 - Constructors cannot be static, final, abstract, or synchronized in Java.
		9 - Constructors can have access modifiers (public, private, protected, or default).
		10 - A private constructor is used in singleton patterns.
		11 - Constructors can perform other tasks beyond initialization,
			such as opening database connections, starting threads, or calling methods.

		If no constructor call is explicitly made, the compiler implicitly inserts a call to super() in every constructor.
		It ensures that the superclass constructor is called, initializing the superclass part of the object.
		 */

//		class Student3
//		{
//			int id;
//			String name;
//			void display(){System.out.println(id+" "+name);}
//		}
//
//		public static void main(String args[]){
//			//creating objects
//			Student3 s1=new Student3();
//			Student3 s2=new Student3();
//			//displaying values of the object
//			s1.display();
//			s2.display();
//		}

		/*
		 * 0 null 
		 * 
		 * 0 null 
		 * 
		 * Explanation:In the above class,you are not creating any
		 * constructor so compiler provides you a default constructor. Here 0 and null
		 * values are provided by default constructor.
		 */
	}

}
