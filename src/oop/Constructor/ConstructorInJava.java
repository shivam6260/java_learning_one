package oop.Constructor;

public class ConstructorInJava {
	public ConstructorInJava() {
		
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
