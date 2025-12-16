package _23_Collection_Framework._02_Map._01_HashMap._01_LinkedHashMap.LRU_Cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity; // when this returns true, the *eldest entry* (least recently used entry) is removed
    }

    public static void main(String[] args) {
        // CASE - 1
        LRUCache<String, Integer> studentMap1 = new LRUCache<>(3);
        studentMap1.put("Bob" ,99);
        studentMap1.put("Alice" ,89);
        studentMap1.put("Oscar" ,91);
        studentMap1.put("Victor" ,89);
        System.out.println("CASE 1 : " + studentMap1);
        // As we have added 4th entry then at that point first entry got removed

        // CASE - 2
        LRUCache<String, Integer> studentMap2 = new LRUCache<>(3);
        studentMap2.put("Bob" ,99);
        studentMap2.put("Alice" ,89);
        studentMap2.put("Oscar" ,91);
        studentMap2.get("Bob");
        studentMap2.put("Victor" ,89);
        System.out.println("CASE 2 : " + studentMap2);
        // Here, before adding 4th entry we used first entry, and then added 4th entry, so 2nd entry becomes the Least Recently Used entry, so it would get removed
    }
}

/*
    Objectives -
        1. Extend LRUCache with LinkedHashMap to create subclass
        2. We will create 3 entities in it first and if 4th entry add then Least Recently Used entry will be get removed

    Steps -
        1. Extended LRUCache with LinkedHashMap to create LRUCache as a subclass of LinkedHashMap
        2. Created private Integer capacity; to pass it in constructor,
        3. Created a constructor and called parent's constructor by using super() keyword and passed custom capacity, loadFactor and accessOrder as true, and also passed capacity in LRUCache's constructor to pass
        4. Override removeEldestEntry method of LinkedHashMap that returns boolean value
        5. in main method, created an object of LRUCache
*/