package oop.InstanceInitializer;

public class InstanceInitializer {
	public static void main(String[] args) {
		/*
		 * Instance Initializer block is used to initialize the instance data member. It
		 * run each time when object of the class is created.
		 * 
		 * The initialization of the instance variable can be done directly but there
		 * can be performed extra operations while initializing the instance variable in
		 * the instance initializer block.
		 * 
		 * The java compiler copies the instance initializer block in the constructor
		 * after the first statement super(). So firstly, constructor is invoked. then
		 * the Instance initializer block
		 * 
		 * Note: The java compiler copies the code of instance initializer block in
		 * every constructor.
		 * 
		 * Rules for instance initializer block : There are mainly three rules for the
		 * instance initializer block. They are as follows:
		 * 
		 * The instance initializer block is created when instance of the class is
		 * created.
		 * 
		 * The instance initializer block is invoked after the parent class constructor
		 * is invoked (i.e. after super() constructor call).
		 * 
		 * The instance initializer block comes in the order in which they appear.
		 */
	}

}

/*
 * The instance initializer block is invoked after the parent class constructor
 * is invoked (i.e. after super() constructor call).
 */

class Parent {
	public Parent() 
	{
		System.out.println("Parent Constructor");
	}

	{
		System.out.println("Parent Instance Initializer block");
	}
}

class Child extends Parent {

	{
		System.out.println("Instance Initializer block");
	}

	public Child() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		// Child obj = new Child();
		Parent obj = new Child();
	}
}
// o/p 
//Parent Constructor
//Instance Initializer block
//Child Constructor
