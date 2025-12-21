package _23_Collection_Framework._01_Collection_Interface._02_Queue_interface._08_DelayQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class LearnDelayQueue {
    public static void main(String[] args) throws InterruptedException {
        // Thread safe and unbounded blocking queue
        // Elements can only be taken from the queue when their delay has expired
        // Used for scheduling tasks to be executed after a certain delay
        // Internally priority queue is used
        BlockingQueue<DelayedTask> queue = new DelayQueue<>();

        queue.put(new DelayedTask("Task1", 5000));  // 5 seconds
        queue.put(new DelayedTask("Task2", 3000));  // 3 seconds
        queue.put(new DelayedTask("Task3", 10000)); // 10 seconds

        while (!queue.isEmpty()) {
            DelayedTask task = queue.take(); // blocks until delay expires
            System.out.println("Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }
    }
}


class DelayedTask implements Delayed {

    private final String taskName;
    private final long executionTime; // absolute time

    public DelayedTask(String taskName, long delayInMillis) {
        this.taskName = taskName;
        this.executionTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = executionTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(this.executionTime,
                ((DelayedTask) other).executionTime);
    }

    public String getTaskName() {
        return taskName;
    }
}