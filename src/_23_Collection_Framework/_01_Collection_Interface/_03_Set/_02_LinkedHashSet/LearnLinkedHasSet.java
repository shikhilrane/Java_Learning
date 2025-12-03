package _23_Collection_Framework._01_Collection_Interface._03_Set._02_LinkedHashSet;

// LinkedHashSet executes number in random order of input. It internally use LL and as we know LL has ordered way to store data

import java.util.*;

public class LearnLinkedHasSet {
    public static void main(String[] args) {
        // LinkedHashSet maintains insertion order and doesn't allow duplicates
        Set<Integer> set = new LinkedHashSet<>();

        // add() – Adds elements (duplicates will be ignored)
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(70);
        set.add(30);
        set.add(40);

        System.out.println("Initial set: " + set);  // Output: [10, 20, 50, 70, 30, 40]

        // addAll() – Adds all elements from another collection
        List<Integer> extraNumbers = Arrays.asList(60, 80, 90);
        set.addAll(extraNumbers);
        System.out.println("After addAll(extraNumbers): " + set);

        // contains() – Checks if a specific element exists
        System.out.println("Contains 20? " + set.contains(20));

        // containsAll() – Checks if all elements from a collection exist
        System.out.println("Contains all extra numbers? " + set.containsAll(extraNumbers));

        // remove() – Removes a specific element
        set.remove(20);
        System.out.println("After remove(20): " + set);

        // removeAll() – Removes all elements from the given collection
        set.removeAll(Arrays.asList(60, 90));
        System.out.println("After removeAll([60, 90]): " + set);

        // retainAll() – Keeps only elements that are also in the given collection
        set.retainAll(Arrays.asList(10, 30, 50));  // Keeps only 10, 30, 50
        System.out.println("After retainAll([10, 30, 50]): " + set);

        // size() – Returns number of elements in the set
        System.out.println("Set size: " + set.size());

        // isEmpty() – Checks if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // iterator() – Allows iteration over the set
        System.out.println("Iterating using iterator():");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // toArray() – Converts set to Object[]
        Object[] array = set.toArray();
        System.out.println("First element in toArray(): " + array[0]);

        // toArray(T[] a) – Converts set to specific type array
        Integer[] intArray = set.toArray(new Integer[0]);
        System.out.println("Array using toArray(T[]): " + Arrays.toString(intArray));

        // spliterator() – Returns a Spliterator for traversal
        System.out.println("Using spliterator():");
        Spliterator<Integer> spliterator = set.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // clear() – Removes all elements from the set
        set.clear();
        System.out.println("After clear(), is set empty? " + set.isEmpty());
    }
}
