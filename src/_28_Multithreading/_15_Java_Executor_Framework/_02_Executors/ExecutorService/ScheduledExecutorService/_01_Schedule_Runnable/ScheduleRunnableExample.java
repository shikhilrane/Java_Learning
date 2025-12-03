package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService.ScheduledExecutorService._01_Schedule_Runnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleRunnableExample {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule a Runnable to run after 2 seconds delay
        ScheduledFuture<?> future = scheduler.schedule(() ->
                System.out.println("Runnable executed after delay"), 2, TimeUnit.SECONDS);

        System.out.println("Task scheduled, waiting...");

        future.get(); // Wait for task completion

        scheduler.shutdown(); // Shutdown scheduler
    }
}