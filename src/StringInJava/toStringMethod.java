package StringInJava;

class Student1 {
	int rollno;
	String name;
	String city;

	Student1(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {// overriding the toString() method
		return rollno + " " + name + " " + city;
	}
}

public class toStringMethod {
	public static void main(String[] args) {
		/*
		 * If you want to represent any object as a string, toString() method comes into
		 * existence.
		 * 
		 * The toString() method returns the String representation of the object. By
		 * overriding the toString() method of the Object class, we can return values of
		 * the object, so we don't need to write much code.
		 */

		Student1 s1 = new Student1(101, "Raj", "lucknow");
		Student1 s2 = new Student1(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}

}
