package _11_Loops._03_while_loop.WhileLoopProblems;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number to which which you want to print number : ");
        int num = scn.nextInt();
        System.out.println("Enter number from which you want to print number : ");
        int i = scn.nextInt();

        while (i>=num) {
            System.out.println(i);
            i--;
        }
    }
}
