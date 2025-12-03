package _28_Multithreading._08_Locks._02_With_Manual_Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();


    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance >= amount){
                    System.out.println(Thread.currentThread().getName() + " processing with withdrawals");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Good practice to write this because if it gets interrupted, then we will loose its state and code will shut
                    } finally {
                        lock.unlock();
                    }
                    balance = balance - amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdrawals and remaining balance is " + balance);
                }else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not aquire the lock will try again later.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Good practice to write this because if it gets interrupted, then we will loose its state and code will shut
        }

        if(Thread.currentThread().isInterrupted()){     // As we catched interrupt(), we can give clean code here from its interrupt state
            System.out.println("sorry couln't complete your request");
        }
    }
}
