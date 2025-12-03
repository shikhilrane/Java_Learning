package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._05_CopyOnWriteArrayList.UnderstandingCOWAL;

import java.util.concurrent.CopyOnWriteArrayList;

public class Cowal {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");

        // Reading elements
        for (String item : list) {
            System.out.println(item);
        }

        // Safe iteration while modifying
        for (String item : list) {
            if (item.equals("B")) {
                list.remove("B");  // No ConcurrentModificationException
            }
        }

        System.out.println("After removal: " + list);
    }
}
