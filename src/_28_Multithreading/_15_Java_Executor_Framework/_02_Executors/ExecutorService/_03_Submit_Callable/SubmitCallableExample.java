package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService._03_Submit_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitCallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> "Callable result"; // Callable that returns a string

        Future<String> future = executor.submit(callable); // Submit callable and get Future

        System.out.println("Callable returned: " + future.get()); // Retrieve result (blocks if not ready)

        executor.shutdown(); // Shutdown executor
    }
}