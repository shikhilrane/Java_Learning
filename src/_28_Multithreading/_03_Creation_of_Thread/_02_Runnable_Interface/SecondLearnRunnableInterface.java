package _28_Multithreading._03_Creation_of_Thread._02_Runnable_Interface;

public class SecondLearnRunnableInterface implements Runnable{          // 1.
    @Override
    public void run() {                                                 // 2.
        for (int i = 0; i < 100000; i++) {                              // 3.
            System.out.println("Second Class Runnable Interface");
        }
    }
}
