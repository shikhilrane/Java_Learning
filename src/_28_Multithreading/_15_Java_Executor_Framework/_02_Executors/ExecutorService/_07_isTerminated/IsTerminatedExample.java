package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._07_isTerminated;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class IsTerminatedExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(() -> {
            try {
                Thread.sleep(1000); // Simulate task duration
            } catch (InterruptedException ignored) {
            }
        });

        executor.shutdown(); // Begin shutdown

        System.out.println("Is terminated immediately after shutdown: " + executor.isTerminated()); // Likely false, task still running

        executor.awaitTermination(2, TimeUnit.SECONDS); // Wait max 2 seconds for termination

        System.out.println("Is terminated after awaitTermination: " + executor.isTerminated()); // Should be true after task completes
    }
}