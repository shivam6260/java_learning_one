package oop.Inheritance3;

class Animal {
	int food = 10;
	int power = 3;
	
	public Animal() {
		System.out.println("Animal Constructor Called");
	}
	
	public void bark() {
		System.out.println("Animal barking");
		System.out.println(this.food);
	}
	public void eat() {
		System.out.println("Animal eating...");
		System.out.println(this.food);
	}
	
	private void hiding() {
		System.out.println("Animal Private method");
	}
	
	public static void classConcept() {
		System.out.println("Animal Static Method");
	}
	
	public final void restrict() {
		System.out.println("Animal final method");
	}
} 

class Dog extends Animal {
	int water = 5;
	int gender = 1;
	
	public Dog() {
		System.out.println("Dog Constructor Called");
	}
	
	public void dogMehthod() {
		System.out.println("Dog normal method");
	}
	
	
	// This is not over-riding, this is Method Hiding
	public static void classConcept() {
		System.out.println("Dog Static Method");
	}
	
	// you can over-ride instance method and make it final
	public final void eat() {
		System.out.println("Dog eating...");
		System.out.println(this.water * 5);
	}
	
	public void bark() {
		System.out.println("Dog barking");
		System.out.println(this.food + " " + this.water );
	}
	
	// This method is not over-riding, This private method
	// belongs to Dog class only
	private void hiding() {
		System.out.println("Dog Private method");
	}
	
}

public class SingleInheritance6 {
	public static void main(String[] args) {
		
		Animal obj = new Dog();
		System.out.println(obj.food);
		System.out.println(obj.power);
		
		obj.bark();
		obj.eat();
		obj.classConcept();
		obj.restrict();
		
		/// Error = The method dogMehthod() is undefined for the type Animal
		// obj.dogMehthod();
		// System.out.println(obj.water);
		
//		Output
//		Animal Constructor Called
//		Dog Constructor Called
//		10
//		3
//		Dog barking
//		10 5
//		Dog eating...
//		25
//		Animal Static Method
//		Animal final method
		System.out.println();
		System.out.println();
		
		
		Dog obj1 = new Dog();
		System.out.println(obj1.water);
		System.out.println(obj1.gender);
		System.out.println(obj1.food);
		System.out.println(obj1.power);

		obj1.dogMehthod();
		
		///The method hiding() from the type Dog is not visible
		//obj1.hiding();
		
		obj1.classConcept();
		obj1.bark();
		obj1.eat();
		
		// Output
//		Animal Constructor Called
//		Dog Constructor Called
//		5
//		1
//		10
//		3
//		Dog normal method
//		Dog Static Method
//		Dog barking
//		10 5
//		Dog eating...
//		25
		
		
		
		
//		Animal obj = new Animal();
		// Both are same
//		Animal.classConcept();
//		obj.classConcept();
//		
//		obj.bark();
//		obj.eat();
		//error = The method hiding() from the type Animal is not visible
		//obj.hiding();
		
		// Output
//		Animal Constructor Called
//		Animal Static Method
//		Animal Static Method
//		Animal barking
//		10
//		Animal eating...
//		10

	}

}
