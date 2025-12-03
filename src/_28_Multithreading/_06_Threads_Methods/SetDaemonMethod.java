package _28_Multithreading._06_Threads_Methods;

public class SetDaemonMethod extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        SetDaemonMethod t1 = new SetDaemonMethod();     // user threads
        t1.setDaemon(true);
        t1.start();
        System.out.println("DONE");
    }
}

// User Threads = Threads which we creates

// Daemon Threads = These are internal thread used by java. If we didn't apply .setDaemon(true); before .start method then while loop will run infinite times. But as we have applied Daemon as true then it goes to start method and printed "Hello" several times and came back to main method and printed "DONE". And if all the methods in main method completed then it will kill the while loop as well and doesn't execute it later