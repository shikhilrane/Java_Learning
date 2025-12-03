package _28_Multithreading._15_Java_Executor_Framework._04_Delayed.Schedule_Future._02_Compare_To;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class CompareToMethodExample implements Delayed {

    private final long startTime;

    public CompareToMethodExample(long delayMillis) {
        this.startTime = System.currentTimeMillis() + delayMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;  // Not implemented here
    }

    @Override
    public int compareTo(Delayed other) {
        long diff = this.startTime - ((CompareToMethodExample) other).startTime;
        return Long.compare(diff, 0);
    }
}