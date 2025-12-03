package _28_Multithreading._06_Threads_Methods;

public class SetPriority extends Thread{
    public SetPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Priority : " + Thread.currentThread().getPriority() + " Count : " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SetPriority t1 = new SetPriority("LOW");
        SetPriority t2 = new SetPriority("MEDIUM");
        SetPriority t3 = new SetPriority("HIGH");
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}

// When t1.start() executes for first time then it go in run method and it will be purely dependent on CPU about what it want to executes first