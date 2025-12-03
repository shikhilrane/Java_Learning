package _28_Multithreading._04_Thread_Lifecycle;

public class LearnThreadLifecycle extends Thread{
    @Override
    public void run() {                                         // 4.
        System.out.println("Thread 2 Running");                 // 7.
        try {
            Thread.sleep(2000);         // execution of t1 thread paused for 2 seconds
            System.out.println("execution of run method");      // 11.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LearnThreadLifecycle t1 = new LearnThreadLifecycle();  // 1.    // NEW
        System.out.println(t1.getState());                     // 2.    // to check the state of the thread, NEW here

        t1.start();                                            // 3.    // RUNNABLE
        System.out.println(t1.getState());                     // 5.    // to check the state of the thread, RUNNABLE here

        Thread.sleep(100);               // 6             // Paused for 100ms (The method in which we write Thread it shows/executes information of that method only)

        System.out.println(t1.getState());     // 8                     // BLOCKED/WAITING

        Thread.sleep(200);               // 9

        System.out.println(t1.getState());     // 10                    // BLOCKED/WAITING

        Thread.sleep(2100);              // 12

        System.out.println(t1.getState());     // 13                    // TERMINATED
    }
}

/*
    1. Object created for LearnThreadLifecycle
    2. Checked the state for thread t1
    3. Started a thread so it just get loaded in RUNNABLE
    4. Whenever run() gets space from CPU it will run, JVM gives space in CPU
    5. So it gets printed because // 4 is just get in memory but not executed
    6. Current thread sleep here for 100 MilliSeconds (NOTE : When a thread calls Thread.sleep(), it enters the TIMED_WAITING state, allowing the CPU to perform context switching and let other threads run. and CPU executes the method which one is more prioritized)
    7. It gets printed and then it sleeps for 2 seconds (so again context switching will happen).
    8. So it came to main method and will print that TIMED_WAITING because run method has sleep of 2000ms because 100<2000 so lesser timed statement will print first
    9. it says the wait time of 200ms which is still lesser than 2000ms of run method
    10. so it will print that TIMED_WAITING because run method has sleep of 2000ms because 200<2000 so lesser timed statement will print first
    11. but when it goes to //12 then it observed that it has sleep time of 2100ms which is greater than sleep time of run method so it goes there in // 11 and printed that
    12. It came back to //12 and waited for 2100ms
    13. Printed TERMINATED for t1 because all the execution inside of t1 gets completed.
*/