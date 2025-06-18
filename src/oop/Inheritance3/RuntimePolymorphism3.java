package oop.Inheritance3;

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class ICICI extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class AXIS extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class RuntimePolymorphism3 {
	public static void main(String args[]) {
		Bank b;
		b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());

	}
	/*
	 * A method is overridden, not the data members, so runtime polymorphism can't
	 * be achieved by data members.
	 */

}

class Bike {
	int speedlimit = 90;
	
	public void print() {
		System.out.println(this.speedlimit);
	}
}

class Honda3 extends Bike {
	int speedlimit = 150;
	
	public void print() {
		System.out.println(this.speedlimit);
	}

	public static void main(String args[]){
	  	Bike obj=new Honda3();
	  	System.out.println(obj.speedlimit);/// 90
	  	obj.print();/// 150

		Honda3 obj2 = new Honda3();
		System.out.println(obj2.speedlimit);/// 150

	}
}
