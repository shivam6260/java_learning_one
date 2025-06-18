package oop.AccessModifiers2A;


public class PrivateAttribute {
    public static void main(String[] args) {
        /*
         * Private: The access level of a private modifier is only within the class. It
         * cannot be accessed from outside the class.
         *
         * Private Constructor -
         *
         * Role of Private Constructor If you make any class constructor private, you
         * cannot create the instance of that class from outside the class. For example:
         *
         * Top-level classes or interfaces can not be declared as private
         */
    }

}
/*
 * Private Method inherit nahi hota
 * Private method ko humlog dusre class sai call nahi kar sakte
 */

class Parent {
    public void print() {
        System.out.println("Print Parent");
    }

    private void msg() {
        System.out.println("Private method in Parent class");
    }

    private void msg(int a) {
        System.out.println("Private method");
    }
}

class Child extends Parent {
    // This is not over-riding
    private void msg() {
        System.out.println("Private method in Child class");
    }

    public static void main(String[] args) {
        Parent obj2 = new Parent();
        // Error not visible
        /// obj2.msg();

        Parent obj = new Child();
        //Error
        // Obj reference is of Parent ( during compile time msg method is private in Parent class so
        // we are getting error.
		///obj.msg();
		obj.print();

		Child obj1 = new Child();
		obj1.msg();

    }

}
