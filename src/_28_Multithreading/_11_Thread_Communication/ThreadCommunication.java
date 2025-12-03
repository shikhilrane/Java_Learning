package _28_Multithreading._11_Thread_Communication;

class SharedResource{
    private int data;                   // data field to check if data produced by producer or to check if consumer wants to consume (store data for p and _02_Stream)
    private boolean hasData;            // By default, it marks as false and we will change this flag according to our use case

    public synchronized void produce(int value){    // 7
        while (hasData){                            // 8
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;                               // 9
        hasData = true;                             // 10
        System.out.println("Produced " + value);    // 11
        notify();                                   // 12
    }

    public synchronized int consume(){
        while (!hasData){                           // 14
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;                            // 15
        System.out.println("Consumed " + data);     // 16
        System.out.println();
        notify();                                   // 17
        return data;
    }
}

class Producer implements Runnable{
    private SharedResource resource;    // This is for passing an object of SharedResource class in thread

    public Producer(SharedResource resource) {  // Constructor of Thread will receive an object of class
        this.resource = resource;
    }

    @Override
    public void run() {                             // 6
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable{
    private SharedResource resource;    // This is for passing an object of SharedResource class in thread

    public Consumer(SharedResource resource) {  // Constructor of Thread will receive an object of class
        this.resource = resource;
    }

    @Override
    public void run() {                             // 13
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}


public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();   // 1
        Thread t1 = new Thread(new Producer(sr));   // 2
        Thread t2 = new Thread(new Consumer(sr));   // 3

        t1.start();                                 // 4
        t2.start();                                 // 5
    }
}

/*
    1. Created an object of class SharedResource
    2. Created thread t1 from for Producer class that implements Runnable interface and passed an object of SharedResource in it.
    3. Created thread t2 from for Consumer class that implements Runnable interface and passed an object of SharedResource in it.
    4. Started Thread t1
    5. Started Thread t2
    6. Thread 1 will execute run() method, and produce 0 for first iteration
    7. Producer thread t1 will come here
    8. Check if hasData = true, if false then it won't wait and proceed to // 9 and if true, then it will have to wait till consumer mark it false.
    9. Producer carrying data (initially 0, which is produced from loop), will be stored here in data
    10. And marked hasData = true, After setting hasData = true, the producer calls notify() (Step 12), then exits the method, not loops again immediately. It doesn't go back to Step 6 unless the scheduler wakes it again. The producer waits its turn.
    11. Data will be printed that Producer has produced
    12. Notify to Consumer thread t2 to wake up and consume data
    13. Thread t2 will execute run() method to store data produced by producer thread t1.
    14. Check if hasData = false, if false then it will have to wait and if true, then it will proceed further to // 15.
    15. It sets hasData = false and tells the producer, “you can produce again now.” So the producer is unblocked at its wait() call and resumes.
    16. Consumer will print data which it received
    17. And notify() thread t1 to make further operation
    ...this process will be last till loop continues
*/
