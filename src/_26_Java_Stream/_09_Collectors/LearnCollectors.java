package _26_Java_Stream._09_Collectors;

// Collectors is a utility class (Used in terminal operation of collect)
// Provides a set of methods to create common collectors

import java.util.*;
import java.util.stream.Collectors;

public class LearnCollectors {
    public static void main(String[] args) {
        //
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        List<String> collectInList = names
                .stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(collectInList);

        //
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,5);
        Set<Integer> collectInSet = numbers
                .stream()
                .collect(Collectors.toSet());
        System.out.println(collectInSet);

        //
        List<String> cities = Arrays.asList("Amd", "Blr", "Chd", "Del");
        ArrayList<String> collectInCollection = cities
                .stream()
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(collectInCollection);

        // Joining Strings
        List<String> fruits = Arrays.asList("Apple", "Banana", "Chile", "Date");
        String collectInJoining = fruits
                .stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(collectInJoining);

        // Summarizing Data
        List<Integer> numberss = Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics collectInSummarizingInt = numberss
                .stream()
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println(collectInSummarizingInt);

        // Calculating Average
        List<Integer> numbersss = Arrays.asList(2,3,5,7,11);
        Double collectInAveragingInt = numbersss
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(collectInAveragingInt);

        // Counting
        List<Integer> numberssss = Arrays.asList(2,3,5,7,11);
        Long collectCounting = numberssss
                .stream()
                .collect(Collectors.counting());
        System.out.println(collectCounting);

        // Grouping Elements
        List<String> words = Arrays.asList("Hello", "World", "Java", "Stream", "Collecting");
        Map<Integer, List<String>> collectGroupingBy = words
                .stream()
                .collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collectGroupingBy);

        Map<Integer, String> collectGroupingByJoining = words
                .stream()
                .collect(Collectors.groupingBy(x -> x.length(), Collectors.joining(" ")));
        System.out.println(collectGroupingByJoining);

        Map<Integer, Long> collectGroupingByCounting = words
                .stream()
                .collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));
        System.out.println(collectGroupingByCounting);

        TreeMap<Integer, Long> collectGroupingByCountingTreeMap = words
                .stream()
                .collect(Collectors.groupingBy(x -> x.length(), () -> new TreeMap<>(), Collectors.counting()));
        System.out.println(collectGroupingByCountingTreeMap);

        //

    }
}
