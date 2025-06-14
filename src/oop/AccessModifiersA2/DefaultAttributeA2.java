package oop.AccessModifiersA2;

import oop.AccessModifiersA1.*;

public class DefaultAttributeA2 {

    public static void main(String[] args) {

        // The thing is simple , class or method is default it is not visible
        // in other packages

		/*
		We can use package-private (default) access for classes, instance variables, and methods
		We can use public modifier for Class , Instance Variable and Methods
		 */

        // 1st case
        // oop.AccessModifiersA1, DefaultAttributeA1 Class bhi default and
        // method bhi default.

        // Object is not created because the class is not visible
        // in other package
        //   DefaultAttributeA1 obj = new DefaultAttributeA1();

        // 2nd Case
        // oop.AccessModifiersA1, DefaultAttributeA1 Class public hai and
        // method default hai.
        // Obj to ban jayega class public hai toh
        // DefaultAttributeA1 obj = new DefaultAttributeA1();

        // Error - The method checkingDefault() from the type DefaultAttributeA1 is not
        // visible
        // obj.checkingDefault();

        // 3rd case
        // Class - default
        // Method Public
        // No object will created , because class is default so no use of public method
//		DefaultAttributeA1 obj = new DefaultAttributeA1();
//		obj.checkingDefault();
    }
}
