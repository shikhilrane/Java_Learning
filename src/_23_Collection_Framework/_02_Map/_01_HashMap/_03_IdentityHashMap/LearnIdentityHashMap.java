package _23_Collection_Framework._02_Map._01_HashMap._03_IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class LearnIdentityHashMap {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");

        // 1. using HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(key1, 1);
        hashMap.put(key2, 2);

        System.out.println("HashMap : " + hashMap);
        // HashMap uses equal method to compare keys, means HashMap compares the content. Here, content will get override

        // 2. using IdentityHashMap
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, 1);
        identityHashMap.put(key2, 2);

        System.out.println("IdentityHashMap : " + identityHashMap);
        // HashMap uses == to compare keys, means IdentityHashMap compares the reference. Here, reference is different so it will store both entries to different indexes of an array

    }
}
