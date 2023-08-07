package oop.Inheritance;


class Shape {
	double radius = 5;

	double area() {
		return Math.pow(radius, 2);
	}
	
	void cube() {
		System.out.println(Math.pow(radius, 3));
	}
}

class Circle extends Shape {
	double radius = 10;

	double area() {
		return Math.pow(radius, 2);
	}
}


public class SingleInheritanceImportant {
	public static void main(String[] args) {
		Shape obj = new Circle();
		System.out.println(obj.radius);
		System.out.println(obj.area());
		obj.cube();
		
//		Circle obj = new Circle();
//		System.out.println(obj.radius);
//		System.out.println(obj.area()); // method of same class, radius = 10;
//		obj.cube(); // radius = 5
		
		/*
		 * Concept - 
		 * If it is a Over-riding method , then it is RUN_TIME 
		 * then Method and variable used are of object type
		 * 
		 * If it is same class or anything other than over-riding then it is COMPILE_TIME
		 * then Method and Variable used are of Reference type
		 */
	}

}
