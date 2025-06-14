package oop.Constructor;

public class SingletonClass {
	/*
	 * In object-oriented programming, we often need to create a class that can be
	 * instantiated only once at a time. We can't create the object of a singleton
	 * class more than once. However, if we try to create the object of a singleton
	 * class after the first time, the new reference variable will also point to the
	 * first instance created.
	 * 
	 * This often ensures that there is access control to resources, for example,
	 * socket or database connection.
	 * 
	 * All the reference variables of a singleton class object refer to the same
	 * data since they point to a similar object. To create a singleton class in
	 * Java ,
	 * 
	 * Define the class constructor as private. Create a static method that returns
	 * the object of this class.
	 */

	/*
	Purpose of Singleton Class
	The primary purpose of a Java Singleton class is to restrict the limit of the number of object creations to only one.
	This often ensures that there is access control to resources, for example, a socket or a database connection.

	Memory Efficient: As the object creation will take place only once instead of creating it each time a new request is made,
	which reduces the overhead and makes it memory efficient.

	Resource Control: Restrict the new object creation in multi-threaded and
	database applications mostly make use of the Singleton pattern in Java for caching, logging, thread pooling,
	configuration settings, etc.

	Thread Safety: For example, there is a license with us, and
	we have only one database connection or suppose our JDBC driver does not allow us to do multithreading,
	then the Singleton class comes into the picture and makes sure that at a time, only a single connection or a single
	thread can access the connection.
	 */

	private static SingletonClass obj ;
	public String str;

	private SingletonClass() {
	}

	public static SingletonClass creatingObject() {
		if (obj == null)
			obj = new SingletonClass();
		return obj;
	}

	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.creatingObject();
		obj.str = "Hello";
		SingletonClass obj1 = SingletonClass.creatingObject();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}



class SingletonClass2 {
	private static SingletonClass2 obj = new SingletonClass2() ;
	public String str;

	private SingletonClass2() {
	}

	public static SingletonClass2 creatingObject() {
		return obj;
	}

	public static void main(String[] args) {
		SingletonClass2 obj = SingletonClass2.creatingObject();
		obj.str = "Hello";
		SingletonClass2 obj1 = SingletonClass2.creatingObject();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.str);
	}

}
