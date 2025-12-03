package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._09_InvokeAll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Collection<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> "Task 1"); // Callable task 1
        tasks.add(() -> "Task 2"); // Callable task 2
        tasks.add(() -> "Task 3"); // Callable task 3

        List<Future<String>> futures = executor.invokeAll(tasks); // Invoke all tasks and wait for all to complete

        for (Future<String> f : futures) {
            System.out.println(f.get()); // Print results of all tasks
        }

        executor.shutdown(); // Shutdown executor
    }
}