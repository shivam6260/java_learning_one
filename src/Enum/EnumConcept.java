package Enum;

enum Color {
	RED, GREEN, BLUE;
}

public class EnumConcept {
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1);

		/*
		 * Enumerations serve the purpose of representing a group of named constants in
		 * a programming language. For example like the planets, days of the week,
		 * colors, directions, etc.
		 * 
		 * Declaration of enum in Java: Enum declaration can be done outside a Class or
		 * inside a Class but not inside a Method.
		 * 
		 * Every enum constant is always implicitly public static final. Since it is
		 * static, we can access it by using the enum Name. Since it is final, we can’t
		 * create child enums. We can declare the main() method inside the enum. Hence
		 * we can invoke enum directly from the Command Prompt.
		 * 
		 * All enums implicitly extend java.lang.Enum class. As a class can only extend
		 * one parent in Java, so an enum cannot extend anything else. toString() method
		 * is overridden in java.lang.Enum class, which returns enum constant name. enum
		 * can implement many interfaces.
		 * 
		 * 
		 */
	}

}
/*
 * Every enum is internally implemented by using Class. internally above enum
 * Color is converted to
 * 
 * class Color
 * 
 * {
 * 
 * public static final Color RED = new Color();
 * 
 * public static final Color BLUE = new Color();
 * 
 * public static final Color GREEN = new Color();
 * 
 * }
 * 
 * Every enum constant represents an object of type enum. enum type can be
 * passed as an argument to switch statements.
 */
