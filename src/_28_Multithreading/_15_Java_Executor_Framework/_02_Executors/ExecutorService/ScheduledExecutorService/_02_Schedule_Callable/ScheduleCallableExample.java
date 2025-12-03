package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService.ScheduledExecutorService._02_Schedule_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleCallableExample {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Callable<String> callable = () -> {
            System.out.println("Callable executed after delay");
            return "Callable Result";
        };

        // Schedule callable to run after 3 seconds delay
        ScheduledFuture<String> future = scheduler.schedule(callable, 3, TimeUnit.SECONDS);

        System.out.println("Callable scheduled, waiting...");

        System.out.println("Result: " + future.get()); // Get result (blocks until done)

        scheduler.shutdown(); // Shutdown scheduler
    }
}
