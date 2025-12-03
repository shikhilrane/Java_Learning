package _11_Loops._08_Problems._01_Normal_Problems._07_Power_of_Number;

// Q. Calculate the power of a as b (i.e. a^b)

import java.util.Scanner;

public class powerNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter value for base number : ");
        int n1 = scn.nextInt();
        System.out.println("Enter value for power number : ");
        int n2 = scn.nextInt();
        int result = 1;

        for (int i = 1; i <= n2; i++) {
            result = result*n1;
            System.out.println(result);
        }
        System.out.println(n1 + " to the power of " + n2 + " is " + result);

        System.out.println();

        // Another way without taking user input
        int base = 2;
        int power = 5;
        int ans = 1;
        int i = 1;

        while (i<= power){
            ans = ans * base;
            i++;
        }
        System.out.println("Base 2 to power of 5 = " + ans);
    }
}

/*
    Dry run

    Enter number for base number : 2
    Enter number for power number: 5

    Program flow:

    1.n1 = 2
    2.n2 = 5
    3.result = 1

    Iteration 1:
    •i = 1
    •result = 1 * 2 = 2

    Iteration 2:
    •i = 2
    •result = 2 * 2 = 4

    Iteration 3:
    •i = 3
    •result = 4 * 2 = 8

    Iteration 4:
    •i = 4
    •result = 8 * 2 = 16

    Iteration 5:
    •i = 5
    •result = 16 * 2 = 32

    Output:

    2 to the power of 5 is 32
 */