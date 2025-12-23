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
        System.out.println(numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .count());
    }
}
