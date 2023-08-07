package StringInJava;

import java.util.*;
/*
 * The class must be declared as final so that child classes can’t be created.
 * Data members in the class must be declared private so that direct access is
 * not allowed. 
 * Data members in the class must be declared as final so that we
 * can’t change the value of it after object creation. 
 * A parameterized
 * constructor should initialize all the fields performing a deep copy so that
 * data members can’t be modified with an object reference. Deep Copy of objects
 * should be performed in the getter methods to return a copy rather than
 * returning the actual object reference)
 * There should be no setters or in simpler terms, there should be no option to change the value of the instance variable.
 * 
 */

final class Student {
	
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
 
    
    public Student(String name, int regNo,
                   Map<String, String> metadata)
    {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
             metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }
    public String getName() { return name; }
    public int getRegNo() { return regNo; }
   
    
    public Map<String, String> getMetadata()
    {
        Map<String, String> tempMap = new HashMap<>();
 
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

public class HowToCreateImmutableClass {
	public static void main(String[] args) {
		// Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();
 
        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");
 
        Student s = new Student("ABC", 101, map);
 
        // Calling the above methods 1,2,3 of class1
        // inside main() method in class2 and
        // executing the print statement over them
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());
 
        // Uncommenting below line causes error
        // s.regNo = 102;
 
        map.put("3", "third");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());

		

	}

}

