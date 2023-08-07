package oop.AccessModifiersA1;

class DefaultAttributeA1 {
	/*
	 * Default: The access level of a default modifier is only within the package.
	 * It cannot be accessed from outside the package. If you do not specify any
	 * access level, it will be the default.
	 */

	public void checkingDefault() {
		System.out.println("In default Method, in default class");
	}

	public static void main(String[] args) {

	}

}
