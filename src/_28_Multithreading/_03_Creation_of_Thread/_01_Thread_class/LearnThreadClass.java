package _28_Multithreading._03_Creation_of_Thread._01_Thread_class;

public class LearnThreadClass {
    public static void main(String[] args) {
        SecondLearnThreadClass sct = new SecondLearnThreadClass();  // 4.
        sct.start();                                                // 5.

        for (int i = 0; i < 100000; i++) {                          // 6
            System.out.println("First Class");
        }
    }
}

/*
    1. Created a separate thread in SecondLearnThreadClass class that extends Thread class to create Thread.
    2. Implemented a run method of Thread class.
    3. Created a for loop in it that prints a statement multiple time
    4. Created an object of SecondLearnThreadClass class in this class.
    5. Started a thread with object_name.start() method.
    6. Created a for loop that prints some statement multiple times

    When we run this program both statements will run simultaneously i.e. sometimes statement of this file will print and sometimes statement of that file print again sometimes statement of this file will print and so on. This is how multithreads do work.
    if we executed two for loop in without creating other thread, then second loop will get printed only and only after execution of first loop gets completed.
*/