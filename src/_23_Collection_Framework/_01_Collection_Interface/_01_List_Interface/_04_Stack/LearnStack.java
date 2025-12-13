package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._04_Stack;

import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        // Stack object (extends Vector, hence supports List, Vector & Stack methods)
        Stack<String> stack = new Stack<>();

        // ------------------------ Collection Interface Methods ------------------------

        System.out.println("=== Collection Interface Methods ===");

        // 1. add(E element) – Adds element to the end (like push, but allowed by Collection)
        stack.add("A");
        stack.add("B");
        stack.add("1");

        // 2. addAll(Collection<? extends E>) – Adds multiple elements at once
        stack.addAll(Arrays.asList("C", "D"));

        // 3. remove(Object o) – Removes the first occurrence of the specified element
        stack.remove("B");
        System.out.println("After removing 'B': " + stack);

        // remove(int index) – Removes element at specific index
        stack.remove(1);
        System.out.println("After removing index 1: " + stack);

        Stack<Integer> intStack = new Stack<>();
        intStack.add(1);
        intStack.add(2);
        intStack.add(3);
        intStack.add(4);

        // Removes element at index 0
        intStack.remove(0);
        System.out.println("After removing by Index: " + intStack);

        // Removes element with value 3
        intStack.remove(Integer.valueOf(3));
        System.out.println("After removing by Value: " + intStack);

        // 4. removeAll(Collection<?>) – Removes all elements found in the specified collection
        stack.removeAll(Arrays.asList("D"));
        System.out.println("After removing all 'D': " + stack);

        // 5. retainAll(Collection<?>) – Keeps only elements found in the specified collection
        stack.retainAll(Arrays.asList("A", "C"));
        System.out.println("After retaining A and C: " + stack);

        // 6. contains(Object o) – Checks if stack contains the specified element
        System.out.println("Contains 'A': " + stack.contains("A"));

        // 7. containsAll(Collection<?>) – Checks if stack contains all elements in the collection
        System.out.println("Contains all [A, C]: " + stack.containsAll(Arrays.asList("A", "C")));

        // 8. isEmpty() – Checks if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 9. size() – Returns the number of elements in the stack
        System.out.println("Size: " + stack.size());

        // 10. iterator() – Returns an iterator to traverse stack elements
        System.out.print("Iterating: ");
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. toArray() – Converts stack to Object array
        Object[] arr = stack.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 12. <T> T[] toArray(T[] a) – Converts to typed array
        String[] strArr = stack.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(strArr));

        // 13. clear() – Removes all elements from the stack
        stack.clear();
        System.out.println("Cleared stack: " + stack);

        // ------------------------ List Interface Methods ------------------------

        System.out.println("\n=== List Interface Methods ===");

        stack.add("X");
        stack.add("Y");
        stack.add("Z");

        // 1. add(int index, E element) – Inserts element at specific index
        stack.add(1, "A");

        // 2. addAll(int index, Collection<? extends E>) – Inserts multiple elements at index
        stack.addAll(2, Arrays.asList("B", "C"));
        System.out.println(stack);

        // 3. get(int index) – Gets element at specified index
        System.out.println("Element at index 3: " + stack.get(3));

        // 4. set(int index, E element) – Replaces element at index
        stack.set(3, "M");
        System.out.println("After setting index 3 to M: " + stack);

        // 5. remove(int index) – Removes element at specified index
        stack.remove(2);
        System.out.println("After removing index 2: " + stack);

        // 6. indexOf(Object o) – Gets index of first occurrence
        System.out.println("Index of A: " + stack.indexOf("A"));

        // 7. lastIndexOf(Object o) – Gets index of last occurrence
        stack.add("X");
        System.out.println("Last index of X: " + stack.lastIndexOf("X"));

        // 8. listIterator() – ListIterator to traverse forward and backward
        System.out.print("ListIterator: ");
        ListIterator<String> li = stack.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        // 9. listIterator(int index) – Starts ListIterator from specific index
        System.out.print("ListIterator from index 2: ");
        ListIterator<String> liFrom2 = stack.listIterator(2);
        while (liFrom2.hasNext()) {
            System.out.print(liFrom2.next() + " ");
        }
        System.out.println();

        // 10. subList(int fromIndex, int toIndex) – Returns a view of the portion of list
        List<String> sub = stack.subList(1, 4);
        System.out.println("Sublist (1–4): " + sub);

        // 11. equals(Object o) – Compares if two lists are equal
        Stack<String> other = new Stack<>();
        other.addAll(stack);
        System.out.println("Equals another stack? " + stack.equals(other));

        // 12. hashCode() – Returns hash code value
        System.out.println("HashCode: " + stack.hashCode());

        // ------------------------ Vector Specific Methods ------------------------

        System.out.println("\n=== Vector-Specific Methods ===");

        // capacity() – Returns current capacity of the vector
        System.out.println("Capacity: " + stack.capacity());

        // ensureCapacity(int minCapacity) – Increases capacity if needed
        stack.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity(20): " + stack.capacity());

        // trimToSize() – Trims capacity to current size
        stack.trimToSize();
        System.out.println("Capacity after trimToSize(): " + stack.capacity());

        // firstElement() – Returns first element of the vector
        System.out.println("First Element: " + stack.firstElement());

        // lastElement() – Returns last element of the vector
        System.out.println("Last Element: " + stack.lastElement());

        // elementAt(int index) – Gets element at index
        System.out.println("Element at index 2: " + stack.elementAt(2));

        // insertElementAt(E obj, int index) – Inserts element at index
        stack.insertElementAt("NEW", 1);
        System.out.println("After insertElementAt at index 1: " + stack);

        // removeElementAt(int index) – Removes element at index
        stack.removeElementAt(3);
        System.out.println("After removeElementAt index 3: " + stack);

        // removeElement(Object obj) – Removes first occurrence of object
        stack.removeElement("Y");
        System.out.println("After removeElement 'Y': " + stack);

        // setElementAt(E obj, int index) – Replaces element at index
        stack.setElementAt("Replaced", 2);
        System.out.println("After setElementAt index 2: " + stack);

        // ------------------------ Stack Specific Methods ------------------------

        System.out.println("\n=== Stack-Specific Methods ===");

        // push(E item) – Adds item to top of stack
        stack.push("TOP");
        System.out.println("After push: " + stack);

        // peek() – Returns top element without removing it
        System.out.println("Top element (peek): " + stack.peek());

        // pop() – Removes and returns the top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop: " + stack);

        // search(Object o) – Returns position (1-based) from top of stack
        System.out.println("Position of 'M' from top (1-based): " + stack.search("M"));

        // empty() – Returns true if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // size() – Returns total number of elements
        System.out.println("Size of stack: " + stack.size());

        // contains(Object o) – Checks if element is present
        System.out.println("Stack contains '3'? " + stack.contains("3"));  // false

        // Iterate Stack (LIFO Order)
        System.out.print("Iterating Stack (LIFO): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        // Final Output
        System.out.println("\nFinal stack: " + stack);

        //------------------------ Deep understanding of Stack ------------------------
        Stack<Integer> stc = new Stack<>();
        stc.add(78);
        stc.add(63);
        stc.add(35);
        stc.add(84);
        stc.add(92);

        // getting by index
        System.out.println(stc.get(2));
        // number of objects in arraylist
        System.out.println(stc.size());

        // Iterating on arraylist using for loop
        for (int i = 0; i<stc.size(); i++){
            System.out.println(stc.get(i));
        }

        // Iterating on arraylist using forEach loop
        for(int x : stc){
            System.out.println(x);
        }

        // Check if given object is present or not
        System.out.println(stc.contains(5));

        // Removing object from particular index
        System.out.println(stc.remove(1));

        // Adding an object to specified index
        stc.add(1, 50);
        for(int x : stc){
            System.out.println(x);
        }

        // Setting an object on particular index
        stc.set(2, 90);
        for(int x : stc){
            System.out.println(x);
        }

        // Type of creating Stack
        // 1. By using Stack<>(); (can add object in middle of the two existing objects using add(index, object) and can set value of existing object using set(index, object))
        List<Object> creatingStc1 = new Stack<>();
        creatingStc1.add(5);
        creatingStc1.add(25);
        creatingStc1.add(35);
        System.out.println(creatingStc1);
        creatingStc1.add(1,15);  // adding
        System.out.println(creatingStc1);
        creatingStc1.set(1,20);  // setting
        System.out.println(creatingStc1);
        // 2. By using Arrays.asList(); (can't add object in middle of the two existing objects but can set value of existing object using set(index, object) )
        List<Object> creatingStc2 = Arrays.asList(1,2,3);
        creatingStc2.set(1,20);  // setting
        System.out.println(creatingStc2);
        // 3. By using List.of(); (Neither can add object in middle of the two existing objects nor can set value of existing object )
        List<Object> creatingStc3 = List.of(4,5,6);

        // Adding in Stack
        // adding collection
        Stack<Integer> addingInStc = new Stack<>();
        addingInStc.add(2);
        addingInStc.add(45);
        addingInStc.add(85);
        System.out.println(addingInStc);
        addingInStc.addAll(stc);
        System.out.println(addingInStc);
        // adding List.of() in new Stack<>()
        List<Integer> listof = List.of(11, 12, 13);
        addingInStc.addAll(listof);      // listof.addAll(addingInStc); (we can't do this because we know List.of() is unmodifiable)
        System.out.println(addingInStc);

        // Removing from Stack
        // String
        Stack<String> fruits = new Stack<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.remove("apple"); // it will remove object by specifying itself
        System.out.println(fruits);
        // Integer
        Stack<Integer> removingFromStc = new Stack<>();
        removingFromStc.add(11);
        removingFromStc.add(22);
        removingFromStc.add(33);
        removingFromStc.add(44);
        // removingFromStc.remove(11);  // This remove element from given index
        removingFromStc.remove(Integer.valueOf(11)); //so will use wrapper class to remove value directly
        System.out.println(removingFromStc);

        // Converting to Array (List to Array)
        Stack<Integer> convertingLtoA = new Stack<>();
        convertingLtoA.add(1);
        convertingLtoA.add(2);
        convertingLtoA.add(3);
        Object[] ar = convertingLtoA.toArray();     // This will create array of objects
        Integer[] intArr = convertingLtoA.toArray(new Integer[0]); // This will create array of Integers, (because our array object is of Integer), (new array of size 0)

        // Sorting of a Stack
        // By using Collection (Method of Collection)
        Stack<Integer> sortingStcCollection = new Stack<>();
        sortingStcCollection.add(4);
        sortingStcCollection.add(3);
        sortingStcCollection.add(1);
        sortingStcCollection.add(5);
        sortingStcCollection.add(2);
        Collections.sort(sortingStcCollection);
        System.out.println(sortingStcCollection);
        // By using List (Method of List)
        Stack<Integer> sortingStcList = new Stack<>();
        sortingStcList.add(4);
        sortingStcList.add(3);
        sortingStcList.add(1);
        sortingStcList.add(5);
        sortingStcList.add(2);
        sortingStcList.sort(null);
        System.out.println(sortingStcList);  // It is using Comparator (we will learn comparator in further chapter)
    }
}
