package _26_Java_Stream._05_Terminal_Operations;

// Terminal operations trigger and finish the stream pipeline, producing a result or side effect

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnTerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // 1. collect (Use to return list from stream)
        List<Integer> collectList = list
                .stream()
                .skip(1)
                .collect(Collectors.toList());
        System.out.println("toList : " + collectList);

        // 2. forEach (use to iterate over list, It does not return anything because it take consumer in it as parameter)
        list
                .stream()
                .skip(1)
                .forEach(x -> System.out.println("forEach : " + x));

        // 3. reduce (Combines the elements to produce a single elements)
        int reduceList = list
                .stream()
                .filter(x -> x % 2 == 0)        // It will retrieve all positive numbers from list
                .reduce(5, (x, y) -> x + y);    // This will added all them and identity is like accumulator
        System.out.println("reduce : " + reduceList);

        // 4. count (It counts the number of elements from stream, it returns long)
        long countList = list
                .stream()
                .filter(x -> x>=5)
                .count();
        System.out.println("count : " + countList);

        // Short-Circuit operations
        // 5. anyMatch (if any element meets the condition inside anyMatch then it will return true or else false, return boolean)
        boolean anyMatchList = list
                .stream()
                .anyMatch(x -> x % 2 == 0);
        System.out.println("anyMatch : " + anyMatchList);

        // 6. allMatch (if all element meets the condition inside allMatch then it will return true or else false, return boolean)
        boolean allMatchList = list
                .stream()
                .allMatch(x -> x % 2 == 0);
        System.out.println("allMatch : " + allMatchList);

        // 7. noneMatch (if no element meets the condition inside noneMatch then it will return true or else false, return boolean)
        boolean noneMatchList = list
                .stream()
                .noneMatch(x -> x % 2 == 0);
        System.out.println("noneMatch : " + noneMatchList);

        // 8. findFirst
        Optional<Integer> findFirstList = list
                .stream()
                .skip(3)
                .findFirst();                                    // It will give first number after mentioned skip number
        System.out.println("findFirst : " + findFirstList);      // it will return optional result like Optional[4]

        Integer findFirstByInt = findFirstList.get();   // it will return result in Integer like 4
        System.out.println(findFirstByInt);

        // 8. findAny-
        Optional<Integer> findAnyList = list
                .stream()
                .skip(3)
                .findAny();                 // It will get any random number from collection
        System.out.println("findAny : " + findAnyList);

        // 9. toArray (use to convert Stream to an array)
        Object[] array = Stream
                .of(1, 2, 3)
                .toArray();
        for (Object i : array){
            System.out.println(i);
        }

        // 10. max
        Optional<Integer> maxNumber = Stream
                .of(2, 44, 70)
                .max(Comparator.naturalOrder());
        System.out.println("max : " + maxNumber);
        Integer max = maxNumber.get();
        System.out.println(max);

        // 10. max
        Optional<Integer> minNumber = Stream
                .of(2, 44, 70)
                .min(Comparator.naturalOrder());
        System.out.println("min : " + minNumber);
        Integer min = minNumber.get();
        System.out.println(min);

        // 11. forEachOrdered on parallelStream
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums
                .parallelStream()
                .forEach(x -> System.out.println("forEach with parallel : " + x));
        nums
                .parallelStream()
                .forEachOrdered(x -> System.out.println("forEachOrdered with parallel : " + x));    // It will maintain the order


        // Stateless and Stateful operations
        // Stateless - Stateless operations are stream operations where each element is processed independently, without remembering or depending on previously seen elements. (e.g. Checking each student’s height individually). Like map(), filter(), peek(), flatMap(), mapToInt(), mapToLong(), mapToDouble(), boxed()
        // Stateful : Stateful operations are stream operations where processing an element depends on previously processed elements or requires maintaining internal state. (Ranking students by height (need all data first)). Like distinct(), sorted(), limit(), skip(), takeWhile(), dropWhile()
    }
}

// Optional<T> in Java is a container object that may or may not contain a value, used mainly as a method return type to avoid NullPointerException.