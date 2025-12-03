package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._08_AwaitTermination;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(() -> {
            try {
                Thread.sleep(2000); // Task sleeps for 2 seconds
                System.out.println("Task completed");
            } catch (InterruptedException ignored) {
            }
        });

        executor.shutdown(); // Start shutdown

        try {
            if (executor.awaitTermination(3, TimeUnit.SECONDS)) { // Wait max 3 seconds for termination
                System.out.println("Executor terminated");
            } else {
                System.out.println("Timeout elapsed before termination"); // Shutdown not complete in 3 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while waiting"); // Handle interruption during wait
        }
    }
}
