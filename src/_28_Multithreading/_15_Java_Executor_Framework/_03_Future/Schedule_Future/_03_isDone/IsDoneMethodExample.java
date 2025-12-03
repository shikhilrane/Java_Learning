package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._03_isDone;

import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class IsDoneMethodExample<V> implements Future<V> {

    private boolean done = true;  // Example, already done
    private V result;

    public IsDoneMethodExample(V result) {
        this.result = result;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        return result;
    }

    @Override
    public V get(long timeout, TimeUnit unit) {
        // Simplified
        return null;
    }
}

