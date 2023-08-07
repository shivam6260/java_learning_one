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
