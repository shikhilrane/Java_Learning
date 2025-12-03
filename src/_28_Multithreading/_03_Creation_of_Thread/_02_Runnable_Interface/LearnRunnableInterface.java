package _28_Multithreading._03_Creation_of_Thread._02_Runnable_Interface;

public class LearnRunnableInterface {
    public static void main(String[] args) {
        SecondLearnRunnableInterface slri = new SecondLearnRunnableInterface();     // 4.
        Thread t1 = new Thread(slri);                                               // 5.
        t1.start();                                                                 // 6.

        for (int i = 0; i < 100000; i++) {                                          // 7.
            System.out.println("First Class");
        }
    }
}

/*
    1. Created a separate thread in SecondLearnRunnableInterface class that Implements Runnable Interface to create Thread.
    2. Implemented a run method of Thread class.
    3. Created a for loop in it that prints a statement multiple time
    4. Created an object of SecondLearnRunnableInterface class in this class.
    5. Created an object of Thread class and passes object of SecondLearnRunnableInterface class in its constructor.
    6. Started a thread with object_name.start() method.
    7. Created a for loop that prints some statement multiple times

    When we run this program both statements will run simultaneously i.e. sometimes statement of this file will print and sometimes statement of that file print again sometimes statement of this file will print and so on. This is how multithreading do work.
    if we executed these two loops without creating other thread, then second loop will get printed only and only after execution of first loop gets completed.
*/