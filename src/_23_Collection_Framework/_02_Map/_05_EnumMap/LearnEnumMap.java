package _23_Collection_Framework._02_Map._05_EnumMap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class LearnEnumMap {
    public static void main(String[] args) {
        HashMap<Day, String> hashMap = new HashMap<>();

        Map<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.THURSDAY, "Gym");
        enumMap.put(Day.MONDAY, "Walk");

        String s = enumMap.get(Day.MONDAY);
        System.out.println(s);

        System.out.println(enumMap);

        System.out.println(Day.SATURDAY.ordinal());     // ordinal is the index of enum elements

    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

/*
    1. We can use HashMap to implement Enum, but it is recommended to use EnumMap if we are using single Enum
    2. EnumMap knows the all the possible keys in advance of Enum. Because It will know the number of entries from enum so there will be no resizing
    3. So EnumMap will directly put values on the index of element of enum and so there will be no need of Hashing here
    4. Array of size Enum same as enum
    5. Create an array like ["Walk" , _ , _ , "Gym", _ , _ , _]  from above example
    6. No hashing
    7. ordinal or index is used
    8. Faster than HashMap
    9. memory Efficient
 */