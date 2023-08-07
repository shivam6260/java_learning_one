package JavaBasic;

public class VariablesAndDataTypes {
	public static void main(String[] args) {
		/*
		 * Local Variable - A variable declared inside the body of the method is called
		 * local variable. You can use this variable only within that method and the
		 * other methods in the class aren't even aware that the variable exists.
		 * 
		 * Instance Variable - A variable declared inside the class but outside the body
		 * of the method, is called an instance variable. It is called an instance
		 * variable because its value is instance-specific and is not shared among
		 * instances.
		 * 
		 * Static variable - A variable that is declared as static is called a static
		 * variable. It cannot be local. You can create a single copy of the static
		 * variable and share it among all the instances of the class. Memory allocation
		 * for static variables happens only once when the class is loaded in the
		 * memory.
		 * 
		 * The default value for Instance variable is 0 for primitive type and
		 * null for object type
		 * 
		 * The default value of local variable is not defined
		 * so if you use the local variable without initialising it will give error
		 */

		// Widening Example
//		int a=10; 
//		float f=a; 
//		System.out.println(a);
//		System.out.println(f);
//		10
//		10.0

		// TypeCasting
//			float f=10.5f;  
//			int a=(int)f;  
//			System.out.println(f);  
//			System.out.println(a);			
//			Output:
//
//			10.5
//			10

	}

}
