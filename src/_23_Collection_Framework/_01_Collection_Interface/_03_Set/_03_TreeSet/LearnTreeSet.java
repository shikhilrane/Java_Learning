package _23_Collection_Framework._01_Collection_Interface._03_Set._03_TreeSet;

// It uses Binary Search Tree internally, and sets all element in ascending order.
// It is implementation of SortedSet Interface

import java.util.*;

public class LearnTreeSet {
    public static void main(String[] args) {
        // TreeSet = SortedSet that stores elements in ascending (natural) order
        SortedSet<Integer> set = new TreeSet<>();

        // add() – Adds elements to the TreeSet (duplicates automatically ignored)
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(70);
        set.add(30);
        set.add(40);

        System.out.println("Initial TreeSet: " + set);  // Output: [10, 20, 30, 40, 50, 70]

        // addAll() – Adds all elements from another collection
        List<Integer> extraNumbers = Arrays.asList(5, 60, 90);
        set.addAll(extraNumbers);
        System.out.println("After addAll(extraNumbers): " + set);  // Automatically sorted

        // contains() – Checks if a specific element is present
        System.out.println("Contains 20? " + set.contains(20));

        // containsAll() – Checks if all elements from a collection exist
        System.out.println("Contains all extra numbers? " + set.containsAll(extraNumbers));

        // remove() – Removes a specific element
        set.remove(20);
        System.out.println("After remove(20): " + set);

        // removeAll() – Removes all elements from a collection
        set.removeAll(Arrays.asList(5, 90));
        System.out.println("After removeAll([5, 90]): " + set);

        // retainAll() – Keeps only elements that exist in provided collection
        set.retainAll(Arrays.asList(10, 30, 50));  // Keeps only these
        System.out.println("After retainAll([10, 30, 50]): " + set);

        // size() – Number of elements in the set
        System.out.println("Set size: " + set.size());

        // isEmpty() – Checks if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // iterator() – Iterates over elements
        System.out.println("Iterating using iterator():");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // toArray() – Converts set to Object[]
        Object[] array = set.toArray();
        System.out.println("First element in toArray(): " + array[0]);

        // toArray(T[] a) – Converts set to typed array
        Integer[] intArray = set.toArray(new Integer[0]);
        System.out.println("Array using toArray(T[]): " + Arrays.toString(intArray));

        // spliterator() – For advanced/parallel iteration
        System.out.println("Using spliterator():");
        Spliterator<Integer> spliterator = set.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // clear() – Empties the set
        set.clear();
        System.out.println("After clear(), is set empty? " + set.isEmpty());
    }
}
