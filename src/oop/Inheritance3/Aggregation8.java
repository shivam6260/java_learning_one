package oop.Inheritance3;

public class Aggregation8 {
    public static void main(String[] args) {
        /**
         Aggregation represents HAS-A relationship.

         When use Aggregation?
         Code reuse is also best achieved by aggregation when there is no is-a relationship.
         Inheritance should be used only if the relationship is-a is maintained
         throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.

         Example -
         */
    }
}

class Operation {
    int square(int n) {
        return n * n;
    }
}

class Circle1 {
    Operation op;
    /// aggregation (HAS-A Relationship)
    double pi = 3.14;

    public static void main(String[] args) {
        Circle1 c = new Circle1();
        double result = c.area(5);
        System.out.println(result);
    }

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius);//code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }
}


/// Real World Example -

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp {
    int id;
    String name;
    Address address;  //Emp Has-A Address

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Noida", "UP", "india");
        Emp e = new Emp(111, "Alice", address1);
        e.display();
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}