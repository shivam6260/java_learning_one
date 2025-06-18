package oop.AccessModifiers2A;

public class DefaultAttributeA1 {
    /*
     * Default: The access level of a default modifier is only within the package.
     * It cannot be accessed from outside the package. If you do not specify any
     * access level, it will be the default.
     *
     * We can use package-private (default) access for classes, instance variables, and methods
     */

    public Integer age;
    String name;

    /// Normal Methods
    public void printPublic() {
        System.out.println("In Public method");
    }

    void printDefault() {
        System.out.println("In Default Method");
    }

    /// Static methods
    public static void printStaticPublic() {
        System.out.println("Public print Static Public");
    }

    static void printStaticDefault() {
        System.out.println("Default static method");
    }

    /// Final Methods
    public final void printFinalPublic() {
        System.out.println("Public print Static Public");
    }

    final void printFinalDefault() {
        System.out.println("Default static method");
    }


}

class DefaultCheck1 {

}
