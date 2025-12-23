package _26_Java_Stream._06_Stream_Examples;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
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
