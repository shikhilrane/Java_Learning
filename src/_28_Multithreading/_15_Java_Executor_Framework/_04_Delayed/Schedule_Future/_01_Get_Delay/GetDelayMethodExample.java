package _28_Multithreading._15_Java_Executor_Framework._04_Delayed.Schedule_Future._01_Get_Delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class GetDelayMethodExample implements Delayed {

    private final long startTime;

    public GetDelayMethodExample(long delayMillis) {
        this.startTime = System.currentTimeMillis() + delayMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return 0;  // Not implemented here
    }
}
