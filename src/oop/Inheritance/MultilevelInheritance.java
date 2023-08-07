package oop.Inheritance;

class Baby {
	int age = 5;
	int bage = 10;

	public void print() {
		System.out.println("printing BABY");
	}

	public Baby() {
		System.out.println("calling baby constructor");
	}
}

class Teen extends Baby {
	int age = 20;
	int tage = 25;

	public void print() {
		System.out.println("printing TEEN");
	}

	public Teen() {
		System.out.println("calling Teen constructor");
	}
}

class Man extends Teen {
	int age = 40;
	int mage = 50;

	public void print() {
		System.out.println("printing MAN");
	}

	public Man() {
		System.out.println("calling Man constructor");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Baby obj = new Man();
		System.out.println(obj.age);
		obj.print();

	}

}


// Hierarchical Inheritance

//class Animal {
//	void eat() {
//		System.out.println("eating...");
//	}
//}
//
//class Dog extends Animal {
//	void bark() {
//		System.out.println("barking...");
//	}
//}
//
//class Cat extends Animal {
//	void meow() {
//		System.out.println("meowing...");
//	}
//}
//
//class TestInheritance3 {
//	public static void main(String args[]) {
//		Cat c = new Cat();
//		c.meow();
//		c.eat();
//		Animal obj = new Dog();
//		obj.eat();
//	}
//}
