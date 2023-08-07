package StringInJava;

public class whatIsString {
	public static void main(String[] args) {

		/*
		 * Strings in Java are Objects that are backed internally by a char array. Since
		 * arrays are immutable(cannot grow), Strings are immutable as well. Whenever a
		 * change to a String is made, an entirely new String is created.
		 * 
		 * There are two ways to create String object:
		 * 
		 * 1 - By string literal 2 - By new keyword
		 * 
		 * 
		 * Each time you create a string literal, the JVM checks the
		 * "string constant pool" first. If the string already exists in the pool, a
		 * reference to the pooled instance is returned. If the string doesn't exist in
		 * the pool, a new string instance is created and placed in the pool. For
		 * example:
		 * 
		 * String s1="Welcome"; String s2="Welcome";//It doesn't create a new instance
		 * 
		 * Link - https://www.javatpoint.com/java-string
		 * 
		 * 2 - By new keyword
		 * 
		 * String s=new String("Welcome");
		 * In such case, JVM will create a new string object in normal (non-pool) heap
		 * memory,
		 * The variable s will refer to the object in a heap (non-pool).
		 */

		 String s1 = "TAT";
		 String s2 = "TAT";
		 if(s1 == s2)
			 System.out.println("Both are reference to Same address in String Literal Pool");
		 
		 String s3 = new String("Hello");
		 String s4 = new String("Hello");
		 
		 if(s3 == s4)
			 System.out.println("Both are reference to Same address in Heap");
		 else if(s3.equals(s4))
			 System.out.println("The Address is Different in Heap, only Value is Same");
		 // o/p = The Address is Different in Heap, only Value is Same
		 
		 
		 /*
		  *  Important Concept =
		  *  
		  *  String str = new String("Hello");
		  *  Yai Heap mai bhi Create hoga and String Literal Pool mai bhi "Hello" Jaygea
		  *  Lekin str refer heap wala ko karega
		  *  
		  *  String s1 = "Hello";
		  *  Toh Java Dekhega ki String Literal Pool mai toh phele sai present hai hi Hello
		  *  toh bus usi ko refer kar dega
		  *  
		  */
		 
		 String s7 = "abc";
		 String s8 = s7;
		 s7 = "abc" + "ty";
		 if(s7 == s8)
		 {
			 System.out.println("Yes true");
		 }
		 System.out.println(s7);
		 System.out.println(s8);
		 
	}

}
