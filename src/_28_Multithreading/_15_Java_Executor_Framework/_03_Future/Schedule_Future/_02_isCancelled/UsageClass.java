package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._02_isCancelled;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class UsageClass {

    public static void main(String[] args) {
        // Create an instance where the task is already cancelled
        IsCancelledMethodExample<String> future = new IsCancelledMethodExample<>();

        // Check if the task is cancelled
        System.out.println("Is cancelled? " + future.isCancelled());

        // Check if the task is done (cancelled means done here)
        System.out.println("Is done? " + future.isDone());

        try {
            // Try to get the result (should throw CancellationException)
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (CancellationException e) {
            System.out.println("Caught CancellationException: Task was cancelled.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Using the get with timeout (simplified, returns null)
        String timeoutResult = future.get(1, TimeUnit.SECONDS);
        System.out.println("Result with timeout: " + timeoutResult);
    }
}
