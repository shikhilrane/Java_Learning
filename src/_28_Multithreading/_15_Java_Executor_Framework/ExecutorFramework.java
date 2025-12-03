package _28_Multithreading._15_Java_Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // It gives total MilliSeconds count from 1 January 1970

        ExecutorService executorService = Executors.newFixedThreadPool(5);  // 5 thread will work simultaneously on given task

        for (int i = 1; i <= 10; i++) {     // Created a loop that will run 10 times
            int finalI = i;
            executorService.submit(() -> {
                long result = factorial(finalI);
                System.out.println("Factorial of " + finalI + " is " + result);
            });
        }

        executorService.shutdown();
        try {
            while (!(executorService.awaitTermination(100, TimeUnit.MILLISECONDS))){
                System.out.println("waiting for termination...");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time to generate factorial = " + (System.currentTimeMillis() - startTime) + " MilliSeconds");
    }

    public static long factorial(int n) {
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
