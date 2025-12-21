package _23_Collection_Framework._01_Collection_Interface._03_Set._05_CopyOnWriteArraySet;

// Thread safe
// Copy on write mechanism
// No duplication
// Iterators do not reflect modifications
// Same as CopyOnWriteArrayList

import java.util.concurrent.CopyOnWriteArraySet;

public class Cowas {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> copy = new CopyOnWriteArraySet<>();
        // Adding objects in
        copy.add(1);
        copy.add(2);
        copy.add(3);
        copy.add(4);
        copy.add(5);
        System.out.println(copy);

        // Performing Concurrent Operation
        for (Integer num : copy){
            System.out.println("Reading from copy :  " + num);
            // Attempting to modify set during operation
            copy.add(6);
        }

        System.out.println(copy);
    }
}