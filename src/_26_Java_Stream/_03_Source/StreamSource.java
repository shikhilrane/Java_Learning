package _26_Java_Stream._03_Source;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Source is the way to convert any object to the Stream

public class StreamSource {
    public static void main(String[] args) {
        // 1 From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        // 2 from Arrays
        String[] array = {"a", "b", "_02_Stream"};
        Stream<String> stream1 = Arrays.stream(array);
        // 3 Using Stream.of()
        Stream<String> stream2 = Stream.of("x", "y", "z");
        // 4 Infinite Stream
        Stream<Integer> stream3 = Stream.generate(() -> 1).limit(10); //all the stream will have 1 in it if we add limit then only 10 streams (we will this see later)
        // 2nd way of creating infinite stream
        Stream.iterate(1, x -> x + 1);
        // seed = initial position, integer = operation on next
        // 1, x -> x + 1 = 1 + 1 = 2
        // 2, x -> x + 1 = 2 + 1 = 3 and so on...
    }
}
/*
    1 From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
    2 from Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);
    3 Using Stream.of()
        Stream<String> stream2 = Stream.of("x", "y", "z");
    4 Infinite Stream
      1st way of creating infinite stream
        Stream<Integer> stream3 = Stream.generate(() -> 1).limit(10); //all the stream will have 1 in it if we add limit then only 10 streams (we will this see later)
      2nd way of creating infinite stream
        Stream.iterate(1, x -> x + 1);
         seed = initial position, integer = operation on next
         1, x -> x + 1 = 1 + 1 = 2
         2, x -> x + 1 = 2 + 1 = 3 and so on...
*/