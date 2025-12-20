package _23_Collection_Framework._02_Map._04_ConcurrentMap._02_ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class LearnConcurrentSkipListMap {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> concurrentSkipListMap = new ConcurrentSkipListMap<>();
    }
}

/*
    SkipList (Sorted LL, Layers and fast access) -
        1. SkipList is a data structure
        2. SkipList allows efficient search, insertion and deletion operation
        3. SkipList is a sorted LinkedList but with multiple layers that "skip" over portions of the list to provide faster access to elements
        4. e.g. SkipList = 1,2,3,4,5,6,7,8,9
              Layer 3 - 1 , --- , 5 , --- , 9
              Layer 2 - 1 , --- , 3 , --- , 5 , --- , 7 , --- , 9
              Layer 1 - 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9
              If we want to search 2, then first it will go on Layer 1, and will check if 2 is present there and if not present then it will check on Layer 2 and as this is sorted list then it will check only till 3  and if there is not then it will check on Layer 1

    ConcurrentSkipListMap -
        1. Nodes from SkipList will get converted into Map (i.e. key value pair)
        2. It implements ConcurrentNavigableMap, and ConcurrentNavigableMap extends ConcurrentMap and NavigableMap (So we can apply methods of NavigableMap)
*/