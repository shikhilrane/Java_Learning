package _28_Multithreading._15_Java_Executor_Framework._04_Delayed._02_Compare_To;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class ComparableDelayedItem implements Delayed {

    private final long startTime;

    public ComparableDelayedItem(long delayInMilliseconds) {
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startTime - System.currentTimeMillis();
        return unit.convert(delay, TimeUnit.MILLISECONDS);
    }

    // Compare two Delayed items based on remaining delay
    @Override
    public int compareTo(Delayed other) {
        if (this.getDelay(TimeUnit.MILLISECONDS) < other.getDelay(TimeUnit.MILLISECONDS)) {
            return -1; // this comes before
        }
        if (this.getDelay(TimeUnit.MILLISECONDS) > other.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;  // this comes after
        }
        return 0; // both are equal
    }
}
