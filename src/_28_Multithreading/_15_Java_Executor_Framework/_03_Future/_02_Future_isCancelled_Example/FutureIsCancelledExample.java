package _28_Multithreading._15_Java_Executor_Framework._03_Future._02_Future_isCancelled_Example;

import java.util.concurrent.*;

public class FutureIsCancelledExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(3000); // Simulate task
            return "Task Done";
        });

        future.cancel(true); // Cancel task immediately with interrupt

        System.out.println("Is cancelled? " + future.isCancelled()); // true if cancelled successfully

        executor.shutdown();
    }
}
