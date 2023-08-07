package StringInJava;

public class StringBuilderClass {
	public static void main(String[] args) {
		/*
		 * Java StringBuilder class is used to create mutable (modifiable) String. The
		 * Java StringBuilder class is same as StringBuffer class except that it is
		 * non-synchronized. Constructors in Java StringBuilder:
		 * 
		 * 
		 * StringBuilder(): Constructs a string builder with no characters in it and an
		 * initial capacity of 16 characters.
		 * 
		 * StringBuilder(int capacity): Constructs a string builder with no characters
		 * in it and an initial capacity specified by the capacity argument.
		 * 
		 * StringBuilder(CharSequence seq): Constructs a string builder that contains
		 * the same characters as the specified CharSequence.
		 * 
		 * StringBuilder(String str): Constructs a string builder initialized to the
		 * contents of the specified string.
		 */

		// Append
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		

		// Insert
		StringBuilder sb1 = new StringBuilder("Hello ");
		sb1.insert(1, "Java");// now original string is changed
		System.out.println(sb1);// prints HJavaello

		// Reverse
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.reverse();
		System.out.println(sb2);// prints olleH

		// StringBuilder to String
		sb2.toString();
		
		
		// Length
		sb2.length();
	}

}
