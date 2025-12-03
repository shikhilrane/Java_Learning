package _23_Collection_Framework._01_Collection_Interface._03_Set._01_HashSet;

// HashSet executes number in random order
// It generates hashcode for every single element in the set and store it in hashtable. And as we know HashCode must not be equal for two elements. So we use it in Set

import java.util.*;

public class LearnHashSet {
    public static void main(String[] args) {
        // Creating a HashSet with some integers (duplicates ignored automatically)
        Set<Integer> set = new HashSet<>();
        set.add(10);  // add() - adds element to set, returns false if duplicate
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(70);
        set.add(30);
        set.add(40);
        System.out.println(set);    // Prints set with random-ordered elements

        // addAll() - adds all elements from given collection
        List<Integer> extraNumbers = Arrays.asList(60, 80, 90);
        set.addAll(extraNumbers);

        // contains() - checks if element is present
        System.out.println("Contains 20? " + set.contains(20));

        // containsAll() - checks if all elements from collection exist in set
        System.out.println("Contains all extra numbers? " + set.containsAll(extraNumbers));

        // remove() - removes specified element, returns true if removed
        set.remove(20);

        // removeAll() - removes all elements present in given collection
        set.removeAll(Arrays.asList(60, 90));

        // retainAll() - retains only elements present in given collection; removes others
        set.retainAll(Arrays.asList(10, 30, 50));

        // size() - returns number of elements in set
        System.out.println("Set size: " + set.size());

        // isEmpty() - checks if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // iterator() - returns iterator to traverse elements
        System.out.println("Iterating using iterator():");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // toArray() - converts set to Object array
        Object[] array = set.toArray();
        System.out.println("First element in toArray(): " + array[0]);

        // toArray(T[] a) - converts set to typed array (Integer array here)
        Integer[] intArray = set.toArray(new Integer[0]);
        System.out.println("Array using toArray(T[]): " + Arrays.toString(intArray));

        // spliterator() - returns a Spliterator to traverse elements, supports parallelism
        System.out.println("Using spliterator():");
        Spliterator<Integer> spliterator = set.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // clear() - removes all elements from set
        set.clear();
        System.out.println("After clear(), is set empty? " + set.isEmpty());
    }
}
