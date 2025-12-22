package _26_Java_Stream._05_Terminal_Operations;

// Terminal operations trigger and finish the stream pipeline, producing a result or side effect

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LearnTerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // 1. collect (Use to return list from stream)
        List<Integer> collectList = list
                .stream()
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(collectList);

        // 2. forEach (use to iterate over list, It does not return anything because it take consumer in it as parameter)
        list
                .stream()
                .skip(1)
                .forEach(x -> System.out.println(x));

        // 3. reduce (Combines the elements to produce a single elements)
        int reduceList = list
                .stream()
                .filter(x -> x % 2 == 0)        // It will retrieve all positive numbers from list
                .reduce(5, (x, y) -> x + y);    // This will added all them and identity is like accumulator
        System.out.println(reduceList);

        // 4. count (It counts the number of elements from stream, it returns long)
        long countList = list
                .stream()
                .filter(x -> x>=5)
                .count();
        System.out.println(countList);

        // 5. anyMatch (if any element meets the condition inside anyMatch then it will return true or else false, return boolean)
        boolean anyMatchList = list
                .stream()
                .anyMatch(x -> x % 2 == 0);
        System.out.println(anyMatchList);

        // 6. allMatch (if all element meets the condition inside allMatch then it will return true or else false, return boolean)
        boolean allMatchList = list
                .stream()
                .allMatch(x -> x % 2 == 0);
        System.out.println(allMatchList);

        // 7. noneMatch (if no element meets the condition inside noneMatch then it will return true or else false, return boolean)
        boolean noneMatchList = list
                .stream()
                .noneMatch(x -> x % 2 == 0);
        System.out.println(noneMatchList);

        // 8. findFirst
        Optional<Integer> findFirstList = list
                .stream()
                .skip(3)
                .findFirst();
        System.out.println(findFirstList);

        // 8. findAny-
        Optional<Integer> findAnyList = list
                .stream()
                .skip(3)
                .findAny();
        System.out.println(findAnyList);
    }
}
