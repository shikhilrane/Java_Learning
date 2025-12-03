package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._12_InvokeAny_with_Timeout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class InvokeAnyWithTimeoutExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Collection<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> {
            Thread.sleep(200); // Task 1 sleeps 200 ms
            return "Task 1";
        });
        tasks.add(() -> {
            Thread.sleep(400); // Task 2 sleeps 400 ms
            return "Task 2";
        });
        tasks.add(() -> {
            Thread.sleep(300); // Task 3 sleeps 300 ms
            return "Task 3";
        });

        try {
            // Return result of fastest task, timeout after 250 ms
            String result = executor.invokeAny(tasks, 250, TimeUnit.MILLISECONDS);
            System.out.println("First completed task result with timeout: " + result);
        } catch (TimeoutException e) {
            System.out.println("invokeAny timed out"); // No task completed before timeout
        }

        executor.shutdown(); // Shutdown executor
    }
}
