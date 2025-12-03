package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._11_InvokeAny;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Collection<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> {
            Thread.sleep(200); // Task 1 sleeps 200 ms
            return "Task 1";
        });
        tasks.add(() -> {
            Thread.sleep(100); // Task 2 sleeps 100 ms (fastest)
            return "Task 2";
        });
        tasks.add(() -> {
            Thread.sleep(300); // Task 3 sleeps 300 ms
            return "Task 3";
        });

        String result = executor.invokeAny(tasks); // Returns result of fastest completed task
        System.out.println("First completed task result: " + result);

        executor.shutdown(); // Shutdown executor
    }
}

