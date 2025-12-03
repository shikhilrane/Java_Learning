package _23_Collection_Framework._02_Map._01_HashMap;

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        // Creating a HashMap of Integer keys and StringClass values
        HashMap<Integer, String> hashmap = new HashMap<>();

        // put – Adds key-value pairs
        hashmap.put(1, "A");
        hashmap.put(2, "B");
        hashmap.put(3, "C");
        hashmap.put(4, "D");
        hashmap.put(5, "E");

        System.out.println("Original HashMap: " + hashmap);

        // containsKey – Checks if key 3 exists
        System.out.println("Contains key 3? " + hashmap.containsKey(3));

        // containsValue – Checks if value "D" exists
        System.out.println("Contains value 'D'? " + hashmap.containsValue("D"));

        // get – Gets value for key 4
        System.out.println("Value at key 4: " + hashmap.get(4));

        // getOrDefault – Gets value for key 10, or returns default if not found
        System.out.println("Get value at key 10 or return default: " + hashmap.getOrDefault(10, "Not Found"));

        // keySet – Returns all keys
        System.out.println("All keys: " + hashmap.keySet());

        // values – Returns all values
        System.out.println("All values: " + hashmap.values());

        // entrySet – Returns all key-value pairs
        System.out.println("All entries: " + hashmap.entrySet());

        // replace(key, value) – Replaces value at key 3
        hashmap.replace(3, "CCC");
        System.out.println("After replacing value at key 3: " + hashmap);

        // replace(key, oldValue, newValue) – Replaces value only if old value matches
        hashmap.replace(2, "B", "BB");
        System.out.println("After replacing value at key 2 if old value is 'B': " + hashmap);

        // compute – Updates value at key 3 by applying a function
        hashmap.compute(3, (k, v) -> v + v);
        System.out.println("After compute at key 3: " + hashmap);

        // computeIfAbsent – Adds value for key 6 if it's absent
        hashmap.computeIfAbsent(6, k -> "F");
        System.out.println("After computeIfAbsent on key 6: " + hashmap);

        // computeIfPresent – Updates value for key 1 if it's present
        hashmap.computeIfPresent(1, (k, v) -> v + "1");
        System.out.println("After computeIfPresent on key 1: " + hashmap);

        // merge – Merges new value with existing at key 4
        hashmap.merge(4, "DD", (oldVal, newVal) -> oldVal + "-" + newVal);
        System.out.println("After merging value at key 4: " + hashmap);

        // remove – Removes key 5
        hashmap.remove(5);
        System.out.println("After removing key 5: " + hashmap);

        // size – Number of entries in map
        System.out.println("Size of HashMap: " + hashmap.size());

        // isEmpty – Checks if map is empty
        System.out.println("Is the HashMap empty? " + hashmap.isEmpty());

        // forEach – Loops through all entries
        System.out.println("Using forEach:");
        hashmap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        // clone – Creates a shallow copy of the map
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) hashmap.clone();
        System.out.println("Cloned map: " + clonedMap);

        // Loop on HashMap
        Set<Integer> keys = hashmap.keySet();   // It will return set of keys
        for (int i : keys){
            System.out.println(i);              // It will give keys
            System.out.println(hashmap.get(i)); // It will give values of keys
            System.out.println(i + " : " + hashmap.get(i));     // This will give key value together
        }
        Collection<String> values = hashmap.values();
        for (String val : values) {
            System.out.println("Interating over values : " + val);
        }
        // Another way to apply loop in hashmap
        Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();
        for (Map.Entry<Integer, String> i : entries){
            System.out.println(i.getKey() + " : " + i.getValue());
        }
        // To change the value to lowercase
        for (Map.Entry<Integer, String> i : entries){
            i.setValue(i.getValue().toLowerCase());
        }
        System.out.println(hashmap);

        // To delete
        hashmap.remove(3);
        hashmap.remove(5,"E");
        System.out.println(hashmap);

        // clear – Removes all entries
        hashmap.clear();
        System.out.println("After clearing, is HashMap empty? " + hashmap.isEmpty());
    }
}