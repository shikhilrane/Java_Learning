package _11_Loops._08_Problems._01_Normal_Problems._05_Sum_Of_Series;

// Q. sum of series like (1-2+3-4....)

import java.util.*;

public class seriesSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scn.nextInt();
        int num1 = num;
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            if (i%2==0) {
                sum = sum - i;
            }else {
                sum = sum + i;
            }
            System.out.print(i);
        }
        System.out.println(sum);

        // Another way without taking user input
        int sumOfSeries = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                sumOfSeries = sumOfSeries - i;
            }
            else {
                sumOfSeries = sumOfSeries + i;
            }
        }
        System.out.println(sumOfSeries);
    }
}

/*
Dry run karte hain:

Input: 5

    1.num = 5
    2.num1 = 5
    3.sum = 0

    Iteration 1:
    •i = 1
    •i % 2 != 0, toh sum = sum + i = 0 + 1 = 1

    Iteration 2:
    •i = 2
    •i % 2 == 0, toh sum = sum - i = 1 - 2 = -1

    Iteration 3:
    •i = 3
    •i % 2 != 0, toh sum = sum + i = -1 + 3 = 2

    Iteration 4:
    •i = 4
    •i % 2 == 0, toh sum = sum - i = 2 - 4 = -2

    Ab i == num1 (5) hai, toh loop khatam.

    Output: sum = -2

 */