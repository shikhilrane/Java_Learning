package _28_Multithreading._15_Java_Executor_Framework._04_Delayed._02_Compare_To;

import java.util.concurrent.TimeUnit;

public class UsageClass {

    public static void main(String[] args) throws InterruptedException {
        // Create two delayed items with different delays
        ComparableDelayedItem item1 = new ComparableDelayedItem(3000); // 3 seconds delay
        ComparableDelayedItem item2 = new ComparableDelayedItem(5000); // 5 seconds delay

        // Print initial delays
        System.out.println("Item1 initial delay (ms): " + item1.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Item2 initial delay (ms): " + item2.getDelay(TimeUnit.MILLISECONDS));

        // Compare item1 and item2
        int comparison = item1.compareTo(item2);
        if (comparison < 0) {
            System.out.println("Item1 will expire before Item2");
        } else if (comparison > 0) {
            System.out.println("Item1 will expire after Item2");
        } else {
            System.out.println("Item1 and Item2 expire at the same time");
        }

        // Sleep 4 seconds to let item1 expire but item2 still active
        Thread.sleep(4000);

        // Print delays after sleep
        System.out.println("After 4 seconds:");
        System.out.println("Item1 delay (ms): " + item1.getDelay(TimeUnit.MILLISECONDS));
        System.out.println("Item2 delay (ms): " + item2.getDelay(TimeUnit.MILLISECONDS));

        // Compare again after sleep
        comparison = item1.compareTo(item2);
        if (comparison < 0) {
            System.out.println("Item1 will expire before Item2");
        } else if (comparison > 0) {
            System.out.println("Item1 will expire after Item2");
        } else {
            System.out.println("Item1 and Item2 expire at the same time");
        }
    }
}
