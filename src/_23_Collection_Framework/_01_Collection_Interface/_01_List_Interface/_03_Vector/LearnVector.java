package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._03_Vector;

import java.util.*;

public class LearnVector {
    public static void main(String[] args) {
        // Vector object
        Vector<String> list = new Vector<>();

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

        Vector<Integer> intList = new Vector<>();
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
        Vector<String> other = new Vector<>(list);
        System.out.println("Equals another list? " + list.equals(other));

        // 12. hashCode() – Returns hash code of the list
        System.out.println("Hash code: " + list.hashCode());

        // ------------------------ Vector Specific Methods ------------------------

        System.out.println("\n=== Vector-Specific Methods ===");

        // capacity() – Gets current capacity of the vector
        System.out.println("Capacity of vector: " + list.capacity());

        // ensureCapacity(int) – Ensures capacity is at least specified
        list.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity(20): " + list.capacity());

        // trimToSize() – Trims the capacity to current size
        list.trimToSize();
        System.out.println("Capacity after trimToSize(): " + list.capacity());

        // firstElement() – Returns first element
        System.out.println("First element: " + list.firstElement());

        // lastElement() – Returns last element
        System.out.println("Last element: " + list.lastElement());

        // elementAt(int index) – Gets element at index
        System.out.println("Element at index 2 using elementAt(): " + list.elementAt(2));

        // insertElementAt(E obj, int index) – Inserts element at index
        list.insertElementAt("NEW", 1);
        System.out.println("After insertElementAt NEW at index 1: " + list);

        // removeElementAt(int index) – Removes element at index
        list.removeElementAt(3);
        System.out.println("After removeElementAt index 3: " + list);

        // removeElement(Object obj) – Removes first occurrence of element
        list.removeElement("Y");
        System.out.println("After removeElement 'Y': " + list);

        // setElementAt(E obj, int index) – Replaces element at index
        list.setElementAt("Replaced", 2);
        System.out.println("After setElementAt at index 2: " + list);

        // Final output
        System.out.println("Final vector: " + list);

        //------------------------ Deep understanding of ArrayList ------------------------
        Vector<Integer> vect = new Vector<>();
        // adding
        vect.add(1);
        vect.add(5);
        vect.add(80);

        // getting by index
        System.out.println(vect.get(2));
        // number of objects in arraylist
        System.out.println(vect.size());

        // Iterating on arraylist using for loop
        for (int i = 0; i<vect.size(); i++){
            System.out.println(vect.get(i));
        }

        // Iterating on arraylist using forEach loop
        for(int x : vect){
            System.out.println(x);
        }

        // Check if given object is present or not
        System.out.println(vect.contains(5));

        // Removing object from particular index
        System.out.println(vect.remove(1));

        // Adding an object to specified index
        vect.add(1, 50);
        for(int x : vect){
            System.out.println(x);
        }

        // Setting an object on particular index
        vect.set(2, 90);
        for(int x : vect){
            System.out.println(x);
        }

        // Internal working of Vector (Look for notes of Vector for better understanding)
        Vector<Integer> vector1 = new Vector<>();     // Initial size if not defined by us then it will be 10 by default
        Vector<Integer> vector2 = new Vector<>(100);  // This is how we can define capacity of ArrayList, capacity = 100 but size = 0
        Vector<Integer> vector3 = new Vector<>(50);
        for (int i = 0; i < 15; i++) {
            vector3.add(i);
        }
        System.out.println(vector3);
        vector3.trimToSize();   // this will make capacity of alSize3 to 15

        // Type of creating Vector
        // 1. By using Vector<>(); (can add object in middle of the two existing objects using add(index, object) and can set value of existing object using set(index, object))
        List<Object> creatingVect1 = new Vector<>();
        creatingVect1.add(5);
        creatingVect1.add(25);
        creatingVect1.add(35);
        System.out.println(creatingVect1);
        creatingVect1.add(1,15);  // adding
        System.out.println(creatingVect1);
        creatingVect1.set(1,20);  // setting
        System.out.println(creatingVect1);
        // 2. By using Arrays.asList(); (can't add object in middle of the two existing objects but can set value of existing object using set(index, object) )
        List<Object> creatingVect2 = Arrays.asList(1,2,3);
        creatingVect2.set(1,20);  // setting
        System.out.println(creatingVect2);
        // 3. By using List.of(); (Neither can add object in middle of the two existing objects nor can set value of existing object )
        List<Object> creatingVect3 = List.of(4,5,6);

        // Adding in Vector
        // adding collection
        Vector<Integer> addingInVect = new Vector<>(vect);
        addingInVect.add(2);
        addingInVect.add(45);
        addingInVect.add(85);
        System.out.println(addingInVect);
        // adding List.of() in new Vector<>()
        List<Integer> listof = List.of(11, 12, 13);
        addingInVect.addAll(listof);      // listof.addAll(addingInVect); (we can't do this because we know List.of() is unmodifiable)
        System.out.println(addingInVect);

        // Removing from Vector
        // String
        Vector<String> fruits = new Vector<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.remove("apple"); // it will remove object by specifying itself
        System.out.println(fruits);
        // Integer
        Vector<Integer> removingFromVect = new Vector<>();
        removingFromVect.add(11);
        removingFromVect.add(22);
        removingFromVect.add(33);
        removingFromVect.add(44);
        // removingFromVect.remove(11);  // This remove element from given index
        removingFromVect.remove(Integer.valueOf(11)); //so will use wrapper class to remove value directly
        System.out.println(removingFromVect);

        // Converting to Array (List to Array)
        Vector<Integer> convertingLtoA = new Vector<>();
        convertingLtoA.add(1);
        convertingLtoA.add(2);
        convertingLtoA.add(3);
        Object[] ar = convertingLtoA.toArray();     // This will create array of objects
        Integer[] intArr = convertingLtoA.toArray(new Integer[0]); // This will create array of Integers, (because our array object is of Integer), (new array of size 0)

        // Sorting of an array
        // By using Collection (Method of Collection)
        Vector<Integer> sortingVectCollection = new Vector<>();
        sortingVectCollection.add(4);
        sortingVectCollection.add(3);
        sortingVectCollection.add(1);
        sortingVectCollection.add(5);
        sortingVectCollection.add(2);
        Collections.sort(sortingVectCollection);
        System.out.println(sortingVectCollection);
        // By using List (Method of List)
        Vector<Integer> sortingVectList = new Vector<>();
        sortingVectList.add(4);
        sortingVectList.add(3);
        sortingVectList.add(1);
        sortingVectList.add(5);
        sortingVectList.add(2);
        sortingVectList.sort(null);
        System.out.println(sortingVectList);  // It is using Comparator (we will learn comparator in further chapter)
    }
}
