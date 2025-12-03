package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._03_PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // 1. Automatic sets priority
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(20);
        pq.add(10);     // The Priority of this element is higher here because by default it sets smaller number as priority
        pq.add(30);
        pq.add(50);

        System.out.println(pq);
        System.out.println(pq.poll());  // It will remove 10 from here
        System.out.println(pq);

        // 2. Manually sets priority
        Queue<Integer> pq1 = new PriorityQueue<>((a,b) -> b-a); // (used comparator here that we will see later)
        pq1.add(40);
        pq1.add(20);
        pq1.add(10);
        pq1.add(30);
        pq1.add(50);    // The Priority of this element is higher here because by comparator it compare 2 higher number together and removes higher number from them
        System.out.println(pq1);
        System.out.println(pq1.poll());  // It will remove 50 from here
        System.out.println(pq1);

        // 3. Queue methods on PriorityQueue
        Queue<Integer> pq2 = new PriorityQueue<>();

        // 1. add() - Inserts the specified element; throws exception if insertion fails
        pq2.add(10);
        pq2.add(20);
        pq2.add(30);
        pq2.add(40);

        // 2. offer() - Inserts the specified element; returns false if insertion fails
        pq2.offer(50);
        pq2.offer(20);
        pq2.offer(60);
        pq2.offer(80);
        System.out.println("Queue after add/offer: " + pq2);  // Not guaranteed to print in sorted order

        // 3. remove() - Retrieves and removes the head of the queue; throws exception if empty
        pq2.remove();
        System.out.println("Queue after remove(): " + pq2);

        // 4. poll() - Retrieves and removes the head of the queue; returns null if empty
        pq2.poll();
        System.out.println("Queue after poll(): " + pq2);

        // 5. element() - Retrieves but does not remove the head; throws exception if empty
        System.out.println("Head using element(): " + pq2.element());

        // 6. peek() - Retrieves but does not remove the head; returns null if empty
        System.out.println("Head using peek(): " + pq2.peek());

        // 7. Iteration on PriorityQueue
        System.out.println("Polling all elements in order of priority:");
        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());  // Always returns the element with the highest priority (min by default)
        }
    }
}
