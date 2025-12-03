package _28_Multithreading._06_Threads_Methods;

public class YieldMethod extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();     // It gives chance to other thread to executes. Again its just a HINT to JVM and OS
        }
    }

    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod();
        YieldMethod t2 = new YieldMethod();
        t1.start();
        t2.start();
    }
}
