package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._03_isDone;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class UsageClass {

    public static void main(String[] args) {
        // Create instance with some result
        IsDoneMethodExample<String> future = new IsDoneMethodExample<>("Task Completed Successfully");

        // Check if task is done
        System.out.println("Is done? " + future.isDone());

        // Check if task is cancelled
        System.out.println("Is cancelled? " + future.isCancelled());

        try {
            // Get the result (should succeed)
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Using get with timeout (simplified, returns null)
        String timeoutResult = future.get(1, TimeUnit.SECONDS);
        System.out.println("Result with timeout: " + timeoutResult);
    }
}
