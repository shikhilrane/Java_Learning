package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._06_PriorityBlockingQueue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class LearnPriorityBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // Same as PriorityQueue
        // Creates a PriorityBlockingQueue with the default initial capacity (11) that orders its elements according to their natural ordering or provided comparator.
        // Binary heap as array and can grow dynamically
        // unbounded by capacity so put won't be get blocked
        // Head is based on their natural ordering or provided comparator like priority queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Drumstick");
        queue.add("Elephant");
        System.out.println(queue); // It will produce [Elephant, Drumstick, Banana, Apple, Cherry], because things are not sorted here either but Head (i.e. Elephant will come first and other objects will remain unordered after getting Head element)
    }
}

