package _28_Multithreading._09_Fairness_Of_Lock._02_FairLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLock {
    private final Lock fairLock = new ReentrantLock(true);      // Use true here to make lock fair

    public void accessResource(){
        fairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } catch (RuntimeException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            fairLock.unlock();
        }
    }

    public static void main(String[] args) {
        FairLock ul = new FairLock();
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
  Fair Lock Example using ReentrantLock(true)

   In multithreading, when multiple threads try to access a shared resource,
   we need a lock to make sure only one thread can access it at a time.

   By default, Java's ReentrantLock is "unfair", which means threads may get the lock randomly.
   Some threads might get skipped or starved if others keep jumping ahead.

   In this example, we use a **fair lock** by passing 'true' to ReentrantLock:
        new ReentrantLock(true);

   A fair lock follows the **first-come-first-served (FIFO)** rule.
   Threads will get the lock in the same order they requested it.
   This helps make sure every thread gets a chance and no thread is left waiting too long.

   In the output, you will see that threads acquire the lock in the order:
   Thread 1, Thread 2, Thread 3, etc., even if all started at the same time.

 */
