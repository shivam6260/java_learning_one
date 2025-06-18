package oop;

public class MethodInJava4 {
    static {
        System.out.println("In static block");
    }

    public static void main(int a) {
        System.out.println("Hello overloaded main");
    }

    public static void main(String[] args) {
        System.out.println("Hello main");
        MethodInJava4.main(5);
        /**
         Method in Java is a collection of instructions that performs a specific task.
         It provides the reusability of code.

         Method Signature: Every method has a method signature. It is a part of the method declaration.
         It includes the method name and parameter list.

         Access Specifier: Access specifier or modifier is the access type of the method.
         It specifies the visibility of the method. Java provides four types of access specifier:

         Public: The method is accessible by all classes when we use public specifier in our application.
         Private: When we use a private access specifier,
         the method is accessible only in the classes in which it is defined.
         Protected: When we use protected access specifier,
         the method is accessible within the same package or subclasses in a different package.
         Default: When we do not use any access specifier in the method declaration,
         Java uses default access specifier by default. It is visible only from the same package only.


         There are two types of methods in Java:

         Predefined Method In Java, predefined methods are the method that is already
         defined in the Java class libraries is known as predefined methods. It is
         also known as the standard library method or built-in method. Ex - Math.max

         User-defined Method The method written by the user or programmer is known as
         a user-defined method. These methods are modified according to the
         requirement.


         Static Method

         Static Method A method that has static keyword is known as static method. In
         other words, a method that belongs to a class rather than an instance of a
         class is known as a static method. We can also create a static method by
         using the keyword static before the method name.

         The main advantage of a static method is that we can call it without creating
         an object. It can access static data members and also change the value of it.
         It is invoked by using the class name. The best example of a static method is
         the main() method.



         Instance Method The method of the class is known as an instance method. It is
         a non-static method defined in the class. Before calling or invoking the
         instance method, it is necessary to create an object of its class.

         Abstract Method The method that does not has method body is known as abstract
         method. In other words, without an implementation is known as abstract
         method. It always declares in the abstract class. It means the class itself
         must be abstract if it has abstract method. To create an abstract method, we
         use the keyword abstract.


         MAIN Method in Java Detail Explanation
         * public: It is an access specifier. We should use a public keyword before the
         * main() method so that JVM can identify the execution point of the program. If
         * we use private, protected, and default before the main() method, it will not
         * be visible to JVM.
         * static: You can make a method static by using the keyword static. We should
         * call the main() method without creating an object. Static methods are the
         * method which invokes without creating the objects, so we do not need any
         * object to call the main() method.
         * void: In Java, every method has the return type. Void keyword acknowledges
         * the compiler that main() method does not return any value.
         * main(): It is a default signature which is predefined in the JVM. It is
         * called by JVM to execute a program line by line and end the execution after
         * completion of this method. We can also overload the main() method.
         * String args[]: The main() method also accepts some data from the user. It
         * accepts a group of strings, which is called a string array. It is used to
         * hold the command line arguments in the form of string values.
         *
         *
         */
    }

}
