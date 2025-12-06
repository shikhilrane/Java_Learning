import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        HashSet<Integer> hs = new HashSet<>(al);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        System.out.println(hs);
        hs.addAll(al);

        System.out.println(hs.contains(20));
        System.out.println(hs.isEmpty());
        System.out.println(hs.hashCode());

        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
