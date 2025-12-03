package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._05_ShutDownNow;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownNowExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                Thread.sleep(2000); // Simulate long-running task
                System.out.println("Long task finished");
            } catch (InterruptedException e) {
                System.out.println("Task interrupted"); // Task interrupted by shutdownNow
            }
        });

        List<Runnable> notExecutedTasks = executor.shutdownNow(); // Force shutdown, return pending tasks
        System.out.println("Tasks not executed: " + notExecutedTasks.size()); // Usually zero here
    }
}