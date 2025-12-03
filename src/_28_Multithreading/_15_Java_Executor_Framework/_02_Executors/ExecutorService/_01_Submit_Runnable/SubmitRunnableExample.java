package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._01_Submit_Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitRunnableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<?> future = executor.submit(() -> System.out.println("Runnable running")); // Submit Runnable

        future.get(); // Wait for Runnable to complete

        executor.shutdown(); // Shutdown executor

        System.out.println("Hi");  // This will executes later because we applied get
    }
}
