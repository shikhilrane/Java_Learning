package _23_Collection_Framework._02_Map._01_HashMap._01_LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LearnLinkedHashMap {
    public static void main(String[] args) {
        // 1. HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Orange", 10);
        hm.put("Apple", 20);
        hm.put("Guava", 13);

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> str : entries){
            System.out.println("HashMap : " + str);
        }
        // There is no order of execution in Hashmap

        // 2. LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Orange", 10);
        lhm.put("Apple", 20);
        lhm.put("Guava", 13);

        Set<Map.Entry<String, Integer>> entriesLhm = lhm.entrySet();
        for (Map.Entry<String, Integer> str : entriesLhm){
            System.out.println("LinkedHashMap : " + str);
        }
        // There is order of execution in LinkedHashMap

        // 2.1 initialCapacity, loadFactor and, true=accessOrder and false=insertionOrder in constructor of LinkedHashMap
        LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<>(20, 0.5f, true);
        lhm1.put("Orange", 10);
        lhm1.put("Apple", 20);
        lhm1.put("Guava", 13);

        Set<Map.Entry<String, Integer>> entriesLhm1 = lhm1.entrySet();
        for (Map.Entry<String, Integer> str : entriesLhm1){
            System.out.println("From Constructor of LinkedHashMap : " + str);
        }

        lhm1.get("Apple");

        Set<Map.Entry<String, Integer>> entriesLhm11 = lhm1.entrySet();
        for (Map.Entry<String, Integer> str : entriesLhm11){
            System.out.println("Accessing after lhm1.get(\"Apple\"); method From Constructor of LinkedHashMap : " + str);
        }

        // Apple=20 goes last because
        // we set true in constructor of the lhm1,
        //  if it is false (if we didn't set in explicitly then it is by default false) then it will maintain the insertion order even after accessing any object from LinkedHashMap,
        //  but if we set it as true, then it will maintain access order, means latest access object will goes in the last of the of execution.
        //  It follows algorithm Least Recently Used (LRU) algorithm
    }
}

/*
    1. LinkedHashMap is an implementation class of HashMap
    2. Difference - LinkedHashMap maintains the order of insertion while HashMap does not maintain the order of insertion
*/
