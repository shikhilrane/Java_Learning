package _11_Loops._03_while_loop.WhileLoopProblems;

import java.util.Scanner;

public class SumofFirstEvenNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number ");
        int num = scn.nextInt();
        int i = 0;
        int sum = 0;
        while (i<=num) {
            sum = (sum+(2*i));
            System.out.println(sum);
            i++;
        }
    }
}
