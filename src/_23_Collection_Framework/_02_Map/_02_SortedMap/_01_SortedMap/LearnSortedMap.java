package _23_Collection_Framework._02_Map._02_SortedMap._01_SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class LearnSortedMap {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Stuart", 91);
        map.put("George", 99);
        map.put("Kevin", 78);
        map.put("Sam", 77);

        System.out.println(map); // It will print in ascending order of key (i.e. a to z)

        // SortedMap Methods
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Kevin"));   // Use to print entries from start to specified (i.e. specified object is exclusive)
        System.out.println(map.tailMap("Kevin"));   // Use to print entries from end to specified (i.e. specified object is inclusive)
        System.out.println(map.subMap("Kevin", "Stuart"));  // Last object is exclusive

        // Descending order
        SortedMap<String, Integer> map1 = new TreeMap<>((a, b) ->  b.compareTo(a));
        map1.put("Stuart", 91);
        map1.put("George", 99);
        map1.put("Kevin", 78);
        map1.put("Sam", 77);

        System.out.println(map1); // It will print in ascending order of key (i.e. z to a)
    }
}

/*
    TreeMap = Red-Black tree or Self-balancing binary search tree
    1. SortedMap is used to sort collection on basis of keys on basis of Natural ordering of keys (Comparable) or A custom order provided using a Comparator
    2. HashMap is not sorted by default, we have to apply some custom comparator or comparable to sort them but SortedMap is sorted by default
    3. SortedMap is an interface and its implementation class is TreeMap(). So, SortedMap<String, Integer> map = new TreeMap<>();

    NOTE : SortedMap = When we have to use first and last keys AND NavigableMap = When we have to use around keys of specified key
*/