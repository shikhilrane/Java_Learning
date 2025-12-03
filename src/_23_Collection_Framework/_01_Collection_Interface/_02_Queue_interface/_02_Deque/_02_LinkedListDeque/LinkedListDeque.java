package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._02_Deque._02_LinkedListDeque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        // 1. Insertion Methods
        dq.offer(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        dq.addFirst(40);
        dq.addLast(50);
        System.out.println(dq);

        // 2. Removal Methods
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);

        // 3. Stack operations
        dq.push(20);
        dq.push(30);
        dq.push(40);
        System.out.println(dq);
        dq.pop();
        System.out.println(dq);
        System.out.println(dq.peek());

        // 4. Peek Methods
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        // 5. Other Methods
        dq.removeFirstOccurrence(20);
        System.out.println(dq);

        dq.removeLastOccurrence(10);
        System.out.println(dq);

        Deque<String> dqIterator = new LinkedList<>();
        dqIterator.add("A");
        dqIterator.add("B");
        dqIterator.add("C");

        Iterator<String> it = dqIterator.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
