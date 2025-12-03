package _28_Multithreading._08_Locks._01_With_inbuiltLock;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (balance >= amount){
            System.out.println(Thread.currentThread().getName() + " processing with withdrawals");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawals and remaining balance is " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}
