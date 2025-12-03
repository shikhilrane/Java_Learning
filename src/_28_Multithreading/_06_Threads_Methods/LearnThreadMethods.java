package _28_Multithreading._06_Threads_Methods;

public class LearnThreadMethods extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LearnThreadMethods t1 = new LearnThreadMethods();
        t1.start();
        t1.join();
        System.out.println("Hi");   // Hi is in main method and it will be print only after the completion of t1 thread because we used .join() method
    }
}
