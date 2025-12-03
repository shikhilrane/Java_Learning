package _11_Loops._08_Problems._01_Normal_Problems._03_Sum_of_Digits;

// Q. Find the sum of digits of number n

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scn.nextInt();
        int num = n;
        int sum = 0;

        while (num>0) {
            int lastDigit = num%10;
            sum = sum + lastDigit;
            num = num/10;
        }
        System.out.println(sum);

        // Simpler way without taking user input
        int num1 = 2354;
        int summation = 0;
        while (num1>0){
            int lastDigit = num1%10;
            summation = summation + lastDigit;
            num1 = num1/10;
        }
        System.out.println("Sum of digits of given number = " + summation);
    }
}

/*
    Dry run :-
    1.num = 576
    2.sum = 0

    Iteration 1:
    •lastDigit = 576 % 10 = 6
    •sum = 0 + 6 = 6
    •num = 576 / 10 = 57

    Iteration 2:
    •lastDigit = 57 % 10 = 7
    •sum = 6 + 7 = 13
    •num = 57 / 10 = 5

    Iteration 3:
    •lastDigit = 5 % 10 = 5
    •sum = 13 + 5 = 18
    •num = 5 / 10 = 0

    While loop ends.

    Output: sum = 16

    / = use to reduce number
    % = use to extract last digit

    here,
    int lastDigit = num%10;, we added one more statement here to perform inside operation
    num = num/10; from line number 16 will act as updation
*/