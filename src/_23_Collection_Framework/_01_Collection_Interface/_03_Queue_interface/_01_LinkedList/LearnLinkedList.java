package _23_Collection_Framework._01_Collection_Interface._03_Queue_interface._01_LinkedList;

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
        System.out.println("add() and offer() : " + queue);

        // 3. remove() - Retrieves and removes the head of the queue; throws exception if empty
        queue.remove();
        System.out.println("After remove() : " + queue);

        // 4. poll() - Retrieves and removes the head of the queue; returns null if empty
        queue.poll();
        System.out.println("After poll : " + queue);

        // 5. element() - Retrieves, but does not remove, the head of the queue; throws exception if empty
        System.out.println("After element() : " + queue.element());

        // 6. peek() - Retrieves, but does not remove, the head of the queue; returns null if empty
        System.out.println("After peek() : " + queue.peek());

        // 7. Iteration on LL of Queue
        while (!(queue.isEmpty())){
            System.out.println("Loop : " + queue.poll());
        }
    }
}

/*
    1. As we know, LL can act as stack. Like we can perform addFirst(), removeFirst(), etc methods
    2. LL can act as queue as well. But acting LL as Queue may increase the complexity of code, that's why Queue interface is introduced that implements LL
    3. In queue,
        add (automatically at last) = enqueue,
        remove (automatically at head) = dequeue,
        peek (automatically at head) = head

        add and offer = Same, add will throw exception But offer then it will false, if fails to add in full queue
        remove and poll = same, remove will throw exception But poll returns empty , if queue is empty
        element and peek = Same, element will throw exception But peek will return null , if queue is empty and does not have peek value
 */