package _28_Multithreading._15_Java_Executor_Framework._04_Delayed._01_Get_Delay;

import java.util.concurrent.TimeUnit;

public class UsageClass {

    public static void main(String[] args) throws InterruptedException {
        // Create a DelayedItem with a delay of 3 seconds
        DelayedItem delayedItem = new DelayedItem(3000);

        System.out.println("Initial delay in milliseconds: " + delayedItem.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Initial delay in seconds: " + delayedItem.getDelay(TimeUnit.SECONDS));

        // Wait for 2 seconds
        Thread.sleep(2000);

        System.out.println("Delay after 2 seconds in milliseconds: " + delayedItem.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Delay after 2 seconds in seconds: " + delayedItem.getDelay(TimeUnit.SECONDS));

        // Wait for another 2 seconds so delay should expire
        Thread.sleep(2000);

        System.out.println("Delay after total 4 seconds in milliseconds: " + delayedItem.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Delay after total 4 seconds in seconds: " + delayedItem.getDelay(TimeUnit.SECONDS));

        // Demonstrate compareTo (will always return 0 as per your implementation)
        DelayedItem anotherItem = new DelayedItem(1000);
        int comparison = delayedItem.compareTo(anotherItem);
        System.out.println("Compare delayedItem with anotherItem: " + comparison);
    }
}
