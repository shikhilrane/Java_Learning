package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._05_CopyOnWriteArrayList.UnderstandingCOWAL;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cowal {
    public static void main(String[] args) {
        // Modifications while reading ArrayList
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Milk");
        arraylist.add("Egg");
        arraylist.add("Bread");

        for (String item : arraylist){
            System.out.println(item);
//            if (item.equals("Egg")){                              // It will give exception because it doesn't allow to write anything while reading
//                arraylist.add("Butter");
//                System.out.println("Added Butter while reading");
//            }
        }

        // Modifications while reading CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");

        // Reading elements
        for (String item : list) {
            System.out.println(item);
        }

        // Modifying list while Reading elements
        for (String item : list) {
            if (item.equals("B")) {
                list.remove("B");  // No ConcurrentModificationException
            }
        }

        System.out.println("After removal: " + list);
    }
}

// 'Copy On Write' means that whenever a write operation like adding or removing an element
// Instead of directly modifying the existing list, a new copy of list is created and modification is applied to that copy
// This ensures that other thread reading the list while its being modified are unaffected.

// Read Operations : Fast and direct, since they have happened on stable list without interference from modifications
// Write Operations : A new copy of list is created for every modification, The reference to the list is then updated so that subsequent reads this new list

// CopyOnWriteArrayList is used when write operations are less and read operations are more, because it consumes more memory as it create ArrayList for every modification