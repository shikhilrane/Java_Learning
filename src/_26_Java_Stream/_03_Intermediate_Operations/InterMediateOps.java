package _26_Java_Stream._03_Intermediate_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InterMediateOps {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Australia", "Britain", "China", "Denmark");

        // 1. filter
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")); // to execute this we need to perform terminal ops, thats why it is lazy
        // No filtering at this point because no terminal ops has performed
        long filterResult = filteredStream.count();   // count is filter operation
        System.out.println(filterResult);

        // 2. map
        Stream<String> mapStream = list.stream().map(x -> x.toUpperCase());
        String mapResult = String.valueOf(mapStream.count());
        System.out.println(mapResult);
        
        // 3. sorted
        Stream<String> sortedStream = list.stream().sorted();

    }
}
