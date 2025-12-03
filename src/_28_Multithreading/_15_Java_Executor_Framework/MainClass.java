package _28_Multithreading._15_Java_Executor_Framework;

public class MainClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // It gives total MilliSeconds count from 1 January 1970
        Thread[] threads = new Thread[10]; // Corrected array size and name. Created 10 threads a time

        for (int i = 1; i <= 10; i++) {
            int finalI = i; // Needed because lambdas can only use final or effectively final variables from outer scope
            threads[i - 1] = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println("Factorial of " + finalI + " is " + result);
            });
            threads[i - 1].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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

/*
    Here,
    1. We are creating threads and writing a logic too.
    2. But we only have to do work of writing a business logic and java will handle the threading issue. thats all about executor framework
    3. Also we not reusing threads, because we created 10 threads to calculate factorial of 10 number. We can do this by using executor framework.
*/