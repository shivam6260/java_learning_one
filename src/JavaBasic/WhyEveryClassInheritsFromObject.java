package JavaBasic;

public class WhyEveryClassInheritsFromObject {
    /*
    In Java:

    public class MyClass {
    }

    You didn’t write extends Object, but Java implicitly adds it for you.

    Behind the scenes, the compiler interprets it as:

    public class MyClass extends Object {
    }

    So, whether or not you write extends Object, it happens automatically unless you extend another class.

    🔍 How This Works
    1. Default Inheritance Rule in Java
    If you don’t explicitly extend any class, Java automatically extends java.lang.Object — the topmost class in Java’s class hierarchy.

    2. Java Compiler (javac) Handles It
    When the Java compiler (javac) compiles your class,
    it automatically sets the superclass to Object if you didn’t extend any class.


    🤔 What Happens When You Do Extend Another Class?

    public class MyChild extends MyParent {
    }

    Then MyChild does not extend Object directly,
    but MyParent (eventually) does. So every class still ends up with Object as the ultimate ancestor.

    💡 What Does Object Provide?
    The java.lang.Object class defines useful methods like:

    Method	Purpose
    toString()	        Textual representation of object
    equals(Object o)	Checks logical equality
    hashCode()	        Returns hash code of object
    getClass()	        Returns class info at runtime
    clone()	            Makes a field-for-field copy
    finalize()	        Cleanup before GC (deprecated)
    wait()/notify()	    Thread synchronization (multithreaded)

    Every Java object (even arrays) has access to these because all of them inherit from Object.
     */
}
