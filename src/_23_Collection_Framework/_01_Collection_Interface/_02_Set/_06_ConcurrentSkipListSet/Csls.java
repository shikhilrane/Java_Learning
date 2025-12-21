package _23_Collection_Framework._01_Collection_Interface._02_Set._06_ConcurrentSkipListSet;

// It is thread safe
// It Implements NavigableSet or Set

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Csls {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new ConcurrentSkipListSet<>();
    }
}
