package _23_Collection_Framework._01_Collection_Interface._03_Queue_interface._04_BlockingQueue._02_LinkedBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LearnLinkedBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);
        // optionally bounded, if we don't provide capacity then it will take capacity as MAX_VALUE, But it recommended as to provide capacity
        // Separate lock - producer and consumer won't block each other. i.e. dequeue and enqueue operation don't share the lock
        // We use LinkedBlockingQueue when threads are more
    }
}