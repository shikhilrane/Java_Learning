package _23_Collection_Framework._02_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(25,"y");
        System.out.println(map);

        System.out.println(map.get(25));

        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("y"));

        Set<Integer> keys = map.keySet();
        for (int i : keys){
            System.out.println(i);
            System.out.println(map.get(i));
        }

        Collection<String> val = map.values();
        for (String i : val){
            System.out.println(i);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> i : entries){
            System.out.println(i.getKey() + " : " + i.getValue());
        }



    }
}
