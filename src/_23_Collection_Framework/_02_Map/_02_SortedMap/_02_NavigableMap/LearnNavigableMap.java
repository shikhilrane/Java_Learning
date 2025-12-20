package _23_Collection_Framework._02_Map._02_SortedMap._02_NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class LearnNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(5,"five");
        navigableMap.put(1,"one");
        navigableMap.put(3,"three");
        System.out.println(navigableMap);

        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.higherKey(4));
        System.out.println(navigableMap.ceilingKey(4));
        System.out.println(navigableMap.floorKey(4));
        System.out.println(navigableMap.higherEntry(4));
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.keySet());
        System.out.println(navigableMap.descendingKeySet());
        System.out.println(navigableMap.descendingMap());

    }
}

/*
    1. NavigableMap is used to store and sort collection on basis of keys on basis of Natural ordering of keys (Comparable) or A custom order provided using a Comparator
    2. NavigableMap is not sorted by default, we have to apply some custom comparator or comparable to sort them but NavigableMap is sorted by default
    3. NavigableMap is an interface and its implementation class is TreeMap(). So, NavigableMap<String, Integer> map = new NavigableMap<>();
    4. NavigableMap has methods of Map, SortedMap(because it extends SortedMap) and some additional methods of Navigable maps

    NOTE : SortedMap = When we have to use first and last keys AND NavigableMap = When we have to use around keys of specified key
*/