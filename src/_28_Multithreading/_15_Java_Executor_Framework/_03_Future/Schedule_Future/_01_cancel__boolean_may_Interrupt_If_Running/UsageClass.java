package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._01_cancel__boolean_may_Interrupt_If_Running;

import java.util.concurrent.ExecutionException;

public class UsageClass {

    public static void main(String[] args) {
        // Create an instance of CancelMethodExample with some result
        CancelMethodExample<String> future = new CancelMethodExample<>("Task Completed");

        // Start a thread to simulate asynchronous operation (optional)
        new Thread(() -> {
            try {
                // Simulate some work with sleep
                Thread.sleep(2000);
                System.out.println("Task finished execution");
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
        }).start();

        try {
            // Cancel the task before it's done
            boolean cancelResult = future.cancel(true);
            System.out.println("Cancel called, result: " + cancelResult);

            // Check if the task was cancelled
            System.out.println("Is cancelled? " + future.isCancelled());

            // Try to get the result (will throw CancellationException if cancelled)
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}

