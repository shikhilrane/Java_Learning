package _26_Java_Stream._04_Intermediate_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//    1. Intermediate Operations transforms stream into another stream
//    2. They are lazy, meaning they don't execute until a terminal operation is invoked.

public class IntermediateOperation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Australia", "Britain", "China", "China", "Denmark");

        // 1. filter()
        // In Stream<>
        Stream<String> filteredStream = list
                .stream()
                .filter(x -> x.startsWith("A")); // to execute this we need to perform terminal ops, thats why it is lazy
        // No filtering at this point because no terminal ops has performed
        long filterResult = filteredStream.count();   // To stop filtering, we need to apply terminal operations like .count() or .collect() or etc.
        System.out.println(filterResult);

        // In List<>
        List<String> filteredStreamListToList = list
                .stream()                                   // Source (Learnt in last chapter)
                .filter(x -> x.endsWith("a"))        // Intermediate Operations  (Currently learning in this chapter)
                .collect(Collectors.toList());              // Terminal Operations (We will see this in next chapter)
        System.out.println(filteredStreamListToList);

        // 2. map()
        List<String> mapStream = list
                .stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(mapStream);
        
        // 3. sorted()
        // Sorted stream using natural comparator
        List<String> sortedStream = list
                .stream()
                .sorted()
                .toList();
        System.out.println(sortedStream);
        // Sorted stream using Custom Comparator
        List<String> sortedStreamDesc = list
                .stream()
                .sorted((a,b) ->  b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(sortedStreamDesc);

        // 4. distinct
        List<String> dinstinctStream = list
                .stream()
                .filter(x -> x.endsWith("a"))   // Filter elements that endsWith("A");
                .distinct()                           // From filtered elements, if there are same elements found, then all those will be considered as single element
                .collect(Collectors.toList());
        System.out.println(dinstinctStream);

        // 5. limit (Use to limit the infinite streams like .iterate())
        List<Integer> iterateLimit = Stream
                .iterate(1, x -> x + 1)  // It will start counting from 1 to run infinite
                .limit(50)                    // As we have limit it to 50, then it will stop at 50
                .collect(Collectors.toList());
        System.out.println(iterateLimit);

        // 6. skip
        List<Integer> iterateSkipLimit = Stream
                .iterate(1, x -> x + 1)  // It will start counting from 1 to run infinite
                .skip(10)                          // Ignores the first 10 elements of the stream and processes the remaining elements.
                .limit(50)                    // As we have limit it to 50, then it will stop at 50
                .collect(Collectors.toList());
        System.out.println(iterateSkipLimit);
    }
}
