package RandomPractice;

class Shape1 {
	double radius = 5;

	double area() {
		return Math.pow(radius, 2);
	}
	
	void cube() {
		System.out.println(Math.pow(radius, 3));
	}
	private void name() {
		System.out.println("naam");
	}
	
	public static void run()
	{
		System.out.println("Running");
	}
}

class Circle1 extends Shape1 {
	double radius = 10;
	private void name() {
		System.out.println("naam ciircle");
	}

	double area() {
		return Math.pow(radius, 2);
	}
//	public static void run()
//	{
//		System.out.println("Running Circle");
//	}
}

public class RP2 {
	public static void main(String[] args) {
//		Shape1 obj = new Circle1();
//		System.out.println(obj.radius);
//		System.out.println(obj.area());
//		obj.cube();
//		obj.run();
		
		Circle1 obj = new Circle1();
		
		System.out.println(obj.radius);
		System.out.println(obj.area());
		obj.cube();
		obj.run();
		
		StringBuffer sb = new StringBuffer("Shweta");
		
	}

}


