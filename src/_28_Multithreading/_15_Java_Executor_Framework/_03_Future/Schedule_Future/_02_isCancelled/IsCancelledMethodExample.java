package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._02_isCancelled;

import java.util.concurrent.Future;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class IsCancelledMethodExample<V> implements Future<V> {

    private boolean cancelled = true;  // Example, already cancelled

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public boolean isDone() {
        return cancelled;  // if cancelled then done
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        throw new CancellationException();
    }

    @Override
    public V get(long timeout, TimeUnit unit) {
        // Simplified
        return null;
    }
}

