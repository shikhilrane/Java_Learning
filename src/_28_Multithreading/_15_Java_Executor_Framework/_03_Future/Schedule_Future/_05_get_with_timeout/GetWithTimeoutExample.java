package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._05_get_with_timeout;

import java.util.concurrent.*;

public class GetWithTimeoutExample<V> implements Future<V> {

    private final V result;
    private final long processTimeMillis;  // simulate task processing time
    private boolean cancelled = false;
    private boolean done = false;

    public GetWithTimeoutExample(V result, long processTimeMillis) {
        this.result = result;
        this.processTimeMillis = processTimeMillis;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        if (done) return false;
        cancelled = true;
        done = true;
        return true;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    // Simple get() without timeout
    @Override
    public V get() throws InterruptedException, ExecutionException {
        if (cancelled) throw new CancellationException();
        Thread.sleep(processTimeMillis);  // simulate delay
        done = true;
        return result;
    }

    // get() with timeout support
    @Override
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        if (cancelled) throw new CancellationException();

        long timeoutMillis = unit.toMillis(timeout);

        if (processTimeMillis > timeoutMillis) {
            // If the simulated processing time is more than timeout, throw TimeoutException
            throw new TimeoutException("Timeout while waiting for result");
        }

        Thread.sleep(processTimeMillis);  // simulate processing delay
        done = true;
        return result;
    }
}