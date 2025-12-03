package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._04_Shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> System.out.println("Task running")); // Submit a simple task

        executor.shutdown(); // Initiates an orderly shutdown; no new tasks accepted

        System.out.println("Is shutdown? " + executor.isShutdown()); // Check if shutdown initiated
    }
}