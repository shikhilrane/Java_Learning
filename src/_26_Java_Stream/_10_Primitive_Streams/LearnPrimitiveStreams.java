package _26_Java_Stream._10_Primitive_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearnPrimitiveStreams {
    public static void main(String[] args) {
        // Wrapper Class Stream (We were working on this in previous chapter)
        Integer[] nums = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(nums);

        // Primitive Stream
        int[] numbers = {10,20,30,40,50};
        IntStream stream1 = Arrays.stream(numbers);

        // range()
        List<Integer> collectIntStr1 = IntStream
                .range(10, 50)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collectIntStr1);

        // rangeClosed()
        List<Integer> collectIntStr2 = IntStream
                .rangeClosed(10, 50)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collectIntStr2);

        // .of
        IntStream intStream = IntStream.of(2, 4, 5, 6, 7, 9);

        //
        IntStream intStr = new Random().ints(5);
        System.out.println(intStr.boxed().toList());

        DoubleStream doublesStream = new Random().doubles(5);
        System.out.println(doublesStream.boxed().toList());
    }
}
