package _26_Java_Stream._02_Introduction_to_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LearnStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // Traditional way (Without Stream)
        int count = 0;
        for (int i : numbers){
            if (i%2==0){
                count++;
            }
        }
        System.out.println(count);

        // With Stream
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        // Creating Stream
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
