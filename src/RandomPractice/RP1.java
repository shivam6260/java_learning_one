package RandomPractice;

abstract class Shape {
	String color;
	double radius = 5;

	abstract double area();

	public abstract String toString();

	public Shape(String color,double radius) {
		System.out.println("Shape constructor called");
		this.color = color;
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	double radius = 5;

	public Circle(String color, double radius) {
		super(color,radius);
		System.out.println("Circle constructor called");
		//this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.getColor() + "and area is : " + area();
	}
}


public class RP1 {
	public static void main(String[] args) {
		Shape s1 = new Circle("Red", 2);
		System.out.println(s1.getColor());
		System.out.println(s1.radius);
		System.out.println(s1.area());
	}

}
