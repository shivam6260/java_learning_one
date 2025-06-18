package oop;

public class ClassesAndObject3 {

	public static void main(String[] args) {

		/**
		 What is a Class in Java?

		 A class is a group of objects that have common properties.
		 It is a template or blueprint from which objects are created.
		 It is a logical entity. It can't be physical.

		 In general, class declarations can include these components, in order:
		 Modifiers: A class can be public or has default access class
		 keyword: class keyword is used to create a class.

		 Body: The class body surrounded by braces, { }.

		 A Java class contains:

		 1. Instance Variable -
		 A variable which is created inside the class but
		 outside the method is known as an instance variable. Instance variable
		 doesn't get memory at compile time. It gets memory at runtime when an object
		 or instance is created. That is why it is known as an instance variable.

		 They specify the data that will be stored in each class object.
		 Different access modifiers, such as default, public, private, and protected
		 can be applied to fields to regulate their visibility and usability.

		 The Default value of Instance variable - null. agar tum initialise nai kie
		 tab bhi koi Problem nahi hai but default value of local variable kuch nahi
		 hota agar usko bina initialise kie use kie toh error aa jayega.

		 2. Methods
		 Methods are functions defined inside a class that include the actions or behaviors that objects of that
		 class are capable of performing.

		 3. Constructors
		 Constructors are unique methods that are used to initialize class objects.
		 When an object of the class is created using the new keyword,
		 they are called with the same name as the class.

		 Constructors can initialize the fields of an object or carry out any additional
		 setup that's required when an object is created.

		 4. Blocks
		 Within a class, Java allows two different kinds of blocks: instance blocks,
		 commonly referred to as initialization blocks and static blocks.
		 Static blocks, which are usually used for static initialization,
		 are only executed once when the class is loaded into memory.

		 Instance blocks can be used to initialize instance variables and are executed each time
		 a class object is generated.

		 5. Nested Class and Interface
		 Java permits the nesting of classes and interfaces inside other classes and interfaces.
		 The members (fields, methods) of the enclosing class are accessible to nested classes,
		 which can be static or non-static.

		 Nested interfaces can be used to logically group related constants and methods together
		 because they are implicitly static.


		 What is an object in Java?

		 Every object has a distinct identity, which is usually implemented by a unique ID that the
		 JVM uses internally for identification.

		 An object is an instance of a class.
		 A class is a template or blueprint from which objects are created. So, an object is the instance (result) of a class.

		 new keyword in Java
		 The new keyword is used to allocate memory at runtime. All objects get memory in the Heap memory area.

		 In Java, an instance of a class (also referred to as an object) is created using the new keyword.
		 The new keyword dynamically allocates memory for an object of that class and returns a reference to it.


		 Initializing an Object in Java
		 There are the following three ways to initialize an object in Java:

		 By Reference Variable
		 By Method
		 By Constructor

		 Example -

		 class Student{
		 	int id;
		 	String name;
		 }

		 1st way
		 Student s1=new Student();
		 s1.id=101;
		 s1.name="Sonoo";

		 2nd Way

		 class Student{
		 	int rollno;
		 	String name;
		 	void insertRecord(int r, String n){
		 		rollno=r;
		 		name=n;
		 	}
		 }
		 Student s1=new Student();
		 s1.insertRecord(111,"Karan");

		 3rd Way
		 class Student {
		 	int id;
		 	String name;
		 	public Student(int id, String name) {
		 		this.id = id;
		 		this.name = name;
		 	}
		 }
		 Student student1 = new Student(1, "John Doe");

		 Anonymous Object

		 An object that has no reference is known as an anonymous object.

		 Calling a method Normally -
		 Calculation c=new Calculation();
		 c.fact(5);

		 Calling method through an anonymous object
		 new Calculation().fact(5);

		 */

	}

}

