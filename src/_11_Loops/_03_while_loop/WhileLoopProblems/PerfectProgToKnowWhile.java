package _11_Loops._03_while_loop.WhileLoopProblems;

import java.util.Scanner;

public class PerfectProgToKnowWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("have you learnt? : ");
        boolean learn = scn.nextBoolean();                                  // 1.

        while (learn==false) {                                              // 2.  4.
            System.out.println("You haven't learnt yet");
            learn = scn.nextBoolean();                                      // 3.  5.
        }
        System.out.println("now you have learnt everything");
    }
}

/*
    1. it is a initialisation of the program.
    2. it will check if entered value satisfies the loop
    3. it will enter in loop and ask again for the input
    4. it will check if user entered satisfied value for the loop
    5. it will enter in loop and will ask again for input
        this process will be continue till user enter a value that doesn't satisfy loop
*/