package _28_Multithreading._15_Java_Executor_Framework._03_Future._05_Future_Get_With_Timeout_Example;

import java.util.concurrent.*;

public class FutureGetWithTimeoutExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(3000); // Simulate long task
            return "Delayed Result";
        });

        try {
            // Wait max 2 seconds for result; throws TimeoutException if task not done in time
            String result = future.get(2, TimeUnit.SECONDS);
            System.out.println("Result: " + result);
        } catch (TimeoutException e) {
            System.out.println("Timeout: Task not completed within 2 seconds");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
