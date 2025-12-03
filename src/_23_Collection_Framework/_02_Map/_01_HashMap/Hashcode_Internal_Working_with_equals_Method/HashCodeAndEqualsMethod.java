package _23_Collection_Framework._02_Map._01_HashMap.Hashcode_Internal_Working_with_equals_Method;

import java.util.HashMap;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        // Indexing for "OBJECT AS KEY"
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);
        map.put(p1, "Engineer");    // Hashcode1 --> index1
        map.put(p2, "Designer");    // Hashcode2 --> index2
        map.put(p3, "Manager");     // Hashcode3 --> index3, here nothing will be changed because p1 and p3 both are created at different location using new keyword

        // Indexing for "OBJECT AS KEY"
        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("Mumbai", 200);  // Hashcode1 --> index1
        newMap.put("Pune", 300);    // Hashcode2 --> index2
        newMap.put("Mumbai", 400);  // Hashcode1 --> index1 --> equals() --> replace with first "Mumbai", It checks value, and if exist then replace it

    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
