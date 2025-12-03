package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._01_cancel__boolean_may_Interrupt_If_Running;

import java.util.concurrent.Future;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CancelMethodExample<V> implements Future<V> {

    private boolean cancelled = false;
    private boolean done = false;
    private V result;

    public CancelMethodExample(V result) {
        this.result = result;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        if (done) return false;
        cancelled = true;
        done = true;
        System.out.println("Task cancelled");
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

    @Override
    public V get() throws InterruptedException, ExecutionException {
        if (cancelled) throw new CancellationException();
        done = true;
        return result;
    }

    @Override
    public V get(long timeout, TimeUnit unit) {
        // Simplified
        return null;
    }
}

