package _28_Multithreading._15_Java_Executor_Framework._03_Future._03_Future_isDone_Example;

import java.util.concurrent.*;

public class FutureIsDoneExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(2000); // Simulate task
            return "Result";
        });

        System.out.println("Is done immediately after submit? " + future.isDone()); // false

        String result = future.get(); // Wait for completion

        System.out.println("Is done after get()? " + future.isDone()); // true

        System.out.println("Result: " + result);

        executor.shutdown();
    }
}