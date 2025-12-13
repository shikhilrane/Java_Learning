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

        //------------------------ LinkedList specific methods ------------------------
        LinkedList<Integer> llSpecific = new LinkedList<>();
        llSpecific.add(2);
        llSpecific.add(3);
        llSpecific.add(3);
        llSpecific.add(4);
        llSpecific.add(5);

        System.out.println(llSpecific);

        llSpecific.addFirst(1);
        llSpecific.addLast(6);
        System.out.println(llSpecific);

        System.out.println(llSpecific.getFirst());
        System.out.println(llSpecific.getLast());

        llSpecific.removeFirst();
        llSpecific.removeLast();
        System.out.println(llSpecific);

        llSpecific.removeFirstOccurrence(3);
        llSpecific.removeFirstOccurrence(4);
        System.out.println(llSpecific);

        llSpecific.removeIf(x -> x%2 !=0);
        System.out.println(llSpecific);

        Object clone = llSpecific.clone();
        System.out.println(clone);

        //------------------------ Deep understanding of LinkedList ------------------------
        LinkedList<Integer> ll = new LinkedList<>();
        // adding
        ll.add(1);
        ll.add(5);
        ll.add(80);

        // getting by index
        System.out.println(ll.get(2));
        // number of objects in LinkedList
        System.out.println(ll.size());

        // Iterating on LinkedList using for loop
        for (int i = 0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }

        // Iterating on LinkedList using forEach loop
        for(int x : ll){
            System.out.println(x);
        }

        // Check if given object is present or not
        System.out.println(ll.contains(5));

        // Removing object from particular index
        System.out.println(ll.remove(1));

        // Adding an object to specified index
        ll.add(1, 50);
        for(int x : ll){
            System.out.println(x);
        }

        // Setting an object on particular index
        ll.set(2, 90);
        for(int x : ll){
            System.out.println(x);
        }

        // Type of creating LinkedList<>()
        // 1. By using LinkedList<>()<>(); (can add object in middle of the two existing objects using add(index, object) and can set value of existing object using set(index, object))
        LinkedList<Object> creatingll1 = new LinkedList<>();
        creatingll1.add(5);
        creatingll1.add(25);
        creatingll1.add(35);
        System.out.println(creatingll1);
        creatingll1.add(1,15);  // adding
        System.out.println(creatingll1);
        creatingll1.set(1,20);  // setting
        System.out.println(creatingll1);
        // 2. By using Arrays.asList(); (can't add object in middle of the two existing objects but can set value of existing object using set(index, object) )
        List<Object> creatingll2 = Arrays.asList(1,2,3);
        creatingll2.set(1,20);  // setting
        System.out.println(creatingll2);
        // 3. By using List.of(); (Neither can add object in middle of the two existing objects nor can set value of existing object )
        List<Object> creatingll3 = List.of(4,5,6);

        // Adding in LinkedList
        // adding collection
        LinkedList<Integer> addingInll = new LinkedList<>(ll);
        addingInll.add(2);
        addingInll.add(45);
        addingInll.add(85);
        System.out.println(addingInll);
        // adding List.of() in new ArrayList<>()
        List<Integer> listof = List.of(11, 12, 13);
        addingInll.addAll(listof);      // listof.addAll(addingInll); (we can't do this because we know List.of() is unmodifiable)
        System.out.println(addingInll);

        // Removing from LinkedList
        // String
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.remove("apple"); // it will remove object by specifying itself
        System.out.println(fruits);
        // Integer
        LinkedList<Integer> removingFromll = new LinkedList<>();
        removingFromll.add(11);
        removingFromll.add(22);
        removingFromll.add(33);
        removingFromll.add(44);
        // removingFromll.remove(11);  // This remove element from given index
        removingFromll.remove(Integer.valueOf(11)); //so will use wrapper class to remove value directly
        System.out.println(removingFromll);

        // Converting to Array (List to Array)
        LinkedList<Integer> convertingLtoA = new LinkedList<>();
        convertingLtoA.add(1);
        convertingLtoA.add(2);
        convertingLtoA.add(3);
        Object[] ar = convertingLtoA.toArray();     // This will create array of objects
        Integer[] intArr = convertingLtoA.toArray(new Integer[0]); // This will create array of Integers, (because our array object is of Integer), (new array of size 0)

        // Sorting of an array
        // By using Collection (Method of Collection)
        LinkedList<Integer> sortingLlCollection = new LinkedList<>();
        sortingLlCollection.add(4);
        sortingLlCollection.add(3);
        sortingLlCollection.add(1);
        sortingLlCollection.add(5);
        sortingLlCollection.add(2);
        Collections.sort(sortingLlCollection);
        System.out.println(sortingLlCollection);
        // By using List (Method of List)
        LinkedList<Integer> sortingAlList = new LinkedList<>();
        sortingAlList.add(4);
        sortingAlList.add(3);
        sortingAlList.add(1);
        sortingAlList.add(5);
        sortingAlList.add(2);
        sortingAlList.sort(null);
        System.out.println(sortingAlList);  // It is using Comparator (we will learn comparator in further chapter)
    }
}