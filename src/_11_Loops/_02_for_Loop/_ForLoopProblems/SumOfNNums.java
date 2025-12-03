package _11_Loops._02_for_Loop._ForLoopProblems;

import java.util.Scanner;

public class SumOfNNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number till which you want to add : ");
        int num = scn.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.println(sum + " + " + i + " = " + (sum = sum + i));
        }
        System.out.println(sum);
        int avg = sum/num;
        System.out.println("Average " + " = " + sum + " / " + num + " = " + avg);
    }
}
