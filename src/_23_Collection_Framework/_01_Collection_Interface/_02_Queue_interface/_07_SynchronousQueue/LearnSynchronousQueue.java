package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._07_SynchronousQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class LearnSynchronousQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new SynchronousQueue<>();
        // Each insert operation must wait for a corresponding remove operation by another thread and vise versa. So Capacity is almost 1
        // Producer won't produce anything unless and until last produced element gets consumed by the Consumer

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
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
                Thread.sleep(5000);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}