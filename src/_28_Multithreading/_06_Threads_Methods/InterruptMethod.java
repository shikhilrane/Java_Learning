package _28_Multithreading._06_Threads_Methods;

public class InterruptMethod extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(10);
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupt : " + e);
        }
    }

    public static void main(String[] args) {
        InterruptMethod t1 = new InterruptMethod();
        t1.start();
        t1.interrupt();
    }
}

// t1.interrupt(); killed a thread as it was sleeping. It actually kills a method that sleeps