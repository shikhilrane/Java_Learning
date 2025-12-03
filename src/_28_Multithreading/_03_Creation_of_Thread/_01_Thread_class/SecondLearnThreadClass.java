package _28_Multithreading._03_Creation_of_Thread._01_Thread_class;

public class SecondLearnThreadClass extends Thread {    // 1.
    @Override
    public void run() {                                 // 2.
        for (int i = 0; i < 100000; i++) {              // 3.
            System.out.println("Second Class Thread Class");
        }
    }
}
