package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._04_get;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class UsageClass {

    public static void main(String[] args) {
        // Create an instance with some result
        GetMethodExample<String> future = new GetMethodExample<>("Task Result");

        // Check if the task is done
        System.out.println("Is done? " + future.isDone());

        // Check if the task is cancelled
        System.out.println("Is cancelled? " + future.isCancelled());

        try {
            // Get the result without timeout
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (CancellationException e) {
            System.out.println("Task was cancelled.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        try {
            // Get the result with timeout (delegates to get())
            String resultWithTimeout = future.get(2, TimeUnit.SECONDS);
            System.out.println("Result with timeout: " + resultWithTimeout);
        } catch (CancellationException e) {
            System.out.println("Task was cancelled.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
