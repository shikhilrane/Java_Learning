package _11_Loops._03_while_loop.WhileLoopProblems;

import java.util.Scanner;

public class SumOfFirstNNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter upto which you want to print the sum : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {        // initially i will be 1 & n will be input by user
            sum = sum + i;      //initially sum = 0 & then we add value of i i.e. 1
            i++;        // then we increment value of counter i by one then again it will go up to check condition if it satisfies then it will execute again & as soon as that condition fails to satisfy then it will exit from the loop and print the final sum
        }

        System.out.print("sum = " + sum + "\n");
    }
}
