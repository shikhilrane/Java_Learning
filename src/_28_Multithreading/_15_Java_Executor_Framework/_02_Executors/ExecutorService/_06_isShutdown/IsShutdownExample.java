package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._06_isShutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IsShutdownExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        System.out.println("Before shutdown: " + executor.isShutdown()); // Should be false initially

        executor.shutdown(); // Start shutdown

        System.out.println("After shutdown: " + executor.isShutdown()); // Should be true after shutdown
    }
}

