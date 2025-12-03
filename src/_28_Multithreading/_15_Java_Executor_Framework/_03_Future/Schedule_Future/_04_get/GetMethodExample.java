package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._04_get;

import java.util.concurrent.Future;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GetMethodExample<V> implements Future<V> {

    private V result;
    private boolean cancelled = false;

    public GetMethodExample(V result) {
        this.result = result;
    }

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
        return true;
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        if (cancelled) throw new CancellationException();
        return result;
    }

    @Override
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException {
        return get();
    }
}

