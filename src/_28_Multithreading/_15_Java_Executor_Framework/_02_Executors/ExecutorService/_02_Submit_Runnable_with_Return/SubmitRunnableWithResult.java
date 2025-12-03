package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._02_Submit_Runnable_with_Return;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitRunnableWithResult {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit Runnable with a predefined result "Runnable Result"
        Future<String> future = executor.submit(() -> System.out.println("Runnable running"), "Runnable Result");

        System.out.println("Runnable with result returned: " + future.get()); // Prints "Runnable Result"

        executor.shutdown(); // Shutdown executor
    }
}
