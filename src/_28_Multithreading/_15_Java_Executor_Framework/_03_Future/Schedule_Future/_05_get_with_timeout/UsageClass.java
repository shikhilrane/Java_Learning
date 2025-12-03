package _28_Multithreading._15_Java_Executor_Framework._03_Future.Schedule_Future._05_get_with_timeout;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class UsageClass {
    public static void main(String[] args) {
        GetWithTimeoutExample<String> future = new GetWithTimeoutExample<>("Result ready!", 2000);

        try {
            System.out.println("Trying to get result with 3 seconds timeout...");
            String result = future.get(3, TimeUnit.SECONDS);  // should succeed
            System.out.println("Got result: " + result);
        } catch (TimeoutException e) {
            System.out.println("TimeoutException caught: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Trying to get result with 1 second timeout...");
            String result = future.get(1, TimeUnit.SECONDS);  // should throw TimeoutException
            System.out.println("Got result: " + result);
        } catch (TimeoutException e) {
            System.out.println("TimeoutException caught: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
