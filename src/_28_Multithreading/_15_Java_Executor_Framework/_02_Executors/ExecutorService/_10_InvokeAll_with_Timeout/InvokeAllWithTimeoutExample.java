package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._10_InvokeAll_with_Timeout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class InvokeAllWithTimeoutExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Collection<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> {
            Thread.sleep(100); // Task 1 sleeps 100 ms
            System.out.println("Task 1");
            return "Task 1";
        });
        tasks.add(() -> {
            Thread.sleep(200); // Task 2 sleeps 200 ms
            System.out.println("Task 2");
            return "Task 2";
        });
        tasks.add(() -> {
            Thread.sleep(300); // Task 3 sleeps 300 ms
            System.out.println("Task 3");
            return "Task 3";
        });

        // Invoke all tasks but wait max 150 ms for all
        List<Future<String>> futures = executor.invokeAll(tasks, 150, TimeUnit.MILLISECONDS);

        for (Future<String> f : futures) {
            if (f.isCancelled()) {
                System.out.println("Task cancelled due to timeout"); // Task did not complete in time
            } else {
                System.out.println(f.get()); // Print completed task result
            }
        }

        executor.shutdown(); // Shutdown executor
    }
}