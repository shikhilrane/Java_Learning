package _28_Multithreading._15_Java_Executor_Framework._04_Delayed.Schedule_Future._01_Get_Delay;

import java.util.concurrent.TimeUnit;

public class UsageClass {

    public static void main(String[] args) throws InterruptedException {
        // Create an instance with a delay of 4 seconds
        GetDelayMethodExample delayedTask = new GetDelayMethodExample(4000);

        System.out.println("Initial delay in milliseconds: " + delayedTask.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Initial delay in seconds: " + delayedTask.getDelay(TimeUnit.SECONDS));

        // Sleep for 2 seconds
        Thread.sleep(2000);

        System.out.println("Delay after 2 seconds in milliseconds: " + delayedTask.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Delay after 2 seconds in seconds: " + delayedTask.getDelay(TimeUnit.SECONDS));

        // Sleep for another 3 seconds
        Thread.sleep(3000);

        System.out.println("Delay after total 5 seconds in milliseconds: " + delayedTask.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Delay after total 5 seconds in seconds: " + delayedTask.getDelay(TimeUnit.SECONDS));
    }
}
