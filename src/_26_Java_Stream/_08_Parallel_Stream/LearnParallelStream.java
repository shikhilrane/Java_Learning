package _26_Java_Stream._08_Parallel_Stream;

// A type of stream that enables parallel processing of elements
// Allowing multiple threads to process parts of the stream simultaneously
// This can be significantly improves performance for large data sets
// Parallel Streams are most effective for CPU-intensive or large datasets where tasks are independent i.e. Stateless
// They may add overhead for simple tasks or small datasets

import java.util.List;
import java.util.stream.Stream;

public class LearnParallelStream {
    public static void main(String[] args) {
        // Factorial (Parallel Stream on Stateless Operation)
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream
                .iterate(1, x -> x + 1)
                .limit(20000)
                .toList();

        List<Long> factorialList = list
                .stream()
                .map(x -> factorial(x))
                .toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream : " + (endTime-startTime) + " ms");

        startTime = System.currentTimeMillis();
        factorialList = list
                .parallelStream()
                .map(x -> factorial(x))
                .toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream : " + (endTime-startTime) + " ms");

        // Parallel stream doesn't work in Stateful operations because multi-threads will change results to different manner
    }

    private static long factorial(int n){
        long result = 1;
        for(int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
