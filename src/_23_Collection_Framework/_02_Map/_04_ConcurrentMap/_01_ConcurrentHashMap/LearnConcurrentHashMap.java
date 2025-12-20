package _23_Collection_Framework._02_Map._04_ConcurrentMap._01_ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class LearnConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    }
}

// ConcurrentHashMap
//  In Java 7,
    //  It works with segment based locking means the map will get divided into segments. By default, it will get divided into 16 segments (like a 16 number of small hashmaps). In Short, ConcurrentHashMap will get divided into 16 segments. Each segment will have its own lock (Like if we want to read or put then we will perform his in particular segment so other segments will be independent of this segment)
    // read : read operation (get) doesn't require locking unless there is a write operation happening on the same segment
    // write : write operation will lock the segment (put or update)

// In Java 8,
    // No Segmentation, Because We have 16 (fixed number) segments only so we can't scale it to large, if the hashmap is large then there will a lot of waiting like if the hashmap is large then its segments are also large. Segment can have many buckets and key-value pairs. if we want to update the values of multiple segments at single time then waiting time will also be increased
    // In Java 8, It uses COMPARE AND SWAP (CAS) approach, there is no locking except resizing or collision. Means locking will happen only if resizing or collision happens
    // Working of ConcurrentHashMap :
    //      If the value of x = 42;
    //      ThreadA wants to change the value of x = 42 to x = 50
    //      ThreadA has last saw the value of x = 42
    //      Before changing it will check if the value of x = 42, if yes then it will change and if not (in case other thread may have changed the value) then it will retry.
    //      retry = as other thread have changed value to x = 45, then again it will repeat the procedure
    //      retry will happen again and again, then thread will retry after short random time. So, It does not let cpu wastage
    // Working of ConcurrentHashMap on HashMap :
    //      there are 16 buckets in HashMap, if we want to put or update in bucket then it will work there
    //      If there is collision, means LinkedList is there then there will be lock on the bucket because things will get messy in LinkedList
    //      If there is resizing, if threshold reaches then unlike HashMap, ConcurrentHashMap increases specific number of buckets. like number of buckets increased and two threads tried to access the newly created bucket then at same time, then there will be problem in that case and locking will be mandatory in that case.

// ConcurrentHashMap doesn't store data in sorted manner and if we want to store data in sorted and synchronised manner then we will use ConcurrentSkipListMap