package _26_Java_Stream._01_Intro_To_Java_Streams_and_Advantages_Over_Java_7;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        // Functional Programming OR Functional Interface OR Lambda Expression
        MathOperation sumOperation = (a,b) -> a+b;  // This is functional programming because we treat function as a variable
        int operate = sumOperation.operate(3, 4);
        System.out.println(operate);

        MathOperation subOperation = (a,b) -> a-b;
        int operate1 = subOperation.operate(6, 4);
        System.out.println(operate1);


        // Predicate (It Holds a condition) (it gives true or false)
        // 1 Integer
        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println(isEven.test(5));
        // 2 StringClass starting with
        Predicate<String> isWordStartingWithS = x -> x.startsWith("S");
        System.out.println(isWordStartingWithS.test("Shikhil"));
        // 3 StringClass ending with
        Predicate<String> isWordSEndingWithE = x -> x.endsWith("e");
        System.out.println(isWordSEndingWithE.test("Rane"));
        // 4 and operation
        Predicate<String> and = isWordStartingWithS.and(isWordSEndingWithE); // If any letter of given string is not equal to both predicates then it will return false
        System.out.println(and.test("Shikhil"));
        // 5 or operation
        Predicate<String> or = isWordStartingWithS.or(isWordSEndingWithE);  // If any letter of given string is equal to both predicates then it will return true
        System.out.println(or.test("Shikhil"));


        // Function (same as Predicate, but It returns the value)
        // 1 Integer operation
        Function<Integer, Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.apply(5));
        Function<Integer, Integer> tripleIt = x -> x * 3;
        System.out.println(tripleIt.apply(6));
        // 2 andThen
        System.out.println(doubleIt.andThen(tripleIt).apply(4));    // doubleIt = 4 * 2 = 8 andThen tripleIt = 8 * 3 = 24
        // 3 compose
        System.out.println(doubleIt.compose(tripleIt).apply(7));    // tripleIt = 4 * 3 = 12 compose doubleIt = 12 * 2 = 24
        // 4 identity (It returns same number given in input. We will see use of this in Streams)
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(5));


        // Consumer (Functional Interface, It doesn't return anything)
        // 1 Single Integer Consumer
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(8);
        // 2 Consume Array
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for(int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);
        // 3 andThen
        Consumer<Integer> consumer1 = x -> System.out.println("First: " + x);
        Consumer<Integer> consumer2 = x -> System.out.println("Second: " + (x * 2));
        Consumer<Integer> combinedConsumer = consumer1.andThen(consumer2);
        combinedConsumer.accept(5);


        // Supplier (Functional Interface)
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());


        // Combined Example of Predicate, Function, Consumer and Supplier
        Predicate<Integer> predicate = x -> x%2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer3 = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer3.accept(function.apply(supplier.get()));
        }
        // Breakdown - if(100 -> 100 % 2 == 0) {System.out.println(100 = 100 * 100)} = 10000


        // BiPredicate (Accepts two parameter)
        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y) % 2 == 0;
        System.out.println(isSumEven.test(5,13));
        // BiFunction (Accepts two parameter)
        BiFunction<String, String, Integer> biFunction = (x,y) -> (x+y).length();
        System.out.println(biFunction.apply("Shikhil", "Rane"));
        // BiConsumer (Accepts two parameter)
        BiConsumer<Integer, String> biConsumer = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(4, "Shikhil");

        // UnaryOperator (It is a Function. It provides writing comfort than Function when we know it give and provide same data type like Integer)
        UnaryOperator<Integer> unaryOperator = x -> x*2;
        System.out.println(unaryOperator.apply(3));

        // BinaryOperator (It is a BiFunction. It provides writing comfort than BiFunction when we know it give and provide same data type like Integer)
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y;
        System.out.println(binaryOperator.apply(3,4));

        // Method Reference (Use method without invoking & in place of lambda expression)
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);  // Converting direct variable like this. Method Referencing

        // Constructor Reference
        List<String> names = Arrays.asList("Apple", "Samsung", "OnePlus");
        List<MobilePhone> mobilePhoneList = names
                .stream()
                .map(x -> new MobilePhone(x))
                .collect(Collectors.toList());  // We will see this later
    }
}

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}

class MobilePhone{
    String name;
    public MobilePhone(String name) {
        this.name = name;
    }
}