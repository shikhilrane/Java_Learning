package _28_Multithreading._15_Java_Executor_Framework._02_Executors.ExecutorService.ScheduledExecutorService._03_Schedule_At_Fixed_Rate;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRateExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule Runnable to run repeatedly starting after 1 second initial delay,
        // then every 2 seconds (fixed rate)
        ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(() ->
                        System.out.println("Fixed-rate task executed at " + System.currentTimeMillis()/1000),
                1, 2, TimeUnit.SECONDS);

        Thread.sleep(7000); // Let the task run a few times (~3 executions)

        future.cancel(true); // Cancel the scheduled task

        scheduler.shutdown(); // Shutdown scheduler
    }
}