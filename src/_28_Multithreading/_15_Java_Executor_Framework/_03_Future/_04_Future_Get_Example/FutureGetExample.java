package _28_Multithreading._15_Java_Executor_Framework._03_Future._04_Future_Get_Example;

import java.util.concurrent.*;

public class FutureGetExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(1000); // Simulate task
            return "Task Result";
        });

        // Blocks until task completes and result is available
        String result = future.get();
        System.out.println("Result from future.get(): " + result);

        executor.shutdown();
    }
}