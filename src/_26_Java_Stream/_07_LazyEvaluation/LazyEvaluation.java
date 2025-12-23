package _26_Java_Stream._07_LazyEvaluation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> stringStream = name                      // 3.
                .stream()
                .filter(x -> {
                    System.out.println("Filtering : " + x);
                    return x.length() > 3;
                });

        System.out.println("Before Terminal Operation");        // 1.

        List<String> result = stringStream.collect(Collectors.toList());    // 2.

        System.out.println("After Terminal Operation");     // 4.

        System.out.println(result);     // 5
    }
}

/*
    1. This statement will run before stringStream's print statement because we haven't applied terminal operation on it
    2. Applied terminal operation on here to start the stream
    3. As we applied terminal operation in 2. , then it will start executing
    4. Print statement
    5. It will print final expected result
*/