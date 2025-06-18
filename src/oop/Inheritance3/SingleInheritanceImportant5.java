package oop.Inheritance3;


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


public class SingleInheritanceImportant5 {
	public static void main(String[] args) {
		Shape obj = new Circle();
		System.out.println(obj.radius);
		System.out.println(obj.area());
		obj.cube();
		
		Circle obj1 = new Circle();
		System.out.println(obj1.radius);
		System.out.println(obj1.area());
		obj1.cube();
		

	}

}
