package _28_Multithreading._15_Java_Executor_Framework._04_Delayed._01_Get_Delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedItem implements Delayed {

    private final long startTime;  // When this item should become available (in ms)

    public DelayedItem(long delayInMilliseconds) {
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
    }

    // Required by Delayed interface
    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startTime - System.currentTimeMillis(); // time left
        return unit.convert(delay, TimeUnit.MILLISECONDS);   // convert to requested unit
    }

    // Dummy compareTo to satisfy interface; not used here
    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
