package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._01_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 1. add() - Inserts the specified element into the queue; throws exception if full
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // 2. offer() - Inserts the specified element into the queue; returns false if it fails
        queue.offer(50);
        queue.offer(20);
        queue.offer(60);
        queue.offer(80);
        System.out.println(queue);

        // 3. remove() - Retrieves and removes the head of the queue; throws exception if empty
        queue.remove();
        System.out.println(queue);

        // 4. poll() - Retrieves and removes the head of the queue; returns null if empty
        queue.poll();
        System.out.println(queue);

        // 5. element() - Retrieves, but does not remove, the head of the queue; throws exception if empty
        System.out.println(queue.element());

        // 6. peek() - Retrieves, but does not remove, the head of the queue; returns null if empty
        System.out.println(queue.peek());

        // 7. Iteration on LL of Queue
        while (!(queue.isEmpty())){
            System.out.println(queue.poll());
        }
    }
}
