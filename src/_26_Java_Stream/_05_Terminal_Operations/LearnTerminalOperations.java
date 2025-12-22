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
                .findFirst();                   // It will give first number after mentioned skip number
        System.out.println(findFirstList);      // it will return optional result like Optional[4]

        Integer findFirstByInt = findFirstList.get();   // it will return result in Integer like 4
        System.out.println(findFirstByInt);

        // 8. findAny-
        Optional<Integer> findAnyList = list
                .stream()
                .skip(3)
                .findAny();                 // It will get any random number from collection
        System.out.println(findAnyList);

        // Stream Example :
        // Example 1 : Filtering and collecting names according to condition
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        List<String> nameLength = names
                .stream()
                .filter(x -> x.length()>4)
                .toList();
        System.out.println(nameLength);

        // Example 2 : squaring and sorting numbers
        List<Integer> numbers = Arrays.asList(5,2,9,1,6);
        List<Integer> squareAndSort = numbers
                .stream()
                .map(x -> x * x)
                .sorted()
                .toList();
        System.out.println(squareAndSort);

        // Example 3 : Summing Values
        List<Integer> numberss = Arrays.asList(1,2,3,4,5);
        int summed = numberss
                .stream()
                .reduce(0,(x,y) -> x+y);
        System.out.println(summed);

        // Example 4 : Counting Occurrences of a Character
        String sentence = "Hello World";
        long countChar = sentence
                .chars()
                .filter(x -> x == 'l')
                .count();
        System.out.println(countChar);
    }
}

// Optional<T> in Java is a container object that may or may not contain a value, used mainly as a method return type to avoid NullPointerException.