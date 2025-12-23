package _26_Java_Stream._09_Collectors;

// Collectors is a utility class (Used in terminal operation of collect)
// Provides a set of methods to create common collectors

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        // Partitioning elements
        // Partitions elements into two groups (true or false) based on a predicate
        List<String> animals = Arrays.asList("Monkey", "Cat", "Dog", "Elephant", "Tiger");
        Map<Boolean, List<String>> collectPartitioning = animals
                .stream()
                .collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(collectPartitioning);

        // Mapping and Collecting
        // Applies a mapping function before collecting (Shortcut for map method)
        List<String> mappingAndCollecting = animals
                .stream()
                .collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println(mappingAndCollecting);

        // EXAMPLES
        // Example 1 : Collecting Names by length
        List<String> eg1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        Map<Integer, List<String>> collectEg1 = eg1
                .stream()
                .collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collectEg1);

        // Example 2 : Counting Words occurrences
        String sentence = "hello world hello java world";
        Map<String, Long> collectWords = Arrays
                .stream(sentence.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collectWords);

        // Example 3 : Partitioning Even and Odd numbers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collectEvenOdd = integerList
                .stream()
                .collect(Collectors.partitioningBy(x -> x%2 == 0));
        System.out.println(collectEvenOdd);

        // Example 4 : Summing Values in a Map
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        int reducedItems = items
                .values()
                .stream()
                .reduce(0, (x, y) -> x + y);
                        //  OR
                // collect.(Collector.summingInt(x -> x));
        System.out.println(reducedItems);

        // Example 5 : Creating a Map from stream Elements
        List<String> froots = Arrays.asList("Apple", "Banana", "Cherry");
        Map<String, Integer> collectAsList = froots
                .stream()
                .collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length()));
        System.out.println(collectAsList);

        // Example 6 :
        List<String> fruts = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Apple");
        Map<String, Integer> collectfruts = fruts
                .stream()
                .collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(collectfruts);

    }
}
