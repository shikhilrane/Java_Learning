package _11_Loops._08_Problems._01_Normal_Problems._06_Factorial_of_Number;

// Q. Factorial of the series

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = scn.nextInt();
        int n = num;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        // Another way without taking user input
        int mul = 1;
        for (int i = 1; i <= 5; i++) {
            mul = mul * i;
        }
        System.out.println("Factorial of 5 is " + mul);
    }
}

/*

        Input: 5

        1.num = 5
        2.n = 5
        3.factorial = 1

        Iteration 1:
        •i = 1
        •factorial = 1 * 1 = 1

        Iteration 2:
        •i = 2
        •factorial = 1 * 2 = 2

        Iteration 3:
        •i = 3
        •factorial = 2 * 3 = 6

        Iteration 4:
        •i = 4
        •factorial = 6 * 4 = 24

        Iteration 5:
        •i = 5
        •factorial = 24 * 5 = 120

        Output: factorial = 120
 */