package _23_Collection_Framework._01_Collection_Interface._03_Queue_interface._04_BlockingQueue._01_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class LearnBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
        // ArrayBlockingQueue = Bounded, blocking queue backed by an circular array (Blocking queue of fixed capacity array)
        // Single lock - producer and consumer will block each other. i.e. dequeue and enqueue operation shares the lock. So more threads may cause problem
        // We use ArrayBlockingQueue when threads are less
        Thread producer = new Thread(new Producer(bq));
        Thread consumer = new Thread(new Consumer(bq));
        producer.start();
        consumer.start();

    }
}

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;               // Shared queue in which Producer and Consumer will perform their operations
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Producer produced : " + value); // At first iteration producer will print 0 value
                queue.put(value++);                                 // It will get incremented here for next iteration
                Thread.sleep(500);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Integer value = queue.take();                       // It will wait until producer produces something, as it produced something then it will take it here
                System.out.println("Consumer produced : " + value); // And will print here
                Thread.sleep(1000);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}

/*
    Blocking Queue  :
    1. It is a thread-safe queue unlike LinkedList and Priority queue.
    2. It waits for queue to become non-empty / wait for spaces
        Standard Queue - Immediately runs even if spaces if empty or full (i.e. it doesn't check for space)
            empty -> remove (no wait to check if queue is empty or not, so it will throw an exception)
            full -> add (no wait to check if queue is full or not, so it will throw an exception)
        Blocking Queue -
            put -> Blocks if the queue is full until space becomes available to add
            take -> Blocks if the queue is empty until an element becomes available to remove
            offer -> waits for space to become available, up to specified timeout.
    3. BlockingQueue is an interface so can't instantiate it, so we implemented it by ArrayBlockingQueue
*/