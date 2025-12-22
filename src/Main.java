import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = (a,b) -> a+b;
        System.out.println(sum.operate(32,54));

        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println(isEven.test(6));

        Predicate<String> fName = x -> x.startsWith("S");
        System.out.println(fName.test("Shikhil"));

        Predicate<String> lName = x -> x.endsWith("e");
        System.out.println(lName.test("Rane"));

        Predicate<String> and = fName.or(lName);
        System.out.println(and.test("Shikhil"));

        Function<Integer, Integer> doubleIt = x -> x*2;
        System.out.println(doubleIt.apply(5));

        Function<Integer, Integer> tripleIt = x -> x*3;
        System.out.println(tripleIt.apply(6));

        System.out.println(doubleIt.andThen(tripleIt).apply(4));

        System.out.println(doubleIt.compose(tripleIt).apply(4));

        Consumer<String> name = x -> System.out.println(x);
        name.accept("Shikhil");

        List<Integer> nums = Arrays.asList(3,5,6,4,2);
        Consumer<List<Integer>> consumerNums = x -> {
          for (int n : x){
              System.out.println(n);
          }
        };
        consumerNums.accept(nums);

        Consumer<Integer> num1 = x -> System.out.println(x);
        Consumer<Integer> num2 = x -> System.out.println(x*2);
        Consumer<Integer> consumed = num1.andThen(num2);
        consumed.accept(5);

        Supplier<Integer> supp = () -> 5;
        System.out.println(supp.get());

        Predicate<Integer> predicate = x -> x%2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer3 = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        List<Integer> numbers = Arrays.asList(3,5,6,4,2);
        int count = 0;
        for (int i : numbers){
            if (i%2 == 0){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(
                numbers
                .stream()
                .filter(x -> x % 2 ==0)
                .collect(Collectors.toList())
        );

        Stream<String> streamOfLetters = Stream.of("a", "b", "c", "a", "a");
        System.out.println(streamOfLetters.filter(x -> x=="a").collect(Collectors.toSet()));

    }
}

interface MathOperation{
    int operate(int a, int b);
}