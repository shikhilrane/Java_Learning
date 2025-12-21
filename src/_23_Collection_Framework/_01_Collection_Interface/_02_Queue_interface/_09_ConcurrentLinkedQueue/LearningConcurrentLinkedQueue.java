package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._09_ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class LearningConcurrentLinkedQueue {
    private static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    queue.add("Task " + System.currentTimeMillis());
                    System.out.println("Produced");
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = queue.poll();
                    System.out.println("Processing " + task);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

/*
    1. In Blocking queue, threads were depend on each other and so blocking was there
    2. In ConcurrentLinkedQueue, it is a implementation of queue interface that supports lock-free, thread-safe operations
    3. It uses Compare And Swap method internally like ConcurrentHashMap, like if the last saw tail is same as of swapping number then it will swap other it will retry
    4. It is NON-blocking — producer and consumer do not wait for each other.
*/