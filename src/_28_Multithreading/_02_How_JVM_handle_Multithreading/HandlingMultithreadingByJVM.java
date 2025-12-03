package _28_Multithreading._02_How_JVM_handle_Multithreading;

public class HandlingMultithreadingByJVM {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println(Thread.currentThread().getName());   // This will give main as output, showing this is main thread
    }
}
