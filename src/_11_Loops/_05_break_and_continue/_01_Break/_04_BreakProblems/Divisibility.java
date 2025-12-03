package _11_Loops._05_break_and_continue._01_Break._04_BreakProblems;

public class Divisibility {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("Found answer : " + i);
                break;
            }
            i++;
        }
    }
}

/*
    Dry Run (step-by-step values of i):
        i = 1 → 1 % 5 != 0 → not divisible → increment → i = 2
        i = 2 → not divisible by 5 or 7 → increment → i = 3
        i = 3 → not divisible → increment → i = 4
        i = 4 → not divisible → increment → i = 5
        i = 5 → divisible by 5 but not by 7 → increment → i = 6
        i = 6 … 34 → none divisible by both 5 and 7
        i = 35 →
                35 % 5 == 0
                35 % 7 == 0
                → condition is true → print "Found answer : 35" → break loop.
*/