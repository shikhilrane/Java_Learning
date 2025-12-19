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