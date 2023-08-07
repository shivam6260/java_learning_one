package StringInJava;

public class WhyStringIsImmutableInJava {
	public static void main(String[] args) {
		/*
		 * Link - https://www.javatpoint.com/immutable-string
		 * 
		 * Why String objects are immutable in Java? As Java uses the concept of String
		 * literal. Suppose there are 5 reference variables, all refer to one object
		 * "Sachin". If one reference variable changes the value of the object, it will
		 * be affected by all the reference variables. That is why String objects are
		 * immutable in Java.
		 * 
		 * If we don’t make the String immutable, it will pose a serious security threat
		 * to the application. For example, database usernames, passwords are passed as
		 * strings to receive database connections. The socket programming host and port
		 * descriptions are also passed as strings. The String is safe for
		 * multithreading because of its immutableness
		 * 
		 * Why String class is Final in Java? The reason behind the String class being
		 * final is because no one can override the methods of the String class. So that
		 * it can provide the same features to the new String objects as well as to the
		 * old ones.
		 */

		// String Comparison

		// Link - https://www.javatpoint.com/string-comparison-in-java
		/*
		 * It is used in authentication (by equals() method), sorting (by compareTo()
		 * method), reference matching (by == operator) etc.
		 * 
		 * The String class equals() method compares the original content of the string.
		 * It compares values of string for equality.
		 * 
		 * The == operator compares references not values. matlab Address dekhta naki
		 * Value
		 */

//		 String s1="Sachin";  
//		 String s2="Sachin";  
//		 String s3=new String("Sachin");  
//		 String s4="Saurav";  
//		 System.out.println(s1.equals(s2));//true  
//		 System.out.println(s1.equals(s3));//true  
//		 System.out.println(s1.equals(s4));//false  
		
		/*
		 * If we do null.equals("Shivam"); - It will give null pointer Exception
		 * Always do Like this - String str = "Shivam";
		 * str.equals(null); - FALSE
		 * Always use Static data on front and dynamic data on back side ,so that we can not leads to null
		 * pointer exception
		 */

		String s1 = "Sachin";
		String s3 = new String("Sachin");
		String s2 = "Sachin";
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)

		/*
		 * The String class compareTo() method compares values lexicographically and
		 * returns an integer value that describes if first string is less than, equal
		 * to or greater than second string.
		 * 
		 * Suppose s1 and s2 are two String objects. If:
		 * 
		 * s1 == s2 : The method returns 0. s1 > s2 : The method returns a positive
		 * value. s1 < s2 : The method returns a negative value.
		 */

//		String s1 = "Sachin";
//		String s2 = "Sachin";
//		String s3 = "Ratan";
//		System.out.println(s1.compareTo(s2));// 0
//		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
//		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )

		/*
		 * Java String intern() Method A pool of strings, initially empty, is maintained
		 * privately by the class String.
		 * 
		 * When the intern method is invoked, if the pool already contains a String
		 * equal to this String object as determined by the equals(Object) method, then
		 * the String from the pool is returned. Otherwise, this String object is added
		 * to the pool and a reference to this String object is returned.
		 */
	}

}
