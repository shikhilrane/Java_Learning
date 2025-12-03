package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService.ScheduledExecutorService._04_Schedule_With_Fixed_Delay;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleWithFixedDelayExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule Runnable to run repeatedly starting after 1 second initial delay,
        // then with 2 seconds delay after the previous task completes
        ScheduledFuture<?> future = scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Fixed-delay task started at " + System.currentTimeMillis()/1000);
            try {
                Thread.sleep(1000); // Simulate task taking 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, 1, 2, TimeUnit.SECONDS);

        Thread.sleep(8000); // Let the task run a few times (~3 executions)

        future.cancel(true); // Cancel the scheduled task

        scheduler.shutdown(); // Shutdown scheduler
    }
}