package _28_Multithreading._15_Java_Executor_Framework;

import java.util.concurrent.*;

public class ExecutorsFutureMethods {
    public static void main(String[] args) {
        // 1
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> 42);

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());

        executorService.shutdown();

        // 2
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        // 2.1 Callable (When we have to return something)
        Callable<String> callable = () -> "hi";  // Callable returns a result
        Future<String> future1 = executorService1.submit(callable);  // Submit Callable and get Future

        // to get the result from callable
        try {
            String result = future1.get();  // blocks until callable finishes
            System.out.println("Callable returned: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // 2.1 Runnable (When we don't have to return anything)
        Runnable runnable = () -> System.out.println("Hello");  // Runnable doesn't return result
        executorService1.submit(runnable);  // Runnable can also be submitted

        executorService1.shutdown();  // Shutdown executor after submitting tasks


    }
}

// Callable vs Runnable
// Callable - That can be call from method. It returns
// Runnable - That can be directly run. It doesn't return