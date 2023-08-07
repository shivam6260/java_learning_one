package oop.Interfaces;

public class Interface2 implements Inter3 {
	int power  = 100;
	public void eat() {
		System.out.println("eating..");
	}

	public void run() {
		System.out.println("running..");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		Inter2 obj = new Interface2();
		obj.run();
		obj.print();
		
		
		Inter3 obj1 = new Interface2();
		obj1.eat();
		obj1.run();
		obj1.msg();
		Inter3.move();
		
		
		Interface2 obj2 = new Interface2();
		obj2.msg();
		

	}
}
