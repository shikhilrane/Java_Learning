package _23_Collection_Framework._02_Map._06_ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LearnImmutableMap {
    public static void main(String[] args) {
        // 1. Creating UnmodifiableMap
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
        // map2.put("C", 3);     // write operation can't be done here
        // If we added something in map1 by mistake then things will get messy
        map1.put("D", 4);

        // 2. Creating Map.of(k1,v1, ....... , k10, v10) (More clean way to write code)
        // So to overcome this issue, Java9 has introduced Map.of method
        // It is a clean way to create immutable map
        // Limitation : It can only have 10 objects in it
        Map<String, Integer> map3 = Map.of("E", 5, "F", 6);

        // 3. Creating Map.ofEntries(Map.entry(), .......);
        // We can add as many as objects in it
        Map<String, Integer> map4 = Map.ofEntries( Map.entry("G", 7), Map.entry("H", 8));


    }
}

/*
    1. ImmutableMap means we can't change/modify, add, remove the content of the map once it is instantiated
    2. It is another view of our existing map that will be unmodifiable
    3. We use Collection.unmodifiableMap(); method to create an unmodifiable copy of our original map
    4. We use Map.of(k1,v1, ....... , k10, v10) to create clean unmodifiable map. But it can only have 10 entries
    5. We use Map.ofEntries(Map.entry(), .......); to create clean unmodifiable map. It can have unlimited entries
 */
