package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._02_LinkedList;

import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args) {
        // LinkedList object
        LinkedList<String> list = new LinkedList<>();

        // ------------------------ Collection Interface Methods ------------------------

        System.out.println("=== Collection Interface Methods ===");

        // 1. add(E element) – Adds element to end of list
        list.add("A");
        list.add("B");
        list.add("1");

        // 2. addAll(Collection<? extends E> _02_Stream) – Adds all elements from collection to list
        list.addAll(Arrays.asList("C", "D"));

        // 3. remove(Object o) – Removes first occurrence of the specified element
        list.remove("B");
        System.out.println("After removing 'B': " + list);  // Output: [A, C, D]

        // remove(int index) – Removes element at specified index
        list.remove(1);
        System.out.println("After removing index 1: " + list);  // Output: [A, D]

        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        // remove by index
        intList.remove(0);
        System.out.println("After removing by Index: " + intList);

        // remove by value
        intList.remove(Integer.valueOf(3));
        System.out.println("After removing by Value: " + intList);

        // 4. removeAll(Collection<?> _02_Stream) – Removes all matching elements from list
        list.removeAll(Arrays.asList("D"));
        System.out.println("List after removing all element that matches with D: " + list);

        // 5. retainAll(Collection<?> _02_Stream) – Keeps only elements present in specified collection
        list.retainAll(Arrays.asList("A", "C"));
        System.out.println("List after retaining elements that match A and C: " + list);

        // 6. contains(Object o) – Checks if element exists in list
        System.out.println("Contains 'A': " + list.contains("A"));

        // 7. containsAll(Collection<?> _02_Stream) – Checks if list contains all elements of the collection
        System.out.println("Contains all [A, C]: " + list.containsAll(Arrays.asList("A", "C")));

        // 8. isEmpty() – Returns true if list has no elements
        System.out.println("Is list empty? " + list.isEmpty());

        // 9. size() – Returns number of elements in list
        System.out.println("Size of list: " + list.size());

        // 10. iterator() – Returns iterator to traverse list
        System.out.print("Iterating: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. toArray() – Converts list to array of Objects
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

        list.add("X");
        list.add("Y");
        list.add("Z");

        // 1. add(int index, E element) – Inserts element at specified index
        list.add(1, "A"); // X, A, Y, Z

        // 2. addAll(int index, Collection<? extends E> _02_Stream) – Inserts collection at specified index
        list.addAll(2, Arrays.asList("B", "C"));
        System.out.println(list);  // Output: [X, A, B, C, Y, Z]

        // 3. get(int index) – Returns element at specified index
        System.out.println("Element at index 3: " + list.get(3));

        // 4. set(int index, E element) – Replaces element at index with new value
        list.set(3, "M");
        System.out.println("List after setting M at index 3: " + list);

        // 5. remove(int index) – Removes element at specified index
        list.remove(2);
        System.out.println("List after removing element from index 2: " + list);

        // 6. indexOf(Object o) – Returns index of first occurrence
        System.out.println("Index of A: " + list.indexOf("A"));

        // 7. lastIndexOf(Object o) – Returns index of last occurrence
        list.add("X");
        System.out.println("Last index of X: " + list.lastIndexOf("X"));

        // 8. listIterator() – Returns ListIterator for forward/backward traversal
        System.out.print("ListIterator: ");
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        // 9. listIterator(int index) – Returns ListIterator starting from given index
        System.out.print("ListIterator from index 2: ");
        ListIterator<String> liFrom2 = list.listIterator(2);
        while (liFrom2.hasNext()) {
            System.out.print(liFrom2.next() + " ");
        }
        System.out.println();

        // 10. subList(int fromIndex, int toIndex) – Returns a view of the list between indices
        List<String> sub = list.subList(1, 4);
        System.out.println("Sublist (1–4): " + sub);

        // 11. equals(Object o) – Compares list with another for equality
        LinkedList<String> other = new LinkedList<>(list);
        System.out.println("Equals another list? " + list.equals(other));

        // 12. hashCode() – Returns hash code of the list
        System.out.println("Hash code: " + list.hashCode());

        // Final output
        System.out.println("Final list: " + list);
    }
}