package _23_Collection_Framework._01_Collection_Interface._02_Set._07_ImmutableSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LearnImmutableSet {
    public static void main(String[] args) {

        // 1. Creating UnmodifiableSet
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");

        Set<String> set2 = Collections.unmodifiableSet(set1);
        System.out.println(set2);

        // set2.add("C");   // write operation not allowed
        // Problem: if original set is modified, unmodifiable set is affected
        set1.add("D");
        System.out.println("After modifying set1: " + set2);

        // 2. Creating Set.of(...)  (Java 9+)
        // Clean way to create immutable set
        // Limitation: max 10 elements
        Set<String> set3 = Set.of("E", "F");
        System.out.println(set3);

        // 3. Creating Set.of(...) with more elements
        // No limit on elements (varargs)
        Set<String> set4 = Set.of(
                "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q"
        );
        System.out.println(set4);
    }
}

/*
    1. ImmutableSet means we cannot add, remove, or modify elements after creation
    2. Collections.unmodifiableSet() creates an unmodifiable view of an existing set
       → changes in original set will reflect in unmodifiable set
    3. Set.of(...) creates a truly immutable set (Java 9+)
    4. Set.of(...) does not allow duplicate elements (throws Exception)
    5. Set.of(...) does not allow null values
*/