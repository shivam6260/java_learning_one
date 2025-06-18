package oop.AccessModifiers2B;

import oop.AccessModifiers2A.DefaultAttributeA1;

public class DefaultAttributeA2 {

    public static void main(String[] args) {
        DefaultAttributeA1 obj = new DefaultAttributeA1();
        obj.printPublic();

        /// Error
        //obj.printDefault();

        System.out.println(obj.age);

        /// error
        //System.out.println(obj.name);

        /// Error
        //DefaultCheck1 obj2 = new DefaultCheck1();

        DefaultAttributeA1.printStaticPublic();

        /// Error
        //DefaultAttributeA1.printStaticDefault();

        obj.printFinalPublic();

        /// Error
        //obj.printFinalDefault();
    }
}
