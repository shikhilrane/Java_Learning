package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._05_CopyOnWriteArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LearnCopyOnWriteArrayList {
    public static void main(String[] args) {
        // Creating a CopyOnWriteArrayList (Thread-safe variant of ArrayList)
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // ------------------------ Collection Interface Methods ------------------------

        System.out.println("=== Collection Interface Methods ===");

        // 1. add(E element) – Adds element to the list
        list.add("A");
        list.add("B");
        list.add("1");

        // 2. addAll(Collection<? extends E>) – Adds a collection of elements to the list
        list.addAll(Arrays.asList("C", "D"));

        // 3. remove(Object o) – Removes specific element from the list
        list.remove("B");
        System.out.println("After removing 'B': " + list);  // Output: [A, 1, C, D]

        // remove(int index) – Removes element at specified index
        list.remove(1);
        System.out.println("After removing index 1: " + list);  // Output: [A, C, D]

        // Demonstration with Integer list
        CopyOnWriteArrayList<Integer> intList = new CopyOnWriteArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        // remove by index
        intList.remove(0);
        System.out.println("After removing by Index: " + intList);  // [2, 3, 4]

        // remove by value
        intList.remove(Integer.valueOf(3));
        System.out.println("After removing by Value: " + intList);  // [2, 4]

        // 4. removeAll(Collection<?>) – Removes all elements that exist in another collection
        list.removeAll(Arrays.asList("D"));
        System.out.println("List after removing all elements matching 'D': " + list);  // [A, C]

        // 5. retainAll(Collection<?>) – Retains only the elements that are also in the given collection
        list.retainAll(Arrays.asList("A", "C"));
        System.out.println("List after retaining A and C: " + list);  // [A, C]

        // 6. contains(Object o) – Checks if element exists
        System.out.println("Contains 'A': " + list.contains("A"));

        // 7. containsAll(Collection<?>) – Checks if all elements of given collection exist
        System.out.println("Contains all [A, C]: " + list.containsAll(Arrays.asList("A", "C")));

        // 8. isEmpty() – Checks if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 9. size() – Returns number of elements in list
        System.out.println("Size of list: " + list.size());

        // 10. iterator() – Gets iterator to loop over list
        System.out.print("Iterating: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. toArray() – Converts list to Object array
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 12. <T> T[] toArray(T[] a) – Converts list to typed array
        String[] strArr = list.toArray(new String[0]);
        System.out.println("Typed array: " + Arrays.toString(strArr));

        // 13. clear() – Removes all elements from list
        list.clear();
        System.out.println("Cleared list: " + list);

        // ------------------------ List Interface Methods ------------------------

        System.out.println("\n=== List Interface Methods ===");

        // Re-adding elements for further operations
        list.add("X");
        list.add("Y");
        list.add("Z");

        // 1. add(int index, E element) – Inserts element at specific index
        list.add(1, "A"); // X, A, Y, Z

        // 2. addAll(int index, Collection<?>) – Adds collection starting at specific index
        list.addAll(2, Arrays.asList("B", "C"));
        System.out.println(list);  // [X, A, B, C, Y, Z]

        // 3. get(int index) – Gets element at index
        System.out.println("Element at index 3: " + list.get(3));

        // 4. set(int index, E element) – Replaces element at index
        list.set(3, "M");
        System.out.println("List after setting M at index 3: " + list);

        // 5. remove(int index) – Removes element at index
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        // 6. indexOf(Object o) – Gets first occurrence index
        System.out.println("Index of A: " + list.indexOf("A"));

        // 7. lastIndexOf(Object o) – Gets last occurrence index
        list.add("X");
        System.out.println("Last index of X: " + list.lastIndexOf("X"));

        // 8. listIterator() – Returns list iterator
        System.out.print("ListIterator: ");
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        // 9. listIterator(int index) – List iterator starting at given index
        System.out.print("ListIterator from index 2: ");
        ListIterator<String> liFrom2 = list.listIterator(2);
        while (liFrom2.hasNext()) {
            System.out.print(liFrom2.next() + " ");
        }
        System.out.println();

        // 10. subList(int fromIndex, int toIndex) – Extracts sublist
        List<String> sub = list.subList(1, 4);
        System.out.println("Sublist (1–4): " + sub);

        // 11. equals(Object o) – Compares two lists
        CopyOnWriteArrayList<String> other = new CopyOnWriteArrayList<>(list);
        System.out.println("Equals another list? " + list.equals(other));

        // 12. hashCode() – Returns hash of the list
        System.out.println("Hash code: " + list.hashCode());

        // ------------------------ CopyOnWriteArrayList-Specific Behavior ------------------------

        System.out.println("\n=== CopyOnWriteArrayList-Specific Behavior ===");

        // Demonstrating safe concurrent modification
        System.out.println("Safe concurrent modification during iteration:");
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>(list);
        for (String s : cowList) {
            System.out.print(s + " ");
            if (s.equals("Y")) {
                cowList.add("ThreadSafeAdd"); // No ConcurrentModificationException
            }
        }
        System.out.println("\nAfter concurrent-safe iteration: " + cowList);

        // Demonstrating non-fail-fast behavior
        try {
            Iterator<String> cowIt = cowList.iterator();
            while (cowIt.hasNext()) {
                String val = cowIt.next();
                if (val.equals("M")) {
                    cowList.remove(val); // Allowed in CopyOnWriteArrayList
                }
            }
            System.out.println("Successfully modified during iteration (no exception): " + cowList);
        } catch (ConcurrentModificationException e) {
            System.out.println("Concurrent modification detected!");
        }

        // ------------------------ Functional Utilities (Java 8+) ------------------------

        System.out.println("\n=== Functional Utilities (removeIf, replaceAll, sort) ===");

        CopyOnWriteArrayList<String> funcList = new CopyOnWriteArrayList<>(Arrays.asList("dog", "cat", "cow", "car", "cup"));

        // removeIf(Predicate) – Removes elements that match condition
        funcList.removeIf(s -> s.startsWith("_02_Stream"));
        System.out.println("After removeIf(startsWith '_02_Stream'): " + funcList);  // [dog]

        // add more elements
        funcList.addAll(Arrays.asList("bat", "ant", "elephant"));

        // replaceAll(UnaryOperator) – Replace each element using a function
        funcList.replaceAll(String::toUpperCase);
        System.out.println("After replaceAll(toUpperCase): " + funcList);  // [DOG, BAT, ANT, ELEPHANT]

        // sort(Comparator) – Sorts the list in natural order
        funcList.sort(Comparator.naturalOrder());
        System.out.println("After sort(): " + funcList);  // [ANT, BAT, DOG, ELEPHANT]

        // Final output
        System.out.println("\nFinal list: " + list);
        System.out.println("Final funcList: " + funcList);
    }
}
