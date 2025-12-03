package _28_Multithreading._09_Fairness_Of_Lock._01_Unfair_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {
    private final Lock unfairLock = new ReentrantLock();

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } catch (RuntimeException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {
        UnfairLock ul = new UnfairLock();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                ul.accessResource();
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/*
    Unfair lock lock means it can be execute in scrambled fashion even some threads may get chance to execute but some threads may not.
    In multithreading, unfair locks do not guarantee a first-come-first-served (FIFO) ordering for threads waiting to acquire the lock. This means that a thread that just became ready (e.g., just started or woke up from sleep) might "barge in" and acquire the lock even if other threads have been waiting longer.
    Java's ReentrantLock has two modes:
        new ReentrantLock(true) – Fair lock (FIFO)
        new ReentrantLock(false) or just new ReentrantLock() – Unfair lock (default)

    Unfair Lock Example using ReentrantLock()

          In multithreading, when multiple threads try to access a shared resource,
          we use locks to ensure that only one thread can access it at a time.

          By default, Java's ReentrantLock is **unfair**:
               new ReentrantLock();

          An unfair lock **does not follow** the first-come-first-served rule.
          This means a thread that just came may acquire the lock **before**
          other threads that have been waiting for longer.

          As a result, some threads may get the lock multiple times,
          while others may get skipped or have to wait longer — this is called **starvation**.

          In the output, you may see that threads acquire the lock in a **random order**,
          like Thread 3 → Thread 1 → Thread 2, etc., even if they started together.

          This example helps you understand how **unfair locking** behaves in Java,
          and why fairness might be important in some cases.
*/