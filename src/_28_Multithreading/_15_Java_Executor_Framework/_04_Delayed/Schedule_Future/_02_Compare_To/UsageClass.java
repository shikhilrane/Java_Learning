package _28_Multithreading._15_Java_Executor_Framework._04_Delayed.Schedule_Future._02_Compare_To;

public class UsageClass {

    public static void main(String[] args) throws InterruptedException {
        // Create two delayed tasks with different delays
        CompareToMethodExample task1 = new CompareToMethodExample(3000); // 3 seconds delay
        CompareToMethodExample task2 = new CompareToMethodExample(5000); // 5 seconds delay

        // Compare task1 to task2
        int comparison = task1.compareTo(task2);
        if (comparison < 0) {
            System.out.println("Task1 is scheduled before Task2");
        } else if (comparison > 0) {
            System.out.println("Task1 is scheduled after Task2");
        } else {
            System.out.println("Task1 and Task2 are scheduled at the same time");
        }

        // Sleep for 4 seconds to show delay difference in startTime
        Thread.sleep(4000);

        // Create new tasks again with different delays to test compareTo after some time
        CompareToMethodExample task3 = new CompareToMethodExample(2000);
        CompareToMethodExample task4 = new CompareToMethodExample(2000);

        comparison = task3.compareTo(task4);
        if (comparison < 0) {
            System.out.println("Task3 is scheduled before Task4");
        } else if (comparison > 0) {
            System.out.println("Task3 is scheduled after Task4");
        } else {
            System.out.println("Task3 and Task4 are scheduled at the same time");
        }
    }
}
