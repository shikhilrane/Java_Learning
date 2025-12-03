package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._02_Deque._01_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // 1. Insertion Methods :
        dq.offer(10);       // add to last
        dq.offerFirst(20);  // add to first
        dq.offerLast(30);   // add to last
        dq.addFirst(40);    // add to first
        dq.addLast(50);     // add to last
        System.out.println(dq);

        // 2. Removal Methods :
        dq.removeFirst();       // It will remove first element of queue
        System.out.println(dq);
        dq.removeLast();        // It will remove last element of queue
        System.out.println(dq);
        dq.pollFirst();         // It will remove first element of queue
        System.out.println(dq);
        dq.pollLast();          // It will remove last element of queue
        System.out.println(dq);

        // 3. ArrayDeque as stack   (USE STACK FROM ARRAYDEQUE rather than LIST STACK)
        dq.push(20);         // Add to stack
        dq.push(30);
        dq.push(40);
        System.out.println(dq);
        dq.pop();               // Pop out of stack
        System.out.println(dq);
        System.out.println(dq.peek());  // Most upper element in stack

        // 4. Peek Methods :
        System.out.println(dq.getFirst());  // First element of queue
        System.out.println(dq.getLast());   // Last element of queue
        System.out.println(dq.peekFirst()); // First element of queue
        System.out.println(dq.peekLast());  // Last element of queue

        // 5. Other Methods :
        dq.removeFirstOccurrence(20);   // It will Remove first occurrence of the element
        System.out.println(dq);

        dq.removeLastOccurrence(10);    // It will Remove last occurrence of the element
        System.out.println(dq);

        ArrayDeque<String> dqIterator = new ArrayDeque<>();
        dqIterator.add("A");
        dqIterator.add("B");
        dqIterator.add("C");
        // Print elements in reverse order
        Iterator<String> it = dqIterator.descendingIterator();  // Descending order
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
