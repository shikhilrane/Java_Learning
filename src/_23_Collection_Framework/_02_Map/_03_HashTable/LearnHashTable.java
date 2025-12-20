package _23_Collection_Framework._02_Map._03_HashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class LearnHashTable {
    public static void main(String[] args) {
        // HashTable is same as HashMap
        Hashtable<Integer, String > hashtable = new Hashtable<>();
        hashtable.put(32, "thirty two");
        hashtable.put(55, "fifty five");    // All operations are same as HashMap
        System.out.println(hashtable);

        // HashMap Multi-threading
        HashMap<Integer, String> hashMap = new HashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                hashMap.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap : " + hashMap.size());

        // Hashtable Multi-threading
        Hashtable<Integer, String> hashtable1 = new Hashtable<>();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashtable1.put(i, "Thread3");
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                hashtable1.put(i, "Thread4");
            }
        });
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final size of Hashtable : " + hashtable1.size());
    }
}

/*
    Key Characteristics of HashTable (differences between Hashtable and HashMap)
    1. HashTable is synchronised and rest all operations are same that are present in HashMap
    2. It does not allow null key or null value
    3. It is a Legacy class so we use ConcurrentHashMap for threadsafe operations
    4. HashTable is slower than HashMap because of overhead of multithreading
    5. Only LinkedList (no Red-Black tree) is created, even after multiple collision of hashcode in array
    6. Each and every method like put, get, etc. are synchronised and that is why locking is there, like reading operations are even locked due to multithreading and that is why hashtable is not use, so we use ConcurrentMap
*/