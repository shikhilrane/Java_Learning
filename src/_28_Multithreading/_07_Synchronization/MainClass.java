package _28_Multithreading._07_Synchronization;

public class MainClass {
    public static void main(String[] args) {
        Counter c1 = new Counter();         // 1.
        MyThread t1 = new MyThread(c1);     // 2.
        MyThread t2 = new MyThread(c1);     // 3.
        t1.start();                         // 4.
        t2.start();                         // 5.
        try{
            t1.join();                      // 6.
            t2.join();                      // 7.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c1.getCount());  // 8.
    }
}

/*
    1. Created an object of Counter class c1
    2. Created a thread of MyThread class t1 and passed object of class Counter c1
    3. Created a thread of MyThread class t2 and passed object of class Counter c1
    4-5. Starts both threads, allowing them to run concurrently. Each thread will try to increment the shared count 1000 times.
    6-7. Ensures the main thread waits until both t1 and t2 have finished executing before printing the final count.
    8. It will print count.

    In Counter class, we created a variable name as counter and incremented it with the help of counterIncrement method and gets the value with the help of getCount()

    In MyThread class, we created a thread and imported count variable from Counter class, pushed it in constructor of MyThread, and also created a loop that will run 1000, so now every thread that will pass object of class Counter in its constructor, that thread will invoke method countIncrement() from counter class and will apply for loop on countIncrement(); separately by every thread

    Before Synchronisation : when both threads run and When countIncrement() is not synchronized, both threads may access and modify count at the same time. This results in a final count less than expected. This is known as a Race Condition — unpredictable behavior due to concurrent access to shared resources.

    After Synchronisation : When we used synchronized keyword on countIncrement() method (also known as critical condition), it will first let t1 to execute and then let t2 to execute. (i.e. If t1 is inside countIncrement(), t2 must wait until t1 exits). It is also called as mutual exclusion.
*/