package _28_Multithreading._07_Synchronization;

public class Counter {
    public int count = 0;

    public synchronized void countIncrement(){
        count++;
    }

    public int getCount(){
        return count;
    }

}
