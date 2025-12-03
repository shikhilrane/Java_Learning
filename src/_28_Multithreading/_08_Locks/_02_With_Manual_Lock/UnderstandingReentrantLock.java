package _28_Multithreading._08_Locks._02_With_Manual_Lock;

// 3. Understanding working of ReentrantLock();

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnderstandingReentrantLock {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
//        lock.lockInterruptibly();     // We can achive interruption here if we used Thread.interrupt() in main method
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        UnderstandingReentrantLock url = new UnderstandingReentrantLock();
        url.outerMethod();
    }
}

/*
    1. outerMethod() acquires the lock and calls innerMethod(), which also acquires the same lock again.
    2. This works fine because ReentrantLock is reentrant — the same thread can acquire the same lock multiple times without blocking itself.
    3. A ReentrantLock is a mutual exclusion lock with the same basic behavior as the synchronized keyword, but with extended capabilities like It allows a thread to re-enter the same lock it already holds. And The lock must be released the same number of times it was acquired.
        In this case,
            So in this case:
                lock.lock() is called in outerMethod → lock count = 1
                lock.lock() is called again in innerMethod → lock count = 2
                lock.unlock() in innerMethod → lock count = 1
                lock.unlock() in outerMethod → lock count = 0 (fully released)
    4. If you forget to unlock, or mismatch lock/unlock calls, the lock will never be fully released, which could lead to deadlocks.
*/