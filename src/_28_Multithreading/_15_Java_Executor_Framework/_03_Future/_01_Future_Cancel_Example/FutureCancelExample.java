package _28_Multithreading._15_Java_Executor_Framework._03_Future._01_Future_Cancel_Example;

import java.util.concurrent.*;

public class FutureCancelExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(5000); // Simulate long running task
            return "Task Completed";
        });

        // Attempt to cancel the task without interrupting if running
        boolean cancelled = future.cancel(false);
        System.out.println("Cancelled without interrupt: " + cancelled); // false because task started

        // Attempt to cancel the task with interrupt
        cancelled = future.cancel(true);
        System.out.println("Cancelled with interrupt: " + cancelled); // true if successfully cancelled

        executor.shutdown();
    }
}

